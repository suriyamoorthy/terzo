import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //if conditions
        int pen = 10;
        int specialpen = 20;
        int cost ;
        Scanner input = new Scanner(System.in);
        cost = input.nextInt();

        if (cost > specialpen){ //cost of 20
            System.out.println("you can buy the specialpen");
        }
        else if (cost > pen) { //cost of 10
            System.out.println("you can buy the pen");
        }
            
        else{
            System.out.println("you have less money to buy the pen");
        }
    }
}
