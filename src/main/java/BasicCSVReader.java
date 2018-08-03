import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;

public class BasicCSVReader {
    private static final String SAMPLE_CSV_FILE_PATH = "/Users/oleksandr_senkevych/Documents/contacts.csv";

    public static void main(String[] args) throws IOException {

        Contacts contacts = new Contacts ();

        System.out.println("-- Enter name to find contacts card (Example: Андрей)");

        Scanner scanner = new Scanner(System.in);
        String cache = scanner.nextLine();


        System.out.println(contacts.name(cache));

//        if (Objects.equals(cache, contacts.name(String[]cache))){
//            System.out.println("--- Maybe this is your contact ");
//
//
//        } else{
//            System.out.println("-- Unknown command!");
//        }

//            for (String[] ecache : contacts.name(cache))
//            {
//                if (ecache.contains(cache))
//                {
//                    System.out.print("Great ");
//                    System.out.println(ecache);
//                }
//                else if (null){
//                    System.out.println("-- Unknown command!");
//                }

//            }

    }
}