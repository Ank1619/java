public class lowercase {
    public static void main(String[] args) {
        String str="ANKIT";
        String low="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=65 && ascii<=90){
                ascii=ascii+32;
                ch=(char)ascii;
            }
            low=low+ch;
        }
        System.out.println(low);
    }
}
