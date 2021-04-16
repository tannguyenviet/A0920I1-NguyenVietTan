package model;

public class Employee {
    private String id;
    private String name;
    private String birthday;
    private String id_card;
    private String salary;
    private String phone;
    private String email;
    private String position_id;
    private String education_id;
    private String division_id;
    private String username;

    public Employee() {
    }

    public Employee(String id, String name, String birthday, String id_card, String salary, String phone, String email, String position_id, String education_id, String division_id, String username) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.id_card = id_card;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.position_id = position_id;
        this.education_id = education_id;
        this.division_id = division_id;
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition_id() {
        return position_id;
    }

    public void setPosition_id(String position_id) {
        this.position_id = position_id;
    }

    public String getEducation_id() {
        return education_id;
    }

    public void setEducation_id(String education_id) {
        this.education_id = education_id;
    }

    public String getDivision_id() {
        return division_id;
    }

    public void setDivision_id(String division_id) {
        this.division_id = division_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
