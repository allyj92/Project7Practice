package array;

public class Quiz1 {
    public static void main(String[] args) {
       char[] chars = {'a','b','c','d','e'} ;

        for(int i = 0; i<chars.length;i++){
            System.out.println(chars[i]);
        }

        char[] chars1;
        chars1 = new char[]{'a','b','c','d','e'};

       for(char character:chars1){
           System.out.println(character);
       }

    }
}
