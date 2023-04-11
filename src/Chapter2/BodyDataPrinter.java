package Chapter2;

import java.util.Scanner;

public class BodyDataPrinter {
    public static void main(String[] args) {
        String name;
        int age;
        float height;
        float weight;

        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        name = sc.nextLine();

        System.out.print("나이 : ");
        age = sc.nextInt();


        System.out.print("키 : ");
        height = sc.nextFloat();


        System.out.print("몸무게 : ");
        weight = sc.nextFloat();


        System.out.println(name + ", " + age + ", " + height + ", " + weight);
    }
}
