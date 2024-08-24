public class decimaltohexa {
    public static void main(String[] args) {
        int num=960;
        String str="";
        int rem;
        while(num!=0){
            rem=num%16;
            if(rem>=10 && rem<=15){
                str=(char)('A'+rem-10)+str;
            }
            else{
                str=rem+str;
            }
           
            num=num/16;

        }
        System.out.println(str);
    }
}
