import java.util.Scanner;
class PalindromeMethods 
{
  public static void checkPalindrome(String s) 
  { 
    // reverse the given String 
    String reverse = new StringBuffer(s).reverse().toString(); 
    // check whether the string is palindrome or not 

    if(s.equals(reverse))
      System.out.println("Yes, that is a palindrome!"); 
  
    else
      System.out.println("No, that is not a palindrome.");
  } 
  public void Play()     
  { 
   boolean typing = true;
   System.out.println("\u000C");
   System.out.println("Welcome to the Palindrome Method-Based Program!");
   System.out.println("Press \"Q\" at any time to quit");
   while(typing==true){
       System.out.println("--------------------");
       System.out.println("Enter a String:");
       Scanner i = new Scanner(System.in);
       String x = "";
      while(typing==true){
        x = i.nextLine();
        switch(x){ //If "q" or "Q" are pressed the program will end
            case "q":
                System.out.println("Thanks for playing!");
                typing = false;
                break;
            case "Q":
                System.out.println("Thanks for playing!");
                typing = false;
                break;
            default:
                break;
        }
        if(x.length() == 1&&typing==true){
           System.out.println("Must be more than one character to be a Palindrome");
        }
        else{
           break;
        }
       }
      while(typing==true){
       x = replaceCharacter(x); //Puts Modified String through Palindrome Checker
       checkPalindrome(x.toLowerCase());
       break;
    }
   }
  }
  static String replaceCharacter(String input){
        String alphaAndDigits0 = input.replaceAll("[\\s]", "");
        //Removes Spaces
        String alphaAndDigits = alphaAndDigits0.replaceAll("[^a-zA-Z0-9 ]","");
        //Removes Special Characters
        return alphaAndDigits;
        //Returns Modified Strings
    } 
}