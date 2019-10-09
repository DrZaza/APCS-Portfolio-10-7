import java.util.Scanner;
class WA_Strings2{
    public void Play(){
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
        String state = "Washington";
        String abbrev = state.substring(0,2); System.out.println(abbrev.toUpperCase() + " ships "
      + state.substring(7) + "s of apples");
     }
     else{
         break;
        }
    }
}
}
 /* Outputs:
  The first index value of s is 2
WA ships tons of apples
  */

