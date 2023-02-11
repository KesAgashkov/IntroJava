import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        List ls1 = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) ls1.add(arr[i]);
            if (arr[i] == 0) ls1.clear();
            }
        System.out.println(ls1);
        }
    }
