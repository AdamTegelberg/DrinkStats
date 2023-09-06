import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Map<String, Integer> map = new HashMap<String, Integer>();

        try {   
            File file = new File("C:/Users/AdamTH/AdventOfCode22/DrinkStats/src/utskrifter.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String name = scanner.nextLine().split(" ")[0];
                if (!map.containsKey(name)) {
                    map.put(name, 1);
                } else {
                    map.put(name, map.get(name) + 1);
                }
            }
            System.out.println(map);
            scanner.close();

        } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }



    }
}
