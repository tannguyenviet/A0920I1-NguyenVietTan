package CaseStudy.Model.Entity;

import java.io.*;

public class Data {
    public String readFileFromData(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = null;
        String data = "";
        while((line = reader.readLine())!=null){
            data += line;
        }
        return data;
    }
    public void writeFileFromData(String path,String st) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        writer.write(st);
    }
}
