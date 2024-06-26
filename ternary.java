
import java.util.Scanner;
class ternary {
    public static void main(String[] args) {
        
        // int n = 10;
        // int result = 0;

        // if(n%2==0){
        //     result = 10;
        // }
        // else{
        //     result = 20;
        // }

        // IN TERNARY OPERATER 
        // result = ( n%2==0) ?  10 : 20;

        // System.out.println(result);


        // WAP to check whether odd or even number 

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }


    }
}
