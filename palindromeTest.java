import java.util.Scanner;
public class palindromeTest{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        while(1==1){
            String response = input.nextLine();
            if (isPal(response)){
                System.out.println(response + " is a palindrome");
            }
            else{
                System.out.println(response + is not a palindrome");
            }
        }    
    }
    public static boolean isPal(String s){
            String response = s;
            char c = 'Z';
            boolean palindrome;
            for(int i = 0; i<response.length();i++){
                c = response.charAt(i);
                if(response.charAt(i) == response.charAt(response.length() - (i+1)))
                {
                    palindrome = true;
                    return isPal(true);
                }
                else{
                    palindrome = false;
                } 
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