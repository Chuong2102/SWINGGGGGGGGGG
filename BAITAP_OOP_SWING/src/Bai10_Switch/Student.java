/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai10_Switch;

import java.util.Date;

public class Student extends Person implements TaxInterface{
    public String getHocLuc() {
		return hocLuc;
	}



	public void setHocLuc(String hocLuc) {
		this.hocLuc = hocLuc;
	}



	public double getHocBong() {
		return hocBong;
	}



	public void setHocBong(double hocBong) {
		this.hocBong = hocBong;
	}



	private String School;
    private String hocLuc;
    private double hocBong;
    
    public Student() {
    }
    
    
    
    public Student(String school, String hocLuc, double hocBong) {
		super();
		School = school;
		this.hocLuc = hocLuc;
		this.hocBong = hocBong;
	}

    public Student(String School, String name, int gender, Date birthday, String hocLuc) {
    	super(name, gender, birthday);
    	// Test
    	System.out.println("Name: " + name + " Gender: " + gender + " Birthdate: " + birthday);
    	
        this.School = School;
        this.hocLuc = hocLuc;
    }

	public Student(String School, String name, int gender, Date birthDay) {
        super(name, gender, birthDay);
        this.School = School;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String School) {
        this.School = School;
    }

    @Override
    public double CalcTax(double income) {
        double tax = income * 0.01;
        return tax;
    }



	@Override
	public String toString() {
		String ketqua = super.toString();
		ketqua += "Student [School=" + School + ", hocLuc=" + hocLuc + ", hocBong=" + hocBong + "]";
		return ketqua;
	}

    
    
}
