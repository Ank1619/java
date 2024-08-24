public class oddeven {
    public static void main(String[] args) {
        int arr[]={1,2,34,5,6,4,8};
        int odd=0;
        int even=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0) even++;
            else odd++;
        }
        System.out.println("Tne number of odd integers="+odd);
        System.out.println("Tne number of even integers="+even);

    }
}
