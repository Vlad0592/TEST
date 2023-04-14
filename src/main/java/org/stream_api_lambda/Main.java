package org.stream_api_lambda;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    private static final int WOMAN_AGE_LIMIT = 25;
    private static final int MAN_AGE_LIMIT = 20;

    public static void main(String[] args) {

        List<Human> runners = new ArrayList<>(Arrays.asList(

                new Man("Влад", 25),
                new Man("Леонид", 46),
                new Man("Сергей", 54),
                new Man("Матвей", 38),
                new Woman("Лена", 17),
                new Woman("Лариса", 44),
                new Woman("Светлана", 25),
                new Woman("Люда", 38)
        ));

        Predicate<Human> olderThen20 = human -> human.getAge() >= MAN_AGE_LIMIT;
        Predicate<Human> olderThen25 = human -> human.getAge() >= WOMAN_AGE_LIMIT;
        Predicate<Human> isMan = human -> human instanceof Man;
        Predicate<Human> isWoman = human -> human instanceof Woman;

        Predicate<Human> manOver20 = isMan.and(olderThen20);
        Predicate<Human> womanOver25 = isWoman.and(olderThen25);

        System.out.println("К забегу готовы:");
        List<String> list = runners.stream()
                .filter(manOver20.or(womanOver25))
                .map(p -> p.getName().toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}
