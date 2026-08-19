package IMP_20_Codes;

public class Largest_Second_LargestNumber {
    //Largest & Second-Largest Number

    public static void main(String[] args) {

        int[] arr = {15, 8, 20, 45, 32};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second);
    }

}
