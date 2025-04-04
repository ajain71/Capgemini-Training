import java.util.Scanner;
public class small1{
    public static void main(String[] argrs){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = input.nextInt();
        System.out.println("Enter number2: ");
        int number2 = input.nextInt();
        System.out.println("Enter number3: ");
        int number3 = input.nextInt();
        if(number1>number2 && number1>number3){
            System.out.println("Is the first number the largest?" + "Yes");
        }
        else{
            System.out.println("Is the first number the largest?" + "No");
        }
        if(number2>number1 && number2>number3){
            System.out.println("Is the second number the largest?" + "Yes");
        }
        else{
            System.out.println("Is the second number the largest?" + "No");
        }
        if(number3>number2 && number3>number1){
            System.out.println("Is the third number the smallest?" + "Yes");
        }
        else{
            System.out.println("Is the third number the smallest?" + "No");
        }
    }
}

