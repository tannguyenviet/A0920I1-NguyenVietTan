package newCaseStudy.Models.service;

import newCaseStudy.Commons.ReadWriteFile;
import newCaseStudy.Commons.Regex;
import newCaseStudy.Models.entity.Villa;
import newCaseStudy.exception.UserException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class VillaService {
    private  ComonService comonService;
    private  Regex regex;
    private  Scanner sc;
    private  ReadWriteFile readWriteFile;
    private  String VILLA_PATH = "./src/newCaseStudy/data/Villa.csv";
    private  List<Villa> villaList;
    public VillaService()  {
        comonService = new ComonService();
        regex = new Regex();
        sc = new Scanner(System.in);
        readWriteFile = new ReadWriteFile();
        villaList = new ArrayList<>();
        getAllVillaFromData();
    }
    public void showAllVilla() {
        AtomicInteger i= new AtomicInteger(0);
        villaList.forEach(x-> System.out.println(i.getAndIncrement()+" "+x.showInfo()));
    }
    public void inputNewVilla(){
        System.out.println("---------------------------------------------------");
        System.out.println("Input information about new villa : ");
        Villa newVilla = (Villa)comonService.inputService(1);
        String standardRoom;
        String detailConvenient;
        String areaPool;
        String floor;


        System.out.println("Input Standard room :");
        standardRoom = sc.nextLine();
        System.out.println("Input description about convenient :");
        detailConvenient=sc.nextLine();

        System.out.println("Input Area Pool: ");
        while(true){
            try{
                areaPool = (sc.nextLine());
                if(!regex.validateAreaPool(areaPool)){
                    throw new  UserException("Area Pool must have smaller than 30 m2");
                }
                else{
                    break;
                }
            }
            catch (UserException e){
                System.out.println(e.getMessage());
                System.out.println("Please, Try again!");
            }
        }

        System.out.println("Input Number of Villa Floor");
        floor =  (sc.nextLine());
        while(!regex.validateFloor(floor)){
            System.out.println("Please, Try again!");
            floor =  (sc.nextLine());
        };
        newVilla.setAreaPool(Double.parseDouble(areaPool));
        newVilla.setAnotherConvenient(detailConvenient);
        newVilla.setFloorVilla(Integer.parseInt(floor));
        newVilla.setStandardRoom(standardRoom);
        villaList.add(newVilla);
        System.out.println("Sucess Add New Villa !!");
            readWriteFile.writeFile(VILLA_PATH,newVilla.toString(),true);
    }
    public void getAllVillaFromData() {
        String[] villaListLine = new String[0];
            villaListLine = readWriteFile.readFile(VILLA_PATH).split("\n");

        for(int i =0;i<villaListLine.length;i++){
            String[] propertiesVilla = villaListLine[i].split(",");
            villaList.add(new Villa(propertiesVilla[0],propertiesVilla[1],Double.parseDouble(propertiesVilla[2]),Integer.parseInt(propertiesVilla[3]),Integer.parseInt(propertiesVilla[4]),propertiesVilla[5],propertiesVilla[6],propertiesVilla[7],Double.parseDouble(propertiesVilla[8]),Integer.parseInt(propertiesVilla[9])));
        }

    };

    public List<Villa> getVillaList() {
        return villaList;
    }

    public Villa getVillaById(int index)  {
        List<Villa> villaList = getVillaList();
        return villaList.get(index);
    }
    public String getVillaIdByIndex(int index){
        List<Villa> villaList = getVillaList();
        return villaList.get(index).getId();
    }
    public List<String> getAllVillaName()  {
          List<String> villaListName = new ArrayList<>();
        for (Villa villa : villaList) {
            villaListName.add(villa.getName());
        }
        return villaListName;
    }
    public void showAllNameVillaNotDuplicate(){
        List<String> villaNameList = getAllVillaName();
        TreeSet<String> villaTreeSet = new TreeSet<>(villaNameList);
        for(String villaName:villaTreeSet){
            System.out.println(villaName);
        }
    }
}
