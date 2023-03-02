import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

//1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
//2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
//3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.

public class prog61 {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 1, 2, 3, 2, 4, 5, 6, 3};
        HashSet<Integer> set = new HashSet<>(List.of(arr));
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>(List.of(arr)); 
        TreeSet<Integer> set2 = new TreeSet<>(List.of(arr));

        System.out.println(set);
        System.out.println(set1);
        System.out.println(set2);
    }
}
