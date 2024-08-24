

public class reversearay {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int st=0;
        int rear=arr.length-1;
        while(st!=rear){
            int temp=arr[st];
            arr[st]=arr[rear];
            arr[rear]=temp;
            st++;
            rear--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}