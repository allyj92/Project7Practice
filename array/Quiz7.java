package array;
import java.util.Arrays;

public class Quiz7 {
    public static void main(String[] args) {
        char[] arrs = {'a','b','c','d','e'};
        char[] newArrs = new char[2];

        System.arraycopy(arrs,3,newArrs,0,2);

        System.out.println("새로운배열: " + Arrays.toString(newArrs));

    }
    }


