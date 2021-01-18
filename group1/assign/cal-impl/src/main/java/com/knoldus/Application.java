package com.knoldus;
import java.util.Scanner;
public class Application {
    public static void main(String args[])
    {
        int num1, num2;
        int result=0;
        char choice;
        Scanner kb= new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        num1 = kb.nextInt();
        num2 = kb.nextInt();
        System.out.println("press a for addition\n press s for substraction \n press m for multiplication,\n press d for division");
        System.out.println("Enter a choice");
   /* a or b or c or d
     a for addition, b for substraction, c for multiplication and d for division*/
        choice = kb.next().charAt(0);
       Calculator ref = new Calculator();
        switch(choice)
        {
            case 'a':
                result = ref.addition(num1, num2);
                break;
            case 's':
                result = ref.substraction(num1, num2);
                break;
            case 'm':
                result = ref.multiplication(num1,num2);
                break;
            case 'd':
                result = ref.division(num1,num2);
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println(" "+result);
    }
}
