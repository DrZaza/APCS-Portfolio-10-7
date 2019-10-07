class WA_String2{
    public static void main(String[] args){
        String state = "Washington";
        String abbrev = state.substring(0,2); System.out.println(abbrev.toUpperCase() + " ships "
      + state.substring(7) + "s of apples");
    }
}
 /* Outputs:
  The first index value of s is 2
WA ships tons of apples
  */

