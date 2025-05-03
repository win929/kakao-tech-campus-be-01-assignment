package com.example.Lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculatorLv3<T extends Number> {
    private T a;
    private T b;
    private static List<Double> results = new ArrayList<>();

    public ArithmeticCalculatorLv3(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public double calculate(OperatorTypeLv3 operator) {
        double a = this.a.doubleValue();
        double b = this.b.doubleValue();

        double result;
        switch (operator) {
            case ADD:
                result = a + b;
                break;
            case SUBTRACT:
                result = a - b;
                break;
            case MULTIPLY:
                result = a * b;
                break;
            case DIVIDE:
                if (b != 0) {
                    result = a / b;
                    break;
                } else {
                    System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                    return 0;
                }
            default:
                System.out.println("잘못된 연산자입니다.");
                return 0;
        }

        results.add(result);

        return result;
    }

    public List<Double> getResultsGreaterThan(double input) {
        return results.stream()
                .filter(result -> result > input)
                .collect(Collectors.toList());
    }
}