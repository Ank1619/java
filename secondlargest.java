

public class secondlargest {
    public static void main(String[] args) {
        int arr[]={1,3,2,8,5,6,8,4};
        int largest=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest) largest=arr[i];
        }
        int secondlargest=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>secondlargest && arr[i]<largest) secondlargest=arr[i];
        }
        System.out.println(secondlargest);
    }
}
