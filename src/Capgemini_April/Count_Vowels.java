package Capgemini_April;

public class Count_Vowels {

    //Count vowels in each word

    public static void main(String[] args){
        String str = "I Like Java Programming";
        String[] words= str.toLowerCase().split(" ");

        for (String word : words){
            int count = 0;
            for (char c : word.toCharArray()){
                if("aeiou".indexOf(c) != -1){
                    count++;
                }
            }
            System.out.println(word + "-" + count);
        }

    }
}
