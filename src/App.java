import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            // accept user input from the console
            System.out.println("Enter some text: ");
            Scanner input = new Scanner(System.in);
            String enterdText = input.nextLine();
            System.out.println(enterdText);
            
        }

        // Process a file and print it to the console
        // Wrap the file processing inside of a try-catch block
        try {
        
        File file = new File("stuff.txt");
        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println(line);

        }
        input.close();
    
        } catch (Exception e) {
            // TODO: handle exception
        }

        MyFileUtils utils = new MyFileUtils();
        try {
            System.out.println(utils.Subtract10(9));

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
