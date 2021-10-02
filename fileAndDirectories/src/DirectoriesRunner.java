import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DirectoriesRunner {
    public static void main(String[] args) {
        try {
            ///Reading from file
            //To get all the files in the directory
            // Files.list(Paths.get(".")).forEach(System.out::println);
            //To get current Directory
            Path currentDirectory = Paths.get(".");
            System.out.println(currentDirectory);
            //Path to read the file from
            Path fileToRead = Paths.get("./fileAndDirectories/resources/data.txt");
            //Reading everything present in file
            System.out.println(Files.readAllLines(fileToRead).get(0));

            //To read lines from file using Java 8
            Files.lines(fileToRead).map(String::toUpperCase).filter(str -> str.contains("S")).forEach(System.out::println);

            //Writing Content to file
            Path fileToWrite = Paths.get("./fileAndDirectories/resources/data-written.txt");
            Files.write(fileToWrite, List.of("Jyoti", "Wrote", "to", "the", "file"));
            Files.lines(fileToWrite).forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
