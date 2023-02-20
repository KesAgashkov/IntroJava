
    import java.util.ArrayList;
    import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

    
    //Заполнить список названиями планет Солнечной системы в 
    //произвольном порядке с повторениями. 
    //Вывести название каждой планеты и количество его повторений в списке.
    //Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.

    
    public class program33 {
        public static void main(String[] args) {        
            ArrayList<String> planet = new ArrayList<String>(Arrays.asList("Земля","Марс","Юпитер","Сатурн","Уран","Земля",
            "Нептун","Меркурий","Уран","Земля","Нептун","Меркурий","Юпитер",
            "Сатурн","Уран","Венера","Марс","Юпитер"));           
            
            System.out.print(planet);
            System.out.println();

            /*for (int i = 0; i < planet.size(); i++) {
                for (int j = 1; j < planet.size(); j++) {
                if (planet.get(i).equals(planet.get(j))){                
                    planet.remove(j);                
                }
                }*/
            Set<String> uniqueSet = new HashSet<String>(planet);             
            System.out.print(uniqueSet);
        }        
                
    }   
     