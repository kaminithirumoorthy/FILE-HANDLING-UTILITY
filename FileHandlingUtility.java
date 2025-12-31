import java.io.*;
public class FileHandlingUtility {

    static String fileName = "data.txt";

    public static void main(String[] args) {

        writeFile();
        readFile();
        modifyFile();
        readFile();
    }

    // Write data into file
    public static void writeFile() {
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write("Welcome to Java File Handling.\n");
            fw.write("This file is created using Java.");
            fw.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing file.");
        }
    }

    // Read data from file
    public static void readFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("\nReading file content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error while reading file.");
        }
    }

    // Modify file by appending data
    public static void modifyFile() {
        try {
            FileWriter fw = new FileWriter(fileName, true);
            fw.write("\nThis line is added to modify the file.");
            fw.close();
            System.out.println("\nFile modified successfully.");
        } catch (IOException e) {
            System.out.println("Error while modifying file.");
        }
    }
}

