/* 
 */
//Заполнить список десятью случайными числами. 
//Отсортировать список методом sort() и вывести его на экран. 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class program31 {
    public static void main(String[] args) {
        
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        

        
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(100));  
        }
        System.out.print(list);
        Collections.sort(list);       
        System.out.println();
       
        System.out.print(list);
    }
        
        
}
