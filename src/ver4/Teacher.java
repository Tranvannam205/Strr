
package ver4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Teacher extends Person {

    private String department;
    private String teachingSubject;

    public Teacher() {
    }

    public Teacher(String department, String teachingSubject, String id, String fullName, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    public void addPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID :");
        String id = sc.nextLine();
        this.setId(id);
        System.out.println("fullName :");
        String fullName = sc.nextLine();
        this.setFullName(fullName);
        System.out.println("date of birth :");
        String ngaySinh = sc.nextLine();
        SimpleDateFormat sft = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfBirth = sft.parse(ngaySinh);
            this.setDateOfBirth(dateOfBirth);
        } catch (Exception e) {
            System.out.println("Wrong fomat !");
        }
        System.out.println("department :");
        String department = sc.nextLine();
        this.setDepartment(department);
        System.out.println("teachingSubject :");
        String teachingSubject = sc.nextLine();
        this.setTeachingSubject(teachingSubject);
    }

    public void updatePerson() {

    }

    public void displayInfo() {
        System.out.println("hien thi thong tin giao vien :");
        System.out.println("ID :" + this.getId());
        System.out.println("FullName :" + this.getFullName());
        SimpleDateFormat sft = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("date of birth :" + sft.format(dateOfBirth));
        System.out.println("department :" + this.getDepartment());
        System.out.println("teachingSubject :" + this.getTeachingSubject());
    }

}

