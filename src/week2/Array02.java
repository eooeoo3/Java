package week2;

import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
        String[] strArray = {"a","b","c"};

        for(int i = 0; i<intArr.length;i++){
            intArr[i] = i;
            System.out.println(intArr[i]);

        }

        for(int i = 0; i<intArr.length;i++){
            System.out.println(intArr[i]);
        }
        for(int i:intArr){
            System.out.println(i);
        }
        //Arrays.fill(intArr, 1);

    }
}
