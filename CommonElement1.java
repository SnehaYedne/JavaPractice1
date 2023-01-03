package Practice;

public class CommonElement1 {

    public static void main(String[] args) {

        int arr1[] = {1, 4, 5, 7, 2, 4, 5, 9, 65};
        int arr2[] = {7, 6, 5, 2, 4, 9};
        int arr3[] = {8, 4, 3, 7, 2, 5, 23, 65};


        System.out.print(" The common elements in the 3  arrays are: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                for (int k = 0; k < arr1.length; k++) {
                    if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                        System.out.print(arr1[j]);

                    }
                }
            }


        }
    }}