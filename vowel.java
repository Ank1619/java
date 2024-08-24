public class vowel{
    public static void main(String[] args) {
        String str="Elephant";
        int vowel=0;
        int constant=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=65 && ascii<=90) {
                ascii=ascii+32;
                ch=(char)ascii;
            }
            if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u') vowel++;
            else constant++;

        }
        System.out.println("Number of vowel="+vowel);
        System.out.println("The number of costant="+constant);
    }
}