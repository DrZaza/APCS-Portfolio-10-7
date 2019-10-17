import java.util.Scanner;
public class palindromeTest{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        while(1==1){
            String response1 = input.nextLine();
            String response2 = response1;
            response2 = replaceCharacter(response2.toLowerCase());
            if (isPal(response2)){
                System.out.println(response2 + " is a palindrome");
            }
            else{
                System.out.println(response2 + "is not a palindrome");
            }
        }    
    }
    public static boolean isPal(String s){
            String response = s;
            char c = 'Z';
            boolean palindrome = true;
            for(int i = 0; i<response.length();i++){
                c = response.charAt(i);
                if(response.charAt(i) == response.charAt(response.length() - (i+1)))
                {
                    palindrome = true;
                }
                else{
                    palindrome = false;
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