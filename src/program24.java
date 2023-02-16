/*
Напишите метод, который составит строку, состоящую из 100 повторений 
слова TEST и метод, который запишет эту строку в простой текстовый файл, 
обработайте исключения.
*/
import java.io.FileWriter;
import java.io.IOException;
//import java.util.Arrays;


public class program24 {
    public static void main(String[] args) {

        String info = "test\n";
        try (FileWriter writer = new FileWriter("operationBubble.txt")) {
            for (int i = 0; i < 100; i++) {
                writer.write(String.valueOf(info));
            }        
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}