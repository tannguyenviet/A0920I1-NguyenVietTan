package change_format_Date_Sql;

import java.io.*;

public class ReadWriteFile {
    public String readFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = null;
        String rs = "";
        while((line = reader.readLine())!=null){
            rs+=line;rs+="\n";
        }
        return rs;
    }
    public void writeFile(String path,String data) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path,true));
        System.out.println(data);
        writer.write(data);
        writer.newLine();
        writer.close();
    }
}
