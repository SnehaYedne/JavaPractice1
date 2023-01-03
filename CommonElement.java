package Practice;

public class CommonElement {
    public static void main(String[] args) {
        int[] arr1= {1,4,5,7,2,4,5};
        int[] arr2= {7,6,5,2,2,4,5,9,7};
        System.out.println("common element of two array");
        for(int i=0;i<arr1.length; i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr2[j]);
                }
            }
        }
    }
}
