import java.util.Scanner;

public class Line01 {

    public static void main(String[] args) {
        int number = 0;

        number = readFromConsole();
        calculate(number);
    }

    public static int readFromConsole() {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        System.out.println("Введите число: ");
        if (sc.hasNextInt()) number = sc.nextInt();

        return number;
    }

    public static void calculate(int number) {
        int digit = 0;
        while (number != 0) {
            digit = number % 10;
            number = number / 10;
            if (digit % 2 == 0) {
                System.out.println("В числе есть чётная цифра.");
                return;
            }
            System.out.println("В числе нет чётных цифр.");
        }
    }
}

