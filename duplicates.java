import java.util.HashMap;

public class duplicates {
    static void frequency(int arr[]){
        HashMap<Integer,Integer> freq=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!freq.containsKey(arr[i])) freq.put(arr[i], 1);
            else{
                freq.put(arr[i], freq.get(arr[i])+1);
            }
        }
        for (var e : freq.entrySet()) {
            if(e.getValue()>1) System.out.println(e.getKey());
        }
    }
    public static void main(String[] args) {
        int arr[]={10,10,20,30,30,30,40,50,20};
        frequency(arr);
    }
}
