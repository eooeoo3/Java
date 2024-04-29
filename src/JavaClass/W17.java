package JavaClass;

import java.util.Scanner;

public class W17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("제외할 숫자를 입력하세요 : ");
        int passNum = sc.nextInt();

        for(int i = 2; i<=9; i++){
            System.out.println(i+"단");
            if (passNum == i){
                continue;
            }
            for(int j = 1; j<=9;j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
        }
    }
}