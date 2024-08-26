
import java.util.HashMap;

public class anagram {
    static boolean cheackanagram(String s,String t){
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> freq=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (!freq.containsKey(i)) {
                freq.put(ch, 1);
            }
            else{
                freq.put(ch, freq.get(ch)+1);
            }
        }

        HashMap<Character,Integer> freq1=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=t.charAt(i);
            if (!freq1.containsKey(i)) {
                freq1.put(ch, 1);
            }
            else{
                freq1.put(ch, freq1.get(ch)+1);
            }
        }

        return freq1.equals(freq);

        
    }
    public static void main(String[] args) {
        String s="silenty";
        String t="listen";
        System.out.println(cheackanagram(s, t));
    }

}
