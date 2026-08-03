package Capgemini_April;

public class Occurrence_Java {

    public static void main(String[] args){
        String str = "javacodeisjavajavaalongi";
        int count = 0;

        for(int i = 0; i <= str.length() - 4; i++) {
            if(str.substring(i, i+4).equals("java")) {
                count++;
            }
        }

        System.out.println(count);
    }
}
