package Topics.String;

public class Reverse_String {

    public static void main(String[] args){
        String name = "I am an automation test engineer !";
        String reverse = "";
        char ch;

        for (int i =0; i<name.length(); i++){
            ch = name.charAt(i);
            reverse=ch+reverse;
        }
        System.out.println("Reversed : " + reverse);


    }
}
