package CaseStudy.model.service;

import CaseStudy.model.entity.Room;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RoomService {
    private ReadWriteFile readWriteFile;
    public RoomService(){
        readWriteFile = new ReadWriteFile();
    }
    public List<Room> getAllRoom() throws IOException {
        String[] roomListLine;
        List<Room> roomList = new ArrayList<>();
        roomListLine = readWriteFile.readFile("./src/CaseStudy/data/Room.csv").split("\n");
        for(int i =0;i<roomListLine.length;i++){
            String[] propertiesRoom = roomListLine[i].split(",");
            roomList.add(new Room((propertiesRoom[0]),propertiesRoom[1],Double.parseDouble(propertiesRoom[2]),Integer.parseInt(propertiesRoom[3]),Integer.parseInt(propertiesRoom[4]),propertiesRoom[5],propertiesRoom[6]));
        }
        return roomList;
    };
    public Room getRoomById(int index) throws IOException {
        List<Room> roomList = getAllRoom();
        String s = "124129512";

        return roomList.get(index);
    }
    public List<String> getAllRoomName() throws IOException {
        String[] roomListLine;
        List<String> roomListName = new ArrayList<>();
        roomListLine = readWriteFile.readFile("./src/CaseStudy/data/Room.csv").split("\n");
        for (String s : roomListLine) {
            String[] propertiesRoom = s.split(",");
            roomListName.add(propertiesRoom[0]);
        }
        return roomListName;
    }
}
