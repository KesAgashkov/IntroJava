import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//Заполнить список названиями планет Солнечной системы в 
//произвольном порядке с повторениями. 
//Вывести название каждой планеты и количество его повторений в списке.

public class program32 {
    public static void main(String[] args) {        
        ArrayList<String> planet = new ArrayList<String>(Arrays.asList("Земля","Марс","Юпитер","Сатурн","Уран","Земля",
        "Нептун","Меркурий","Уран","Земля","Нептун","Меркурий","Юпитер",
        "Сатурн","Уран","Венера","Марс","Юпитер")); 
        //ArrayList<String> result = new ArrayList<String>();
        //int count = 1;
        System.out.print(planet);
        System.out.println();
        /*for (int i = 0; i < planet.size(); i++) {
            for (int j = 1; j < planet.size(); j++) {
            if (planet.get(i).equals(planet.get(j))){
                count++;
                planet.remove(j);                
            }
            }
            result.add(planet.get(i));    
            result.add(String.valueOf(count));
            count = 0; } */          
        
            Set<String> uniqueSet = new HashSet<String>(planet);  
            for (String i : uniqueSet) {  
                System.out.println(i + ": " + Collections.frequency(planet, i)); 
            }   
        }       
}
