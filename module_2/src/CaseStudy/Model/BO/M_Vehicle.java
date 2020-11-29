package CaseStudy.Model.BO;

import CaseStudy.Model.Entity.Car;
import CaseStudy.Model.Entity.Data;
import CaseStudy.Model.Entity.Trucke;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;


public class M_Vehicle {
    private ArrayList<Trucke> arrTrucke;
    private ArrayList<Car> arrCar;
    private String data;
    public ArrayList<Trucke> getListTruck(){
//        Data data.getDataTruck();
        return this.arrTrucke;
    }
    public ArrayList<Car> getListCar(){
//        Data data.getDataTruck();
        return this.arrCar;
    }

    public void SetListTruck() throws IOException {
        // Call Data and return data Truck
        Data data = new Data();
        String json = data.readFileFromData("./src/CaseStudy/Json_Data/truck.txt");
        Gson gson = new Gson();
        Type objectType = new TypeToken<ArrayList<Trucke>>(){}.getType();
        this.arrCar = gson.fromJson(json,objectType);
         // Xu li xau String d để set giá trị cho arrTruck
    }
    public void SetListCar() throws IOException {
        // Call Data and return data Truck

        Data data = new Data();
        String json = data.readFileFromData("./src/CaseStudy/Json_Data/car.txt");
        Gson gson = new Gson();
        Type objectType = new TypeToken<ArrayList<Car>>(){}.getType();
        this.arrCar = gson.fromJson(json,objectType);

    }

}
