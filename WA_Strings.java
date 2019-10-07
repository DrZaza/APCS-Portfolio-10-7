class WA_Strings{
    public static void main(String[] args){

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
}
 /*Outputs:
  The length of Mississipi is 10 characters
The character at index 8 is p
The beginning index of ssip is 5
The first index value of s is 2
  */

