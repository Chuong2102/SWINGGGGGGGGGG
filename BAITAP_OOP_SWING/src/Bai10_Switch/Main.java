/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai10_Switch;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy", Locale.ENGLISH);
        String input = "20-11-2002";
        
        Date birthday = df.parse(input);
        Person person = new Person("Nguyen Van A", 0, birthday);
        
        System.out.println("\nFull Name: " + person.getName() +
                            "\nGender: " + person.getGender() +
                            "\nBirthDay: " + df.format(person.getBirthDay()));
        
        Student student = new Student();
        
        student.setName("Nguyen Van B");
        student.setGender(1);
        student.setBirthDay(df.parse("21-01-2002"));
        student.setSchool("Hue University");
        
        System.out.println("\nFull Name: " + student.getName() +
                            "\nGender: " + student.getGender() +
                            "\nBirthDay: " + df.format(student.getBirthDay()) +
                            "\nSchool name: " + student.getSchool());
        
        System.out.println(student.CalcTax(1000));
        
        Worker worker = new Worker();
        
        worker.setName("Nguyen Van C");
        worker.setGender(1);
        worker.setBirthDay(df.parse("30-04-1975"));
        worker.setCompany("Viettel");
        
        System.out.println("\nFull Name: " + worker.getName() +
                            "\nGender: " + worker.getGender() +
                            "\nBirthDay: " + df.format(worker.getBirthDay()) +
                            "\nCompany name: " + worker.getCompany());
        System.out.println(worker.CalcTax(1000));
        
    }
}
