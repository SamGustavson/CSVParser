
import java.io.IOException;
import java.util.Scanner;
public class BasicCSVReader {

    public static void main(String[] args) throws IOException {

        Contacts contacts = new Contacts();

        System.out.println("-- Enter name to find contacts card (Example: Андрей)");

        Scanner scanner = new Scanner(System.in);
        String inputCache = scanner.nextLine();

        for (String[] contactCards : contacts.name(inputCache)) {
            for (String contactFields : contactCards) {
                if (!contactFields.equals("")) {
                    System.out.println(contactFields);
                }
            }  System.out.println("_____ ______ ______ ____");
        }
        if (contacts.name(inputCache).isEmpty()){
            System.out.println("----- try it once more ");
        }
    }
}
