import java.util.Stack;
import java.util.Scanner;
class PalindromeForLoops {
    public static void main(String[] args) {
    	System.out.print("Enter any string:");
        Scanner in=new Scanner(System.in);
        String inputString = in.nextLine();
        Stack stack = new Stack();

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        String reverseString = "";

        while (!stack.isEmpty()) {
            reverseString = reverseString+stack.pop();
        }

        if (inputString.equals(reverseString))
            System.out.println(inputString + " is a palindrome.");
        else
            System.out.println(inputString + " is not a palindrome.");

    }
}