package IMP_20_Codes;

public class Reverse_each_word {

    public static void main(String[] args) {

        String str = "Jayesh kapadane is an automation tester !";
        String[] words = str.split(" ");

        String result = "";

        for (String word : words) {

            String rev = "";

            for (int i = word.length() - 1; i >= 0; i--){
                rev += word.charAt(i);
            }

            result += rev + " ";
        }
        System.out.println(result.trim());
    }

}