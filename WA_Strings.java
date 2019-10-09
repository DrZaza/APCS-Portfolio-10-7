import java.util.Scanner;
class WA_Strings{
    public void Play()
    {
        while(1==1){
        Scanner input = new Scanner(System.in);
        String response = "";
        System.out.println("Would you like to see the Code output?");
        System.out.println("--Yes-- --No--");
        response = input.next();
        
        if(response.length() == 2){
            break;
        }
        else if(response.length() == 3){
            System.out.println("This Code Outputs:");
            String state = "Mississipi"; int len = state.length(); char ch = state.charAt(8); String stub = "ssip";
int index1 = state.indexOf(stub);
int index2 = state.indexOf('s');
System.out.println("The length of " + state + " is " + len
       + " characters");
    System.out.println("The character at index 8 is " + ch);
    System.out.println("The beginning index of " + stub + " is "
       + index1);
    System.out.println("The first index value of s is "
+ index2);
        }
        else{
            break;
       }

      }
    }
}



