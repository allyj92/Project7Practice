package array;

public class Quiz6 {
    public static void main(String[] args) {
        int[] arrys = {5, 100, 30, 20, 77};

        int idx=0;
        for(int arry:arrys){

            if (arrys[idx] == 20){
                System.out.println(idx);
            }
            idx++;
        }
    }
}
