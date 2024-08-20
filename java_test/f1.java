package java_test;

import java.util.Scanner;

class Fan {
    private String name;
    private int price;

    public Fan(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }
}

public class f1 {
    public static void main(String[] args) {

        // 이 부분에 code를 작성해주세요!
        Scanner scanner = new Scanner(System.in);

        Fan fan1 = new Fan(scanner.next(), scanner.nextInt());
        Fan fan2 = new Fan(scanner.next(), scanner.nextInt());
        Fan fan3 = new Fan(scanner.next(), scanner.nextInt());

        int min = fan1.getPrice();

        if (fan2.getPrice() < fan1.getPrice()){
            min = fan2.getPrice();
            if (fan3.getPrice() < min){
                System.out.println(fan3.getName());
            } else {
                System.out.println(fan2.getName());
            }
        }else {
            if (fan3.getPrice() < min){
                System.out.println(fan3.getName());
            } else {
                System.out.println(fan1.getName());
            }
        }

        scanner.close();

    }

}