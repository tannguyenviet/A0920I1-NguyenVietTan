package CaseStudy.model.entity;

public class Room extends Services {
    private String freeServices;

    public Room(String id, String name, double areaUsed, int rentCost, int maxPeople, String typeRent, String freeServices) {
        super(id, name, areaUsed, rentCost, maxPeople, typeRent);
        this.freeServices = freeServices;
    }

    public Room(String id, String name, double areaUsed, int rentCost, int maxPeople, String typeRent) {
        super(id, name, areaUsed, rentCost, maxPeople, typeRent);
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public void showInfo() {

    }
    @Override
    public String toString(){
        return this.getId()+","+this.getName()+","+this.getAreaUsed()+","+this.getRentCost()+","+this.getMaxPeople()+","+this.getTypeRent()+","+this.getFreeServices();

    }
}
