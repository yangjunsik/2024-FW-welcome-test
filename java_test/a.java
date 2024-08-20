package java_test;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {

        // 이 부분에 code를 작성해주세요!
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        // 세 자리 정수를 역순으로 변환
        int reverseNum = 0;
        while (num != 0) {
            int end_number = num % 10; // 맨 끝자리
            reverseNum = reverseNum * 10 + end_number; // 역순으로 저장
            num /= 10; // 마지막 자리를 제거
        }

        // 출력
        System.out.println(reverseNum);

        scanner.close();
    }

}