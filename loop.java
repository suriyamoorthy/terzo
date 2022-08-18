public class loop {
    public static void main (String[] args){
        //for loop. while , do while, for each-loop.

        for (int initial = 0; initial < 2; initial ++){

            System.out.println("Hello Team");
        }

                // while loop
                int number = 2;

                while(number > 0 ){
                    System.out.println("while loop");
                    number  -- ;
                }

                //do while

                int number1 = 2;
                do{
                    System.out.println("do while loop");
                    number1 -- ;

                }while (number1 > 0);

                //for each-arrays
        String fruits[] = {"apple" , "orange" ,"banana"};

        for(int i = 0 ; i<fruits.length ; i++){
            System.out.println(fruits[i]);
        }
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        }

}
