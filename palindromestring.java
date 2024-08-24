public class palindromestring {
    public static void main(String[] args) {
        String str = "aabaab";
        StringBuilder st = new StringBuilder(str);
        StringBuilder gtr = new StringBuilder(st).reverse();
        
        if (str.equals(gtr.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}

