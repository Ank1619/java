public class dectobinary {
    public static void main(String[] args) {
        int num=18;
        String bin="";
        int rem;
        while(num!=0){
            rem=num%2;
            bin=rem+bin;
            num=num/2;
        }
        System.out.println(bin);
    }
}
