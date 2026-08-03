package Capgemini_April;

public class Reverse_String {

    //reverse the string.

    public static void main(String[] args){
        String str = "ahsay";
        String rev = "";

        for (int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}
