import java.util.Scanner;

public class LastDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int number = 0;
        int poslZifraKv = 0;

        number = readFromConsole();
        poslZifraKv = calculate(number);
        printResult(number,poslZifraKv);
    }

    public static int readFromConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = 0;
        if (sc.hasNextInt()) {
            number = sc.nextInt();
        }
        return number;
    }

    public static int calculate(int number){
        int poslZifraKv = 0;
        int poslZifra;
        poslZifra = number % 10;
        switch (poslZifra) {
            case 0:
                poslZifraKv = 0;
                break;
            case 1:
                poslZifraKv = 1;
                break;
            case 2:
                poslZifraKv = 4;
                break;
            case 3:
                poslZifraKv = 9;
                break;
            case 4:
                poslZifraKv = 6;
                break;
            case 5:
                poslZifraKv = 5;
                break;
            case 6:
                poslZifraKv = 6;
                break;
            case 7:
                poslZifraKv = 9;
                break;
            case 8:
                poslZifraKv = 4;
                break;
            case 9:
                poslZifraKv = 1;
                break;
            default:
                System.out.println("Что-то не то с программой.");
        }
        return poslZifraKv;
    }

       public static void printResult(int number,int poslZifraKv) {
        System.out.println("Последняя цифра квадрата числа " + number + " равняется " + poslZifraKv);

}
    }