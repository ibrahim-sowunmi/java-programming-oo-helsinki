
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        
        File document = new File(file);
        List<String> docs = new ArrayList<String>();
        Scanner reader = new Scanner(document);
        
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            docs.add(line);
        }
        
        reader.close();
        
        return docs;
    }

    public void save(String file, String text) throws IOException {
            File document = new File(file);
            if (document.exists()) {
                FileWriter writer = new FileWriter(file, true);
                writer.write(text);
                writer.close();
            } else {
                FileWriter writer = new FileWriter(file);
                writer.write(text);
                writer.close();
            }
            
        }

    public void save(String file, List<String> texts) throws IOException {
        File document = new File(file);
        String s = "";
        for (String  string : texts) {
            s += string + "\n";
        }
        
        
            if (document.exists()) {
                FileWriter writer = new FileWriter(file, true);
                writer.write(s);
                writer.close();
            } else {
                FileWriter writer = new FileWriter(file);
                writer.write(s);
                writer.close();
            }
        
        
            
    }
    
}
