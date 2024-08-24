public class stringtonum {
    public static void main(String[] args) {
        String str="10001";
        int num=0;
        for (int i = 0; i < str.length(); i++) {
            num=num*10+(str.charAt(i)-'O');
        }
        System.out.println(num);
    }
}
