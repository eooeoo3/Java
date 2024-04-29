package week2;

import java.util.ArrayList;
import java.util.Scanner;

public class W2_assignment {
    public static void main(String[] args) {
        //1.자료구조 입력받기
        Scanner sc = new Scanner(System.in);

        System.out.print("저장할 자료구조명을 입력하세요(List/Set/Map): ");
        String dt_name = sc.nextLine();

        //2.레시피 입력받기 List->Set->Map
        System.out.print("레시피명을 입력하세요: ");
        String rcp_name = sc.nextLine();

        switch (dt_name){
           //저장할 자료구조명을 입력합니다. (List )
            case "List" :
                ArrayList<String> rcp_list = new ArrayList<>();
                String input;
                int i = 1;
                while (true){
                    System.out.print(i+". 레시피를 입력하세요 : ");
                    input = sc.nextLine();
                    if (input.equals("끝")){
                        break;
                    }
                    else {
                        rcp_list.add(input);
                        i++;
                    }
                }

        }
    }
}
