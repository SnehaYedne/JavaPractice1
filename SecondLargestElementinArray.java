package Practice;

public class SecondLargestElementinArray {
    static int SecondLargest(int[] input) {
          int firstLargest, secondLargest;

          if(input[0]>input[1]) {
              firstLargest = input[0];
              secondLargest = input[1];
          }
              else{
                  firstLargest= input[1];
                  secondLargest= input[0];
              }
  for(int i=2; i<input.length;i++)
  {
      if(input[i]>firstLargest)
      {
          secondLargest= firstLargest;
           firstLargest= input[i];
      }
      else if(input[i]<firstLargest && input[i]>secondLargest)
      {
          secondLargest= input[i];
      }
  }


        return secondLargest;
    }
    public static void main(String[] args) {
        System.out.println(SecondLargest(new int[]{40,25,52,80}));
        System.out.println(SecondLargest(new int[]{75,52,81,95,40}));

    }
}
