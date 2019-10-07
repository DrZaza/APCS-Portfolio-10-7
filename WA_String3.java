    class WA_String3{
        public static void main(String[] args){
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
}
 /*Outputs:
  Picky, picky!
That gives us some flexibility
  */

