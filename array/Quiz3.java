package array;

public class Quiz3 {
    public static void main(String[] args) {
        int nums[];
        nums = new int[]{10,15,20,25,30};


//        for(int i = 0; i<nums.length;i++ ){
//
//            sum += nums[i];
//        }
//        System.out.println(sum);

        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        System.out.println(sum);

    }
}
