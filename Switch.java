import java.util.Scanner;

public class main {
    public static void main (String[] args){
        //switch
        int number = 10;
        String name = "surya";

        Scanner input = new Scanner(System.in);
        name = input.nextLine();

        switch (name){
            case "suresh" :
                System.out.println("Hello, "+name);
                break;

            case "surya" :
                System.out.println("Hello, "+name);
                break;

            case "karthi" :
                System.out.println("Hello, "+name);
                break;

            default:
                System.out.println("your name in not in list");

        }
    }

}
