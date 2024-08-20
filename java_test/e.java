package java_test;

import java.util.Scanner;

public class e {
    public static void main(String[] args) {

        // 이 부분에 code를 작성해주세요!
        // 이 부분에 code를 작성해주세요!
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int month = scanner.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            if (month == 2) {
                System.out.println("29");
            }else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("30");
            }else{
                System.out.println("31");
            }
        }else {
            if (month == 2) {
                System.out.println("28");
            }else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("30");
            }else{
                System.out.println("31");
            }
        }

        scanner.close();

    }

}