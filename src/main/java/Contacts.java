import au.com.bytecode.opencsv.CSVReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Contacts {
    private static final String SAMPLE_CSV_FILE_PATH = "src/main/resources/contacts.csv";
    Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));

    public Contacts() throws IOException {
    }
    public List<String[]> searchByText(String cache) throws IOException {

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