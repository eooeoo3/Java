package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        ArrayList<Integer> rstArray = new ArrayList<Integer>();

        int i = 0;

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int a = sc.nextInt();//예외처리 아직 안함;;
            System.out.print("사칙연산 기호를 입력하세요(+,-,*,/): ");
            String mark = sc.next();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int b = sc.nextInt();

            if (mark.equals("+")) {
                result = a + b;
                System.out.print("결과: " + result);
            } else if (mark.equals("-")) {
                result = a - b;
                System.out.print("결과: " + result);
            } else if (mark.equals("*")) {
                result = a * b;
                System.out.print("결과: " + result);
            } else if (mark.equals("/")) {
                if(a<b){
                    System.out.print("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
                }
                else {
                    result = a / b;
                    System.out.print("결과: " + result);
                }
            } else {
                System.out.print("사칙연산 기호를 확인해 주세요.\n");
                continue;
            }


            rstArray.add(result);
            System.out.print("\n가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String inputRemove = sc.next();
            if (inputRemove.equals("remove") ) {
                rstArray.remove(0);
                //
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String checkResult = sc.next();
                if (checkResult.equals("inquiry")){
                    System.out.println(rstArray);
                }
                else{
                    continue;
                }

                System.out.print("\n더 계산하시겠습니까? (yes << >> exit) : ");
                String deguchi = sc.next();
                if (deguchi.equals("exit")){
                    //System.out.println(rstArray);
                    break;
                }
                else{
                    continue;
                }
                //
            } else if (rstArray.isEmpty()) {
                System.out.println("저장된 결과 없음");
                continue;
            }
            else {
                //
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String checkResult = sc.next();
                if (checkResult.equals("inquiry")){
                    System.out.println(rstArray);
                }
                else{
                    continue;
                }
                System.out.print("\n더 계산하시겠습니까? (yes << >> exit) : ");
                String deguchi = sc.next();
                if (deguchi.equals("exit")){
                    //System.out.println(rstArray);
                    break;
                }
                else{
                    continue;
                }
                //
            }

        }
    }
}
