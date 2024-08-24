import java.util.Scanner;

public class fibnocciseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        arr[0]=1;
        if(n==1) System.out.println(1);
        arr[1]=1;
        if(n==2) System.out.println("1");
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
      sc.close();
    }
    
}
