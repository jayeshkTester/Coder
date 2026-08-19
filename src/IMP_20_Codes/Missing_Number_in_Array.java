package IMP_20_Codes;

public class Missing_Number_in_Array {

    public static void main(String[] args) {

        int arr[] = {1,2,3,5};

        int n = 5;

        int expected = n * (n + 1) / 2;

        int actual = 0;

        for (int num : arr)
            actual += num;

        System.out.println("Missing Number = " + (expected - actual));
    }
}
