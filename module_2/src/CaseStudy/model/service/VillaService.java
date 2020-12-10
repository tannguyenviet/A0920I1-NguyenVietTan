package CaseStudy.model.service;

import CaseStudy.model.service.ReadWriteFile;
import CaseStudy.model.entity.Villa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VillaService {
    private ReadWriteFile readWriteFile;
    public VillaService(){
        readWriteFile = new ReadWriteFile();
    }
    public List<Villa> getAllVilla() throws IOException {
        String[] villaListLine;
        List<Villa> villaList = new ArrayList<>();
        villaListLine = readWriteFile.readFile("./src/CaseStudy/data/Villa.csv").split("\n");
        for(int i =0;i<villaListLine.length;i++){
            String[] propertiesVilla = villaListLine[i].split(",");
            villaList.add(new Villa(propertiesVilla[0],propertiesVilla[1],Double.parseDouble(propertiesVilla[2]),Integer.parseInt(propertiesVilla[3]),Integer.parseInt(propertiesVilla[4]),propertiesVilla[5],propertiesVilla[6],propertiesVilla[7],Double.parseDouble(propertiesVilla[8]),Integer.parseInt(propertiesVilla[9])));
        }
        return villaList;
    };
    public Villa getVillaById(int index) throws IOException {
        List<Villa> villaList = getAllVilla();
        String s = "124129512";
        
        return villaList.get(index);
    }
    public List<String> getAllVillaName() throws IOException {
        String[] villaListLine;
        List<String> villaListName = new ArrayList<>();
        villaListLine = readWriteFile.readFile("./src/CaseStudy/data/Villa.csv").split("\n");
        for (String s : villaListLine) {
            String[] propertiesVilla = s.split(",");
            villaListName.add(propertiesVilla[0]);
        }
        return villaListName;
    }
}
