import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        int[] numbers = new int[5];
       // numbers[0] = 10;
       // numbers[1] = 11;
       // numbers[2] = 12;
       // numbers[3] = 15;

        char name[] = { 'a' , 'b', 'c','s'};
        int len = name.length;

        char name1[] = name.clone();

        System.out.println(Arrays.toString(name1));
       // System.out.println((name[0]));
        System.out.println(len);




    }
}
