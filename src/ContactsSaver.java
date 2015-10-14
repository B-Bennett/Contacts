import jodd.json.JsonSerializer;
import jodd.json.JsonParser;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by BennettIronYard on 10/14/15.
 */
public class ContactsSaver {
    public static void main(String[] args) throws IOException{
        File f = new File("contact.txt");

        Contact bob = new Contact();
        bob.name = "Bob";
        bob.address = "510 Mill Street";
        bob.email = "bob@thatmail.com";
        bob.age = 35;

        JsonSerializer serializer = new JsonSerializer();
        String contentsToSave = serializer.serialize(bob);

        FileWriter fw = new FileWriter(f);
        fw.write("Hello, world!");
        fw.close();

        FileReader fr = new FileReader(f);
        int fileSize = (int) f.length();
        char[] contents = new char[fileSize];
        fr.read(contents);
        String fileContents = new String(contents);

        JsonParser parser = new JsonParser();
        Contact newBob = parser.parse(fileContents, Contact.class);
        System.out.println(newBob.name);
    }
}
