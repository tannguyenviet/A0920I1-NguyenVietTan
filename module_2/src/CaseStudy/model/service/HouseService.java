package CaseStudy.model.service;

import CaseStudy.model.entity.House;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HouseService {
    private ReadWriteFile readWriteFile;
    public HouseService(){
        readWriteFile = new ReadWriteFile();
    }
    public List<House> getAllHouse() throws IOException {
        String[] houseListLine;
        List<House> houseList = new ArrayList<>();
        houseListLine = readWriteFile.readFile("./src/CaseStudy/data/House.csv").split("\n");
        for(int i =0;i<houseListLine.length;i++){
            String[] propertiesHouse = houseListLine[i].split(",");
            houseList.add(new House((propertiesHouse[0]),propertiesHouse[1],Double.parseDouble(propertiesHouse[2]),Integer.parseInt(propertiesHouse[3]),Integer.parseInt(propertiesHouse[4]),propertiesHouse[5],propertiesHouse[6],propertiesHouse[7],Integer.parseInt(propertiesHouse[8])));
        }
        return houseList;
    };
    public House getHouseById(int index) throws IOException {
        List<House> houseList = getAllHouse();
        String s = "124129512";

        return houseList.get(index);
    }
    public List<String> getAllHouseName() throws IOException {
        String[] houseListLine;
        List<String> houseListName = new ArrayList<>();
        houseListLine = readWriteFile.readFile("./src/CaseStudy/data/House.csv").split("\n");
        for (String s : houseListLine) {
            String[] propertiesHouse = s.split(",");
            houseListName.add(propertiesHouse[0]);
        }
        return houseListName;
    }
}
