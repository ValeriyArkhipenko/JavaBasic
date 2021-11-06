/**
 * Java 1. Homework 5
 * 
 * @author ValeriyArkhipenko
 * @version 1.11.2021
 */

public class Lesson5Homework {

    public static void main(String[] args) {
        Person[] personDB = new Person[7];
        personDB[0] = new Person(" Столяров Роман Петрович", "ГенДир", "stolyarov.r@mail.ru", "+78001234560", 150000, 45);
        personDB[1] = new Person(" Петров Петр Петрович", "СтаршийЗам", "petrov.p@mail.ru", "+78001234561", 90000, 33);
        personDB[2] = new Person(" Сидоров Сидр Сидорович", "СтаршийСпециалист", "sidorov.s@mail.ru", "+78001234562", 60000, 30);
        personDB[3] = new Person(" Ульянова Владилена Владимировна", "ГлавБух", "ulyanova.v@mail.ru", "+78001234563", 110000, 50);
        personDB[4] = new Person(" Старшов Владимир Владимирович", "ТехДир", "starshov.v@mail.ru", "+78001234564", 100000, 39);
        personDB[5] = new Person(" Ветрянкина Елена Сергеевна", "Менеджер", "vetryankina.i@mail.ru", "+78001234565", 50000, 35);
        personDB[6] = new Person(" Новичков Семен Семенович", "Стажер", "novichkov.s@mail.ru", "+78001234566", 20000, 20);

        for (Person i : personDB) {
            if (i.getAge() > 40) System.out.println(i);
        }
    }
}

class Person {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    Person(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    int getAge() {
        return age;
    }

    public String toString() {
        return fullName + " || " + position + " || " + email + " || " + phone + " || " + salary + " || " + age;
    }
}