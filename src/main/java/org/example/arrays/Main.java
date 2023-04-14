package org.example.arrays;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        // Task1
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));


        // Task 2
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");

        }

        int[] array1 = {41, 38, 53, 245, 348, 555, 7};
        int max = array1[0];
        int min = array1[0];
        for (int i = 0; i != array1.length; i++) {
            if (array[i] > max) {
                max = array1[i];
            }
            if (array1[i] < min) {
                min = array1[i];
            }
        }
        System.out.println(min + " " + max);


     Employee people = new Employee("Петров Иван Васильевич",34000,23,"Аналитик",895464333);


        System.out.println(people.getFio() + "," +  people.getPosition());


        //    5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        Employee[] employees = new Employee[]{new Employee("Петров Василий Иванович", 55000, 27, "Менеджер", 896704178),
                new Employee("Васюткин Григорий Иванович", 29000, 18, "Строитель", 895643234),
                new Employee("Лаврентий Александр Иванович", 40000, 67, "Рыбак", 892646554),
                new Employee("Речкин Максим Александрович", 29000, 43, "Девопс", 895667634),
                new Employee("Васюткин Григорий Иванович", 29000, 18, "Строитель", 895643234)};



        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                System.out.println("Name: " + employees[i].getFio() + ", salary: " + employees[i].getSalary() +
                        ", age:" + employees[i].getAge());
            }
        }




        System.out.println();

        Employee[] employeesArr = Employee.getEmployeesArr();
        for(int i = 0; i < employeesArr.length; i++){
            if(employeesArr[i] != null) {
                System.out.println("Name: " + employeesArr[i].getFio() + ", salary: " + employeesArr[i].getSalary() +
                        ", age:" + employeesArr[i].getAge());
            }
        }


        System.out.println();
        Employee.increaseSalary();
        for(int i = 0; i < employeesArr.length; i++){
            if(employeesArr[i] != null) {
                System.out.println("Name: " + employeesArr[i].getFio() + ", salary: " + employeesArr[i].getSalary() +
                        ", age:" + employeesArr[i].getAge());
            }
        }

    }

    }












