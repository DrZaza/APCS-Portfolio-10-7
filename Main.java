import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        boolean active = true;
        Scanner input = new Scanner(System.in);
        PalindromeMethods palindromeMethods = new PalindromeMethods();
        PalindromeForLoops palindromeFor = new PalindromeForLoops();
        PalindromeRecursion palindromeRecursion = new PalindromeRecursion();
        WA_Strings wa_Strings = new WA_Strings();
        WA_Strings2 wa_Strings2 = new WA_Strings2();
        WA_Strings3 wa_Strings3 = new WA_Strings3();
        String response = "";
        while(active==true){
            //System.out.println("\u000C\n");
            System.out.println("|=====================================");
            System.out.println("| MENU SELECTION PORTFOLIO");
            System.out.println("| Select a Program:");
            System.out.println("| 1. Palindrome Methods");
            System.out.println("| 2. Palindrome ForLoops");
            System.out.println("| 3. Palindrome Recursion");
            System.out.println("| 4. Worksheet 1");
            System.out.println("| 5. Worksheet 2");
            System.out.println("| 6. Worksheet 3");
            System.out.println("|Press \"Q\" at any time to Quit");
            System.out.println("|=====================================");
            System.out.println("|Select an Option");
            
            response = input.next();
            switch(response){
                    case "1":
                        palindromeMethods.Play();
                        break;
                    case "2":
                            System.out.println("\u000C");
                            System.out.println("Welcome to the Palindrome For-Loop Based Program!");
                            System.out.println("Press \"Q\" at any time to quit");
                        palindromeFor.Play();
                        break;
                    case "3":
                            System.out.println("\u000C");
                            System.out.println("Welcome to the Palindrome Recursion-Based Program!");
                            System.out.println("Press \"Q\" at any time to quit");
                        palindromeRecursion.Play();
                        break;
                    case "4":
                        wa_Strings.Play();
                        break;
                    case "5":
                        wa_Strings2.Play();
                        break;
                    case "6":
                        wa_Strings3.Play();
                        break;
                    case "q":
                        System.out.println("Thanks for playing!");
                        active = false;
                        break;
                    case "Q":
                        System.out.println("Thanks for playing!");
                        active = false;
                        break;
                    default:
                        System.out.println("That's not a Valid Choice"+
                        "Try Again!");
            }
          
        }
    }
}
