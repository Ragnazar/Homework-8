package src;
import static java.lang.Character.toUpperCase;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        task2(task1());
        task3();
        task4(task1());

        task5(task1());
        task6();
        task7();

        System.out.println();
    }

    public static String task1() {
        String lastName = "ivanov";
        String middleName = "ivanovich";
        String firstName = "ivan";

        return lastName + " " + firstName + " " + middleName;
    }

    private static void task2(String fullName) {
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    private static void task3() {
        String fullName = "Иванов Семён Семёнович";

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

    private static void task4(String fullName) {
        String firstName;
        String middleName;
        String lastName;

        int a = fullName.indexOf(" ");
        int b = fullName.lastIndexOf(" ");

        lastName = fullName.substring(0, a);
        firstName = fullName.substring(a, b);
        middleName = fullName.substring(b);

        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
    }

    private static void task5(String fullName) {
        String rightFullName;
        char[] array = fullName.toCharArray();
        array[0] = toUpperCase(array[0]);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                array[i + 1] = toUpperCase(array[i + 1]);
            }
        }
        rightFullName = String.valueOf(array);
        System.out.printf("Верное написание Ф. И. О. сотрудника с заглавных букв — " + rightFullName);
        System.out.println();
    }

    private static void task6() {
        String first = "135";
        String second = "246";

        int newLength = first.length() + second.length();
        StringBuilder sb = new StringBuilder(newLength);

        for (int i = 0; i < first.length(); i++) {
            sb.append(first.charAt(i));
            sb.append(second.charAt(i));
        }

        System.out.printf("Данные строки — %s", sb);
        System.out.println();
    }

    private static void task7() {
        String strInput = "aabccddefgghiijjkk";
        int strLen = strInput.length();

        for (int i = 0; i < strLen - 2; i++) {
            String char1 = strInput.substring(i, i + 1);
            String char2 = strInput.substring(i + 1, i + 2);
            if (char1.equals(char2)) {
                System.out.print(strInput.charAt(i));
            }
        }
    }
}