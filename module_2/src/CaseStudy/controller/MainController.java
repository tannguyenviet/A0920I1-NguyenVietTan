package CaseStudy.controller;

import CaseStudy.common.Regex;
import CaseStudy.common.UserValid;
import CaseStudy.exception.*;
import CaseStudy.model.entity.*;
import CaseStudy.model.service.*;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class MainController {
    private static String CUSTOMER_PATH ="./src/CaseStudy/data/Customer.csv";
    private static String HOUSE_PATH ="./src/CaseStudy/data/House.csv";
    private static String VILLA_PATH = "./src/CaseStudy/data/Villa.csv";
    private static String ROOM_PATH ="./src/CaseStudy/data/Room.csv";
    private static String BOOKING_PATH ="./src/CaseStudy/data/Booking.csv";
    private VillaService villaService = new VillaService();
    private HouseService houseService;
    private RoomService roomService;
    private CustomerService customerService;
    private EmployeeService employeeService;
    private Regex regex;
    private UserValid userValid;
    private  ReadWriteFile readWriteFile;
    public MainController() throws IOException {
        houseService = new HouseService();
        roomService = new RoomService();
        customerService = new CustomerService();
        employeeService = new EmployeeService();
        regex = new Regex();
        readWriteFile = new ReadWriteFile();
        userValid = new UserValid();

    }

    /** Program display list Villa in Order
     * @throws IOException
     */
    public void showAllVilla() throws IOException {
        List<Villa> villaList = villaService.getAllVilla();

        AtomicInteger index = new AtomicInteger(0);
        // Print Villa list in order
        villaList.forEach(x->{
            System.out.println(index.incrementAndGet()+x.getInfo());
        });

    }
    public void showAllHouse() throws IOException {
        System.out.println(readWriteFile.readFile(HOUSE_PATH));

    }
    public void showAllRoom() throws IOException {
        System.out.println(readWriteFile.readFile(ROOM_PATH));

    }
    public void showAllNameVillaNotDuplicate() throws IOException {
        List<String> villaListName = villaService.getAllVillaName();
        TreeSet<String> villaTreeSet = new TreeSet<>(villaListName);
        for(String villaName:villaTreeSet){
            System.out.println(villaName);
        }
    }
    public void showServices() throws IOException {
        System.out.println(
                "1. Show all Villa\n" +
                "2. Show all House\n" +
                "3. Show all Room\n" +
                "4. Show All Name Villa Not Duplicate\n" +
                "5. Show All Name House Not Duplicate\n" +
                "6. Show All Name Name Not Duplicate\n" +
                "7. Back to menu\n" +
                "8. Exit");

        Scanner sc = new Scanner(System.in);
        int choice =Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                showAllVilla();
                break;
            case 2:
                showAllHouse();
                break;
            case 3:
               showAllRoom();
                break;
            case 4:
                showAllNameVillaNotDuplicate();
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                displayMenu();
        }
    }
    public Services inPutServices(int typeServices){
        String id;
        String name;
        Double areaUsed;
        int rentCost;
        int maxPeople;
        String typeRent;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã");
        id = sc.nextLine();
        while(!regex.validateId(id)){
            System.out.println("Nhập lại mã");
            id =sc.nextLine();
        };

        System.out.println("Nhập tên dịch vụ");
        name = sc.nextLine();
        while(!regex.validateName(name)){
            System.out.println("Nhập lại tên dịch vụ");
            name =sc.nextLine();
        };

        System.out.println("Nhập diện tích sử dụng");
        areaUsed = Double.parseDouble(sc.nextLine());
        while(regex.validateAreaPool(areaUsed)){
            System.out.println("Nhập lại diện tích sử dụng");
            areaUsed = Double.parseDouble(sc.nextLine());
        };

        System.out.println("Nhập chi phí thuê");
        rentCost = Integer.parseInt(sc.nextLine());
        while(!regex.validateRentCost(rentCost)){
            System.out.println("Nhập lại chi phí thuê");
            rentCost = Integer.parseInt(sc.nextLine());
        };

        System.out.println("Nhập số lượng người tối đa");
        maxPeople=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập kiểu thuê ");
        typeRent = sc.nextLine();

        while(!regex.validateMaxPeople(maxPeople)){
            System.out.println("Nhập lại số lượng người tối đa");
            maxPeople =  Integer.parseInt(sc.nextLine());
        };
        switch (typeServices){
            case 1:
            return new Villa(id,name,areaUsed,rentCost,maxPeople,typeRent);

            case 2:
                return new House(id,name,areaUsed,rentCost,maxPeople,typeRent);

            case 3:
                return new Room(id,name,areaUsed,rentCost,maxPeople,typeRent);

        }
        return null;
    }

    public void addNewServices(){
        System.out.println(
                "1. Add New Villa\n" +
                "2. Add New House\n" +
                "3. Add New Room\n" +
                "4. Back to menu\n" +
                "5. Exit");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                String standardRoom;
                String detailConvenient;
                double areaPool;
                int floor;

                System.out.println("---------------------------------------------------");
                System.out.println("Nhập dịch vụ Villa mới : ");
                // typeservice 1 -> Villa, 2->Home, 3->Room
                Villa villa =(Villa) inPutServices(1);

                //

                System.out.println("Nhập tiêu chuẩn phòng");
                standardRoom = sc.nextLine();
                System.out.println("Nhập mô tả chi tiết tiện nghi");
                detailConvenient=sc.nextLine();

                System.out.println("Nhập diện tích hồ bơi");
                while(true){
                    try{
                        areaPool = sc.nextDouble();
                        if(!regex.validateAreaPool(areaPool)){
                            throw new UserException("Diện tích phải là 1 số lớn hơn 30m2");
                        }
                        break;
                    }
                    catch (UserException e){
                        System.out.println("Mời bạn nhập laij");
                    }
                }


//                areaPool =  Double.parseDouble(sc.nextLine());
//                while(regex.validateAreaPool(areaPool)){
//                    System.out.println("Nhập lại diện tích hồ bơi");
//                    areaPool =  Double.parseDouble(sc.nextLine());
//                };

                System.out.println("Nhập số tầng của Villa");
                floor =  Integer.parseInt(sc.nextLine());
                while(!regex.validateFloor(floor)){
                    System.out.println("Nhập lạisố tầng của Villa");
                    floor =  Integer.parseInt(sc.nextLine());
                };
                villa.setArePool(areaPool);
                villa.setDetailConvenient(detailConvenient);
                villa.setFloor(floor);
                villa.setStandardRoom(standardRoom);

                try {
                    readWriteFile.writeFile(VILLA_PATH,villa.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }

//                Villa newVilla = new Villa(id,name,areaUsed,rentCost,maxPeople,typeRent,standardRoom,detailConvenient,areaPool,floor);


                // Chương trình cho phép nhập các thuộc tinh của villa vào sau đó ghi file data/Villa.svc
                break;
            case 2:
                String standardRoomHouse;
                String detailConvenientHouse;
                int floorHouse;

                System.out.println("-------------------------------------------------");
                System.out.println("Input New House  : ");
                House house = (House) inPutServices(2);


                //

                System.out.println("input Standard room house");
                standardRoomHouse = sc.nextLine();
                System.out.println("input Describe convenient room house");
                detailConvenientHouse=sc.nextLine();


                System.out.println("Input number of floor");
                floorHouse =  Integer.parseInt(sc.nextLine());
                while(!regex.validateFloor(floorHouse)){
                    System.out.println("Please! Input number of floor");
                    floorHouse =  Integer.parseInt(sc.nextLine());
                };

                house.setDetailConvenient(detailConvenientHouse);
                house.setFloor(floorHouse);
                house.setStandardRoom(standardRoomHouse);

                try {
                    readWriteFile.writeFile(HOUSE_PATH,house.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //Khi người dùng chọn chức năng số 2 thì chương trình sẽ cho phép nhập các thuộc
                //tính của House và sau đó ghi vào file data/House.csv

                break;
            case 3:
                //Khi người dùng chọn chức năng số 3 thì chương trình sẽ cho phép nhập các thuộc
                //tính của Room và sau đó ghi vào file data/Room.csv
                String freeServicesRoom;

                System.out.println("-------------------------------------------------");
                System.out.println("Input New House  : ");
                Room room = (Room) inPutServices(3);

                //

                System.out.println("Input type free service");
                freeServicesRoom= sc.nextLine();
                room.setFreeServices(freeServicesRoom);
                try {
                    readWriteFile.writeFile(ROOM_PATH,room.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 4:

                try {
                    displayMenu();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 5:
                break;

        }
    }
    public void addNewCustomer() throws IOException {
        String name;
        String birthday;
        String gender;
        int choiceGender;
        String identityCard;
        String phoneNumber;
        String email;
        String typeCustomer;
        String address;
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------");
        System.out.println("Input new Customer: ");

        System.out.println("Name: ");


//        while(!userValid.validName(name)){
//            System.out.println("Please! Input Name again ");
//            name =  sc.nextLine();
//        };
        while(true){
            try {
                name =  sc.nextLine();
                if(userValid.validName(name)){
                    break;
                }
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Date Of Birth : ");
        while(true){
            try {
                birthday =  sc.nextLine();
                if(userValid.validBirthday(birthday)){
                    break;
                }
            } catch (BirthdayException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Gender : ");

        while(true){
            try {
                gender = sc.nextLine();
                choiceGender = userValid.validGender(gender);
                break;
            } catch (GenderException e) {
                System.out.println(e.getMessage());
            }
        }
        switch (choiceGender){
            case 0:
                gender = "Male";
                break;
            case 1:
                gender ="FeMale";
                break;
            case 2:
                gender = "Unknown";
        }

        System.out.println("Identity Card : ");
        identityCard =  sc.nextLine();
        while(true){
            try {
                identityCard =  sc.nextLine();
                if(userValid.validIdCard(identityCard)){
                    break;
                }
            } catch ( IdCardException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Phone Number : ");
        while(true){
            try {
                phoneNumber =  sc.nextLine();
                if(userValid.validPhoneNumber(phoneNumber)){
                    break;
                }
            } catch ( PhoneException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Email : ");

        while(true){
            try {
                email =  sc.nextLine();
                if(userValid.validMail(email)){
                    break;
                }
            } catch ( EmailException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Type Customer : ");
        typeCustomer =  sc.nextLine();
        System.out.println("Address : ");
        address =  sc.nextLine();
        Customer customer =  new Customer(name,birthday,gender,identityCard,phoneNumber,email,typeCustomer,address);
        readWriteFile.writeFile(CUSTOMER_PATH,customer.toString());
    }
    public void showInfoCustomer() throws IOException {
        List<Customer> listCus =customerService.getAllCustomer();
        listCus.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer customer, Customer t1) {
                int choice = customer.getName().compareTo(t1.getName());
                if (choice==0){
                    return Integer.parseInt(customer.getDateOfBirth().substring(6,10))-Integer.parseInt(t1.getDateOfBirth().substring(6,10));
                }
                else return choice;
            }
        });
        AtomicInteger auto =  new AtomicInteger(1);


        for(int i =0;i<listCus.size();i++){
            System.out.println(i+". "+listCus.get(i).showInfo());
        }
    }
    public void addNewBook() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------Add New Booking----------");
        List<Customer> customerList=customerService.getAllCustomer();
        AtomicInteger i= new AtomicInteger(0);
//        for(Customer customer:customerList){
//            System.out.println(customer.getInfo());
//        }
        customerList.forEach(x->{
            System.out.println(i.getAndIncrement()+" "+x.getInfo());;
            ;
        });
        System.out.println("Input index of customer have booking");
        int index = Integer.parseInt(sc.nextLine());
        Customer customerSelected = customerService.getCustomerByID(index);
        System.out.println(
                "1.Booking Villa\n" +
                "2.Booking House\n" +
                "3.Booking Room\n");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                showAllVilla();
                System.out.println("Input index of villa have booking");
                int indexVilla = Integer.parseInt(sc.nextLine());
                Villa villaSelected = villaService.getVillaById(indexVilla);
                customerSelected.setServices(villaSelected);

                customerSelected.showInfo();
                break;
            case 2:
                showAllHouse();
                System.out.println("Input index of House have booking");
                int indexHouse = Integer.parseInt(sc.nextLine());
                House houseSelected = houseService.getHouseById(indexHouse);
                customerSelected.setServices(houseSelected);

                break;
            case 3:
                showAllRoom();
                System.out.println("Input index of Room have booking");
                int indexRoom = Integer.parseInt(sc.nextLine());
                Room roomSelected = roomService.getRoomById(indexRoom);
                customerSelected.setServices(roomSelected);

                break;
        }
    }
    public void showInfoEmployee() throws IOException {
        List<Employee> listEmployee = employeeService.getAllEmployee();
        Map<Integer,Employee> employeeMap = new HashMap<>();
        for(Employee employee:listEmployee){
            employeeMap.put(employee.getId(),employee);
        }
        Set<Integer> set = employeeMap.keySet();
        for (Integer key : set) {
            System.out.println(key + " " + employeeMap.get(key).toString());
        }
    }
    public void bookCinemaTicket() throws IOException {

        System.out.println("------------Booking Cinema----------");
        List<Customer> customerList=customerService.getAllCustomer();
        AtomicInteger i= new AtomicInteger(0);

        Queue<Customer> customerQueue = new LinkedList<>(customerList);
    }
    public void displayMenu() throws IOException {
        System.out.println(
                "!-----------MENU----------!\n"+
                "1. Add New Services\n" +
                "2. Show Services\n" +
                "3. Add New Customer\n" +
                "4. Show Information of Customer\n" +
                "5. Add New Booking\n" +
                "6. Show Information of Employee\n" +
                "7. Exit");
        Scanner sc = new Scanner(System.in);
        int choice =Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                addNewServices();
                displayMenu();
                break;
            case 2:
                showServices();
                displayMenu();
                break;
            case 3:
                addNewCustomer();
                displayMenu();
                break;
            case 4:
                showInfoCustomer();
                displayMenu();
                break;
            case 5:
                addNewBook();
                displayMenu();
                break;
            case 6:
                showInfoEmployee();
                displayMenu();
                break;
            case 7:
                break;
        }
    }
    public static void main(String[] args) throws IOException {
        MainController main = new MainController();
            main.displayMenu();
    }
}
