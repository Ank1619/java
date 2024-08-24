import java.util.Scanner;

public class sumofseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double result=0.0;
        for (int i = 1; i <= n; i++) {
            result=result+(1.0/i);
        }
        System.out.println(result);
    }
}
