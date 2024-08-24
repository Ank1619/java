public class reverseword {
    public static void main(String[] args) {
        String str="I love coding";
        String[] words=str.split(" ");
        String reverse=" ";
        
        for (int i = words.length-1; i >=0 ; i--) {
            reverse=reverse+words[i]+" ";

        }

        System.out.println(reverse);

    }
}
