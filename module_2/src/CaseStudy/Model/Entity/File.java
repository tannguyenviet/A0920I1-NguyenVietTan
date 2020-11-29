package CaseStudy.Model.Entity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File {
    public String ReadFile() throws FileNotFoundException {
        FileReader fileReader = new FileReader("./src/CaseStudy/vehicle.csv");
        BufferedReader reader = new BufferedReader(fileReader);
        String line = "Doc";
        return line;
    }



    public File() throws FileNotFoundException {
        System.out.println("File Not Found");
    }
}
