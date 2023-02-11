import java.util.ArrayList;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        int val = 3;
        List ls1 = new ArrayList();
        List ls2 = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) ls1.add(arr[i]);
            else ls2.add(arr[i]);
        }
        List res = new ArrayList();
        res.addAll(ls2);
        res.addAll(ls1);
        System.out.println(res);
    }

}


