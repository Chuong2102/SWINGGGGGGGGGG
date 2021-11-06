package Bai6_StudentForm;

import java.util.Date;


public class Worker extends Person{
	private String company;

    public Worker() {

    }

    public Worker(String company, String name, int gender, Date birthDay) {
        super(name, gender, birthDay);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
