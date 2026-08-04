package IMP_20_Codes;

public class ReverseString {

    /*Reverse String Program in Java
            Logic

    A string is a sequence of characters. To reverse it:

    Start from the last character of the string.
    Move backward one character at a time.
    Append each character to a new string.
    The new string becomes the reversed string.

            Example:

    Input: "Hello"

    Index	Character
     4          o
     3      	l
2	l
1	e
0	H

    Output: "olleH"*/
    public static void main() {

        String str = "Jayesh Kapadane";
        String rev = "";

        for (int i = str.length()-1; i >=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Reverse string: " + rev);
    }
}