package model;

public class CusHaveContract {
    private String customer_id;
    private String customer_name;
    private String contract_id;
    private String contract_start_date;
    private String contract_end_date;
    private String contract_deposite;
    private String contract_total_money;
    private String service_id;
    private String employee_id;

    public CusHaveContract() {
    }

    public CusHaveContract(String customer_id, String customer_name, String contract_id, String contract_start_date, String contract_end_date, String contract_deposite, String contract_total_money, String service_id, String employee_id) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.contract_id = contract_id;
        this.contract_start_date = contract_start_date;
        this.contract_end_date = contract_end_date;
        this.contract_deposite = contract_deposite;
        this.contract_total_money = contract_total_money;
        this.service_id = service_id;
        this.employee_id = employee_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getContract_id() {
        return contract_id;
    }

    public void setContract_id(String contract_id) {
        this.contract_id = contract_id;
    }

    public String getContract_start_date() {
        return contract_start_date;
    }

    public void setContract_start_date(String contract_start_date) {
        this.contract_start_date = contract_start_date;
    }

    public String getContract_end_date() {
        return contract_end_date;
    }

    public void setContract_end_date(String contract_end_date) {
        this.contract_end_date = contract_end_date;
    }

    public String getContract_deposite() {
        return contract_deposite;
    }

    public void setContract_deposite(String contract_deposite) {
        this.contract_deposite = contract_deposite;
    }

    public String getContract_total_money() {
        return contract_total_money;
    }

    public void setContract_total_money(String contract_total_money) {
        this.contract_total_money = contract_total_money;
    }

    public String getService_id() {
        return service_id;
    }

    public void setService_id(String service_id) {
        this.service_id = service_id;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }
}
