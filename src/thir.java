import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        logger.info(String.valueOf(5));
        try (FileWriter writer = new FileWriter("test.txt")) {
            String info = "information\n";
            for (int i = 0; i < 100; i++) {
                writer.write(String.valueOf(info));
                logger.info(info);
            }
            FileHandler fileHandler =new FileHandler();


        } catch (IOException e) {

        }


    }
}


