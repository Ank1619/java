
import java.util.HashSet;

public class numbercommon {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={2,4,3,6,7};
        HashSet<Integer> st=new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            st.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if(st.contains(arr2[i])) System.out.print(arr2[i]);
        }

    }
}
