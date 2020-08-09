package games.utilities;
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
 
  
public class FileManager {
    public static void writeToFile(String saveState, String fileName){
      
       Path file = Paths.get("activity.txt");
        Charset cset = Charset.forName("UTF-16");
        if (Files.notExists(file)) { //Check for file
        System.out.println("");
        try (BufferedReader stdin = new BufferedReader ( new InputStreamReader (System.in));
                BufferedWriter fout = Files.newBufferedWriter(file, cset);) {
            String line = "";
            while ((line = stdin.readLine()) != null && line.length() != 0) {
                    fout.write(line);
                    fout.newLine();
                }
            fout.flush();
        } catch (IOException ex) {
            System.err.println(ex);
        }
        System.out.println("File written.");
        } else {
            System.out.println("Reading file ....");
            try (BufferedReader fin = Files.newBufferedReader(file, cset);) {
                String line = "";
         while ((line = fin.readLine()) != null) {
                System.out.println(line);
            }
            } catch (IOException ex) {
                System.err.println(ex);
            }
        }
    }
    public static void writeToFileAsync(final String saveState, final String fileName) {
        new Thread() {
            @Override
            public void run() {
                writeToFile(saveState, fileName);
            }
        }.start();
    }
}