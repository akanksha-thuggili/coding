import java.util.*;
public class Main{
    public static void main(String[] args){
        int op,n1,n2;
        int result=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("1.add\n 2.sub\n 3.mul\n 4.div\n");
        System.out.print("enter a choice:");
        op=sc.nextInt();
        System.out.print("enter number1:");
        n1=sc.nextInt();
        System.out.print("enter number2:");
        n2=sc.nextInt();
        switch(op){
            case 1:
                result=n1+n2;
                break;
            case 2:
                result=n1-n2;
                break;
            case 3:
                result=n1*n2;
                break;
            case 4:
                result=n1/n2;
                break;
            default:
                System.out.println("invalid choice:");
                    
        }
        System.out.print("the result is:" +result);
    }
    
}
