package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstRepeatingCharacter {

   // String input="Java Programming is Awesome";
    static char findRepeat(char temp[])
    {
        ArrayList<Character> list = new ArrayList<>();

        for (int i=0; i<=temp.length-1; i++)
        {
            char ch = temp[i];

            if (list.contains(ch))
                return ch;

            else
                list.add(ch);
        }

        //Returns False in case of no repetition
        return 'F';
    }

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        //String input
        System.out.println("Enter the String: ");
        String str = input.nextLine();

        char[] charr = str.toCharArray();

        if (findRepeat(charr)=='F')
            System.out.println("NO REPETITION");

        else
            System.out.println("The First Repeated Character in the String is: "+findRepeat(charr));
    }


}
