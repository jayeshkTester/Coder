package IMP_20_Codes;

public class Count_Character_Occurrences {

    public static void main(String[] args) {

        String str = "selenium";

        char ch = 'e';

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ch)
                count++;
        }
        System.out.println(count);

    }
}
