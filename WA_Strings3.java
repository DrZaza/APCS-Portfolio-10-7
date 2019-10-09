    import java.util.Scanner;    
    class WA_Strings3{
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
                String state = "California";
        if (state.equals(state.toLowerCase()))
            System.out.println("I guess caps don't really matter.");
 
         else
            System.out.println("Picky, picky!");
        if (state.equalsIgnoreCase(state.toLowerCase()))
            System.out.println("That gives us some flexibility.");
 
         else
            System.out.println("Are you sure?");
            }
            else{
                break;
            }

    }
}
}
 /*Outputs:
  Picky, picky!
That gives us some flexibility
  */

