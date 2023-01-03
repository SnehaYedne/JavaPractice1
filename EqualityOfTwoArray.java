package Practice;

import java.util.Arrays;

public class EqualityOfTwoArray {
    public static void main(String[] args) {
        String s1[]= {"java","program","method"};
        String s2[]= {"hibernate","welcome","program"};
        String s3[]= {"java","program","method"};

        System.out.println(Arrays.equals(s1,s2));
        System.out.println(Arrays.equals(s1,s3));
    }
}
