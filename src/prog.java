import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class prog {

    public static void main(String[] args) {
        String[] arr = {"i", "love", "java" , "i"};
        Set<String> users = new HashSet<>();
        users.addAll(List.of(arr));
        System.out.println(users);
    }
   
    
}
