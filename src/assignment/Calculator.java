package assignment;

public class Calculator {
    public int calculate(int a, String operator, int b) throws CalculatorException {
        int result = 0;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    throw new CalculatorException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
                }
                result = a / b;
                break;
            default:
                throw new CalculatorException("사칙연산 기호를 확인해 주세요.");
        }

        return result;
    }
}
