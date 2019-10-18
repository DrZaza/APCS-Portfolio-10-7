import java.util.Scanner;
public class PalindromeRecursion
{
    public static boolean isPal(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            // if length =0 OR 1 then it is
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
            // check for first and last char of String:
            // if they are same then do the same thing for a substring
            // with first and last char removed. and carry on this
            // until you string completes or condition fails
            return isPal(s.substring(1, s.length()-1));

        // if its not the case than string is not.
        return false;
    }

    public void Play()
    {
        boolean active = true;
        Scanner input = new Scanner(System.in);
        while(active){
        System.out.println("--------------------");
        System.out.println("Enter a String:");
        String x = input.nextLine();
        switch(x){
            case "q":
                System.out.println("Thanks for playing!");
                active = false;
                break;
            case "Q":
                System.out.println("Thanks for playing!");
                active = false;
                break;
            default:
                break;
        }
        x = replaceCharacter(x.toLowerCase());
        if(isPal(x))//Puts Modified String though Palindrome check method
            System.out.println(x + " is a palindrome");
        else
            System.out.println(x + " is not a palindrome");
        }
    }
    
    static String replaceCharacter(String input){
        String alphaAndDigits0 = input.replaceAll("[\\s]", "");
        //Removes Spaces
        String alphaAndDigits = alphaAndDigits0.replaceAll("[^a-zA-Z0-9 ]","");
        //Removes Special Characters
        return alphaAndDigits;
        //Returns Modified String
    }
}