package java_test;

import java.util.Scanner;

public class c {
    public static void main(String[] args) {

        // 이 부분에 code를 작성해주세요!
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        int tall = scanner.nextInt();

        if (age >= 14 || tall >= 160) {
            System.out.println("X");
        } else {
            System.out.println("O");
        }

        scanner.close();
    }

}