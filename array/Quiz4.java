package array;

import java.util.Arrays;

public class Quiz4 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        int cnt = 0; // 인덱스로 저장할 변수
        for (int i = 0; i <=10; i++) {

            if (i % 2 == 0) {
                arr[cnt] = i;
                cnt++;
            }
        }
        System.out.println(Arrays.toString(arr));


    }}








