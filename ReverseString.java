import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        String rev = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            rev += chars[i];
        }
        System.out.println("Reversed string: " + rev);
    }
}
