import java.util.Scanner;
public class PalindromeForLoops{
    public void Play(){
        Scanner input = new Scanner(System.in);
        boolean active = true;
        while(active)
        {  
            System.out.println("--------------------");
            System.out.println("Enter a String:");
            String response1 = input.nextLine();
            switch(response1){
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
            String response2 = response1;
            response2 = replaceCharacter(response2.toLowerCase());
            if (isPal(response2)){//Checks modified String for palindrome
                System.out.println(response1 + " is a palindrome");
            }
            else{
                System.out.println(response1 + " is not a palindrome");
            }
        }    
    }
    public static boolean isPal(String s){
            String response = s;
            boolean palindrome = true;
            for(int i = 0; i<response.length();i++){
                if(response.charAt(i) == response.charAt(response.length() - (i+1)))
                //Checks characters one by one for palindrome
                {
                    palindrome = true;
                    //If it never is false, the string is a palindrome
                }
                else{
                    palindrome = false;
                    break;
                    //If ever false, the loop breaks and the string is not a palindrome
                } 
            }
            return palindrome;
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