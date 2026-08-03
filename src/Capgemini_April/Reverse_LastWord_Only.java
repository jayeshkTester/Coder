package Capgemini_April;

public class Reverse_LastWord_Only {

    // Reverse only last word

    public static void main(String[] args){
        String str = "I like yasha";
        String[] words = str.split(" ");

        String last = words[words.length-1];
        String rev = new StringBuilder(last).reverse().toString();

        words[words.length-1] = rev;

        System.out.println(String.join(" ", words));
    }
}
