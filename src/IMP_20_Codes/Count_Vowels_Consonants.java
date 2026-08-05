package IMP_20_Codes;

public class Count_Vowels_Consonants {
    public static void main(String[] args) {
        String str = "Automation";

        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
            System.out.println("vowels: " + vowels);
            System.out.println("consonants: " + consonants);
        }
    }
}
