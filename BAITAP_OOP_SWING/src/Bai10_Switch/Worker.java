/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai10_Switch;

import java.util.Date;

public class Worker extends Person implements TaxInterface{
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
    
    @Override
    public double CalcTax(double income) {
        double tax = income * 0.06;
        return tax;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
