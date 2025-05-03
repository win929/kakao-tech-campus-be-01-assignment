package com.example.Lv3;

import java.util.List;
import java.util.Scanner;

public class AppLv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArithmeticCalculatorLv3<Integer> calculator = new ArithmeticCalculatorLv3<>(10, 5);

        System.out.println("더하기: " + calculator.calculate(OperatorTypeLv3.ADD));
        System.out.println("빼기: " + calculator.calculate(OperatorTypeLv3.SUBTRACT));
        System.out.println("곱하기: " + calculator.calculate(OperatorTypeLv3.MULTIPLY));
        System.out.println("나누기: " + calculator.calculate(OperatorTypeLv3.DIVIDE));

        System.out.print("기준값 설정: ");
        double input = sc.nextDouble();

        List<Double> list = calculator.getResultsGreaterThan(input);
        System.out.println("기준값보다 큰 결과: " + list);
    }
}
