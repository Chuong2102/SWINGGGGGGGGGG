package Bai6_StudentForm;

import java.util.Date;

public class Student extends Person{
	private String School;

    public Student() {
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
}
