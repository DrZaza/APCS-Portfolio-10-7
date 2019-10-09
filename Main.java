import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        boolean active = true;
        Scanner input = new Scanner(System.in);
        Palindrome palindrome = new Palindrome();
        WA_Strings wa_Strings = new WA_Strings();
        WA_Strings2 wa_Strings2 = new WA_Strings2();
        WA_Strings3 wa_Strings3 = new WA_Strings3();
        int response = 0;
        while(active==true){
            //System.out.println("\u000C\n");
            System.out.println("|=====================================");
            System.out.println("| MENU SELECTION PORTFOLIO");
            System.out.println("| Select a Program:");
            System.out.println("| 1. Palindrome Checker");
            System.out.println("| 2. Worksheet 1");
            System.out.println("| 3. Worksheet 2");
            System.out.println("| 4. Worksheet 3");
            System.out.println("|=====================================");
            System.out.println("|Select an Option");
            response = input.nextInt();
            if(response == 1){
                palindrome.Play();
            }
            else if(response == 2){
                wa_Strings.Play();
            }
            else if(response == 3){
                wa_Strings2.Play();
            }
            else if(response == 4){
                wa_Strings3.Play();
            }
            else{
                System.out.println("That is NOT a Valid Option!");
            }
        }
    }
}
