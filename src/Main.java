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

        //Простой replace()
        System.out.println("Данные ФИО сотрудника — " + fullName.replace('ё', 'е'));

        //Использованы split(), contains()
        String[] splitFullName = fullName.split("");
        for (int i = 0; i < splitFullName.length; i++) {
            if (splitFullName[i].contains("ё")) {
                splitFullName[i] = "е";
            }
        }
        String splitToString = String.join("", splitFullName);
        System.out.println("Данные ФИО сотрудника — " + splitToString);

    }

}