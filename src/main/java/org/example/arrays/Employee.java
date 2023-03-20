package org.example.arrays;


public class Employee {
    private String fio;
    int salary;
    private int age;
    private String position;
    private int phone;


    private static Employee[] employeesArr = new Employee[20];


    public Employee(String fio, int salary, int age, String position, int phone) {
        this.fio = fio;
        this.salary = salary;
        this.age = age;
        this.position = position;
        this.phone = phone;
    }

    //    2. Конструктор класса должен заполнять эти поля при создании объекта;
    Employee(String fio, int salary, int age, int phone, String position ) {

        //    8. *** Продумать конструктор таким образом, чтобы при создании каждому сотруднику
        // присваивался личный уникальный идентификационный порядковый номер
        this.fio = fio;
        this.salary = salary;
        this.age = age;
        this.phone = phone;
        this.position = position;

    }



    //    3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    public String getFio(){
        return fio;
    }

    public int getSalary(){
        return salary;
    }

    public int getAge() { return age; }

    public String getPosition() { return position; }

    public int getPhone() { return phone; }

    public static Employee[] getEmployeesArr() { return employeesArr;}

    public static void increaseSalary() {
        for(int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i] != null && employeesArr[i].getAge() > 45)
                employeesArr[i].salary += 5000;
        }
    }




}








