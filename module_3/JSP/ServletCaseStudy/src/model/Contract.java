package model;

public  class Contract {
    private String id;
    private String start_date;
    private String end_date;
    private String deposit;
    private String contract_total_money;
    private String employee_id;
    private String customer_id;
    private String service_id;

    public Contract() {
    }

    public Contract(String id, String start_date, String end_date, String deposit, String contract_total_money, String employee_id, String customer_id, String service_id) {
        this.id = id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.deposit = deposit;
        this.contract_total_money = contract_total_money;
        this.employee_id = employee_id;
        this.customer_id = customer_id;
        this.service_id = service_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getContract_total_money() {
        return contract_total_money;
    }

    public void setContract_total_money(String contract_total_money) {
        this.contract_total_money = contract_total_money;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getService_id() {
        return service_id;
    }

    public void setService_id(String service_id) {
        this.service_id = service_id;
    }
}
