package Capgemini_April;

public class MoveZeros_end {

    //Move all 0s to end

    public static void main(String[] args) {
        String input = "00000123569";
        String result = "";
        int countZero = 0;

        for(char c : input.toCharArray()) {
            if(c == '0') countZero++;
            else result += c;
        }

        while(countZero-- > 0) {
            result += "0";
        }

        System.out.println(result);
    }
}
