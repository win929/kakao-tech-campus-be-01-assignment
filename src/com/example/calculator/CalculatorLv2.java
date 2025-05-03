package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class CalculatorLv2 {
    private static List<Integer> results = new ArrayList<>();

    public int calculate(int a, char operator, int b) {
        int result;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
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

    public List<Integer> getResults() {
        return results;
    }

    public void setResults(List<Integer> results) {
        this.results = results;
    }

    public void removeResult() {
        results.remove(0);
    }
}
