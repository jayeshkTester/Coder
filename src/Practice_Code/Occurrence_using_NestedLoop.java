package Practice_Code;

public class Occurrence_using_NestedLoop {
    public static void main(String[] args){

        // Using nested loop

        String str = "aaabbbbbccccdd";
        char[] ch = str.toCharArray();
        boolean[] b = new boolean[str.length()];

        System.out.println("Occurrence: ");
        for (int i =0; i<ch.length; i++){
            if (b[i]) continue;
            int c = 1;
            for (int j = i +1; j<ch.length; j++){
                if (ch[i] == ch[j]) {
                    c++;
                    b[j] = true;     // Mark character as counted
                }
            }
            System.out.println(ch[i] + " : " + c);
        }
    }
}
