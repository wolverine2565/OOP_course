package HomeWorkJava;

import java.util.Scanner;

public class Main {

    public static class main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите номер задания: ");
            int number = in.nextInt();
            switch (number) {
                case 1:
                    System.out.println(" ");
                    break;
                case 2:
                    new Task02();
                    break;
                case 3:
                    new Task03();
                    break;
                case 4:
                    new Task04();
                    break;
//
                default:
                    break;
            }
        }

    }
}