package java_test;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {

        // 이 부분에 code를 작성해주세요!
        Scanner scanner = new Scanner(System.in);

        String st = scanner.next();

        switch(st) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("O");
                break;
            default:
                System.out.println("X");
                break;
        }

        scanner.close();

    }

}