package assignment;

import assignment.Calculator;
import assignment.CalculatorException;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> resultsList = new ArrayList<Integer>();
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNumber = scanner.nextInt();
            System.out.print("사칙연산 기호를 입력하세요(+,-,*,/): ");
            String operator = scanner.next();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNumber = scanner.nextInt();

            try {
                int result = calculator.calculate(firstNumber, operator, secondNumber);
                System.out.println("결과: " + result);
                resultsList.add(result);
            } catch (CalculatorException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("\n가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String removeInput = scanner.next();
            if (removeInput.equals("remove")) {
                if (!resultsList.isEmpty()) {
                    removeFirst(resultsList);
                    System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                    String checkResult = scanner.next();
                    if (checkResult.equals("inquiry")) {
                        System.out.println(resultsList);
                    }
                } else {
                    System.out.println("저장된 결과 없음");
                }
            }

            System.out.print("\n더 계산하시겠습니까? (yes << >> exit) : ");
            String exitInput = scanner.next();
            if (exitInput.equals("exit")) {
                break;
            }
        }
    }

    private static void removeFirst(ArrayList<Integer> list) {
        list.remove(0);
    }
}
