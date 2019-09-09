import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Prompt:
        //step1 print 1to 5
        //step 2 print 5 numbers inputted by user

        Scanner sc= new Scanner(System.in);

//        //for loop- count-controlled
//        for(int i=0; i<5; i++){
//            System.out.println(i+1);
//        }
//        //step 2
        System.out.println("using for loop-step2");
        for (int j=0;j<5; j++){
            System.out.println("Enter an integer");
            int temp = sc.nextInt();
            System.out.println(temp);
        }



//while loop condition-controlled
        //while loop is pre-test
        System.out.println("using while loop");
        int i=0;
        while (i<5){
            i++;
            System.out.println(i);
        }
        System.out.println("using while loop-step2");
        int j =0;
        while (j<5){
            System.out.println("enter an integer");
            int temp =sc.nextInt();
            System.out.println(temp);
            j++;

        }




        //do while loop - condition- controlled
        //do while loop is a post-test
        System.out.println("Using do-while loop");
        i= 0;
        do{

            i++;
        }
        while(i<5);

        System.out.println("using do-while loop step2");
        j=0;
        do{
            System.out.println("enter an integer: ");
            int temp= sc.nextInt();
            System.out.println(temp);
            j++;
        }while (j<5);
    }

}
