package BaiTapAnhHai;

import BaiTapAnhHai.Controller.C_Truck;
import BaiTapAnhHai.DAO.Data;
import BaiTapAnhHai.Entity.Truck;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void printChoiceCarOrTruck(){
        System.out.println("1. Truck");
        System.out.println("2. Car");
    }
    public static void printTruck(Truck truck){
        System.out.println(truck.getName()+" "+truck.getColor()+" "+truck.getId()+" "+truck.getLimitWeight()+" "+truck.getStock());
    }
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        C_Truck c_truck = new C_Truck();
        int choice=0;
        do {
            System.out.println("Mời bạn nhập lựa chọn");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm danh sách");
            System.out.println("3. Xóa danh sách");
            System.out.println("4. Thoát!  ");
            choice = Integer.parseInt(sc.nextLine());
            int CarOrTruck=0;
            switch (choice){
                // view
                case 1:
                    printChoiceCarOrTruck();
                    CarOrTruck =  Integer.parseInt(sc.nextLine());
                    if(CarOrTruck ==1){
                        c_truck.view();
                    }
                    break;
                // insert
                case 2:
                    printChoiceCarOrTruck();
                    CarOrTruck =  Integer.parseInt(sc.nextLine());
                    if(CarOrTruck==1){
                        c_truck.insert();
                    }
                    else{

                    }

                    break;
                case 3:
                // delete
                    printChoiceCarOrTruck();
                    CarOrTruck =  Integer.parseInt(sc.nextLine());
                    if(CarOrTruck==1){
                        int index;
                        System.out.println("Nhập vị trí muốn xóa");
                        index = Integer.parseInt(sc.nextLine());
                        c_truck.viewOneProduct(index);
                        int YesOrNo =0;
                        System.out.println("Bạn có chắc chắn xóa product này không");
                        YesOrNo=Integer.parseInt(sc.nextLine());
                        if(YesOrNo==1){
                            c_truck.delete(index);
                        }


                    }
                    else{

                    }
            }
        }while (choice!=4);




        int CarOrTruck =  Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:

        }

    }
}
