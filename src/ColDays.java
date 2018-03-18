import java.util.Scanner;

public class ColDays {

    public static void main(String[] args) {

        int year = 0, month = 0, col_day = 0;

        year = readYear();
        month = readMonth();
        calculate(month, year);
    }

    public static int readYear() {
        Scanner sc = new Scanner(System.in);
        int year = 0;
        System.out.println("Введите год: ");
        if (sc.hasNextInt()) {
            year = sc.nextInt();
        }
        return year;
    }


    public static int readMonth() {
        Scanner sc = new Scanner(System.in);
        int month = 0;
        System.out.println("Введите номер месяца: ");
        if (sc.hasNextInt()) {
            month = sc.nextInt();
        }
        return month;
    }


    public static void calculate(int month, int year) {
        int col_day = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                col_day = 31;
                break;
            case 2:
                if (year % 4 == 0) {
                    col_day = 29;
                } else {
                    col_day = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                col_day = 30;
                break;
        }
        System.out.println("Количество дней равно - " + col_day);
    }
}

