package org.example.interface1;

public class ConsoleOutputProvider implements IOutputProvider{
    //Вывод информации в консоль
    public void print(String message) {
        System.out.println(message);
    }
}
