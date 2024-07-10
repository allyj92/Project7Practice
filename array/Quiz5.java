package array;

public class Quiz5 {
    public static void main(String[] args) {
//        int[] numbers= {5,20,100,30,77};
//
//        int max = numbers[0];
//        for(int number : numbers){
//            if (number > max){
//                max = number;
//            }
//        }
//        System.out.println(max);
//    }
        int[] arr = new int[] { 5, 20, 100, 30, 77 };

        // 최대값을 저장하기 위한 변수
        // 배열의 첫번째 값으로 최대값을 초기화
        int max = arr[0];

        for (int i = 1; i < 5; i++) {

            System.out.print(arr[i] + " vs "  + max);

            if (arr[i] > max) { // 배열의값이 현재 최대값보다 크면
                max = arr[i]; // 최대값 변경
            }
            System.out.print("?? " + max);
            System.out.println();
        }

        System.out.println(max);
    }

}
