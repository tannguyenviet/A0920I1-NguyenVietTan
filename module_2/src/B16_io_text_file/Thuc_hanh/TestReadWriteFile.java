package B16_io_text_file.Thuc_hanh;

import java.io.*;

public class TestReadWriteFile {
    public static void main(String[] args)  {
        try{
            FileReader fileReader = new FileReader("./src/B16_io_text_file/fileOutputt.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line =null;
            BufferedWriter writer = new BufferedWriter(new FileWriter("./src/B16_io_text_file/fileOutput.txt"));

            while ((line = reader.readLine())!=null){
                System.out.println(line);
                writer.write(line);
                writer.newLine();
            }
            writer.close();
            reader.close();
        }
       catch (IOException e){
           System.err.println("Không mở được file");
       }


    }
}
