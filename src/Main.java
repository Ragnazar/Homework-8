package src;

public class Main {
    public static void main(String[] args) {
        task2(task1());
        task3(task1());
    }
    public static String task1() {
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String firstName = "Ivan";

        String fullName = lastName + " " + firstName + " " + middleName;
        return fullName;
    }
    private static void task2(String fullName) {
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }
    private static void task3(String fullName) {
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName.replace('ё', 'е'));
    }

}