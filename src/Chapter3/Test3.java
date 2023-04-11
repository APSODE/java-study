package Chapter3;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        double start_mileage_display, end_mileage_display, fuel_cost, fuel_efficiency;

        Scanner sc = new Scanner(System.in);

        System.out.print("출발시 주행거리계 표시값 : ");
        start_mileage_display = sc.nextDouble();

        System.out.print("도착시 주행거리계 표시값 : ");
        end_mileage_display = sc.nextDouble();

        System.out.print("총 소모 연료 : ");
        fuel_cost = sc.nextDouble();

        fuel_efficiency = (end_mileage_display - start_mileage_display) / fuel_cost;

        System.out.println("연비는 " + fuel_efficiency + "km/l입니다.");


    }
}
