import java.util.Scanner;
import java.util.InputMismatchException;
@FunctionalInterface
interface cal{
    double operator(double x,double y);
}
public class Main1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char continueChoice='y';
        cal add=(x,y)->x+y;
        cal sub=(x,y)->x-y;
        cal mul=(x,y)->x*y;
        cal div=(x,y)->x/y;
        cal mod=(x,y)->x%y;
        while(continueChoice=='y'|| continueChoice=='Y'){
            char choice;
            System.out.println("\n--- Calculator Menu---");
            System.out.println(" +:Addition");
            System.out.println(" -:Subtraction");
            System.out.println(" *:Multiplication");
            System.out.println(" /:Division");
            System.out.println(" %:Modulo");
            while(true){
                System.out.print("Enter operator:");
                String input = sc.next();
                if(input.length() == 1 && "+-*/%".indexOf(input.charAt(0))!=-1){
                    choice = input.charAt(0);break;
                }
                else{
                    System.out.println("Invalid operator!Please enter one of +,-,*,/,%.");
                }
            }
            double a = 0;
            while(true) {
                System.out.print("Enter value for a:");
                try {
                    a = sc.nextDouble();
                    break;
                }
                catch(InputMismatchException e) {
                    System.out.println("Invalid input!Please enter a number:");
                    sc.nextLine();
                }
            }
            double b = 0;
            while(true){
                System.out.print("Enter value for b" +((choice == '/' || choice == '%')?"(non-zero)":"")+":");
                try{
                    b = sc.nextDouble();
                    if((choice == '/' || choice == '%')&& b == 0){
                        System.out.println("Error:Cannot divide or modulo by zero.Please enter a non-zero number.");
                    }
                    else{
                        break;
                    }
                }catch(InputMismatchException e){
                    System.out.println("Invalid input!Plase enter a number.");
                    sc.nextLine();
                }
            }
            switch(choice) {
                case'+':
                    System.out.println("Result:" + add.operator(a,b));
                    break;
                case'-':
                    System.out.println("Result:" + sub.operator(a,b));
                    break;
                case'*':
                    System.out.println("Result:" + mul.operator(a,b));
                    break;
                case'/':
                    System.out.println("Result:" + div.operator(a,b));
                    break;
                case'%':
                    System.out.println("Result:" + mod.operator(a,b));
                    break;
            }
            while(true){
                System.out.print("Do you want to continue?(y/n):");
                String input = sc.next();
                if(input.length() == 1 && (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n")))
                {
                    continueChoice = input.charAt(0);break;
                }
                else{
                    System.out.println("Invalid input!Please enter 'y' or 'n'.");
                }
            }
            
        }
        System.out.println("Program exited.Thank you!");
        sc.close();
    }
}
