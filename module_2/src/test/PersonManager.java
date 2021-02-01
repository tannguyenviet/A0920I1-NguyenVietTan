package test;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
    private List<Person> personList;
    public PersonManager(){
        personList = new ArrayList();
        personList.add(new Person("Tan",12));
        personList.add(new Person("Vinh",25));
        personList.add(new Person("Tuan",11));
        personList.add(new Person("Lan",16));
        personList.add(new Person("Anh",17));
        personList.add(new Person("Trang",12));
        personList.add(new Person("Tan",12));

    }
    public void updatePerson(Person person){
        int index = personList.indexOf(person);
        if(index==-1){
            System.out.println(index);
        }
        else{
            personList.get(index).setName("LANNNNN");
        }
    }
}
