import au.com.bytecode.opencsv.CSVReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Contacts {
    private static final String SAMPLE_CSV_FILE_PATH = "/Users/oleksandr_senkevych/Downloads/CSVParser/src/main/resources/contacts.csv";

//    public Contacts(String name) {
//        this.name = name;
//    }
//
//    public Contacts() throws IOException {
//        try (
//                Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
//                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
//        ) {
//            for (CSVRecord csvRecord : csvParser) {
//                // Accessing Values by Column Index
//                String name = csvRecord.get(0);
//                String email = csvRecord.get(1);
//                String phone = csvRecord.get(2);
//                String country = csvRecord.get(3);
//
//                System.out.println("Record No - " + csvRecord.getRecordNumber());
//                System.out.println("---------------");
//                System.out.println("Name : " + name);
//                System.out.println("Email : " + email);
//                System.out.println("Phone : " + phone);
//                System.out.println("Country : " + country);
//                System.out.println("---------------\n\n");
//
//            }
//        }
//    }
//}

    public List<String[]> name(String cache) throws IOException {
        Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
        CSVReader csvReader = new CSVReader(reader);

        List<String[]> records = csvReader.readAll();
            List<String[]> listOfCards  = new ArrayList<String[]>();

            for (String[] record : records) {
                for (String findedCards : record){
                        if (findedCards.contains(cache)){
                            listOfCards.add(record);
                        }
                }
        }
        return listOfCards;
    }
}