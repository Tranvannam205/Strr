
package Ver2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Student extends Person{
    private float GPA;
    private String major;
    private double tuiition;
    private boolean  schoolarship;

    public Student() {
    }

    public Student(float GPA, String major, double tuiition, String id, String fullname, Date dateOfBirth) {
        super(id, fullname, dateOfBirth);
        this.GPA = GPA;
        this.major = major;
        this.tuiition = caculateTuiition();
        this.schoolarship = (GPA>=9.0);
    }

    

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
        this.tuiition=caculateTuiition();
        this.schoolarship=caculateschoolarship();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getTuiition() {
        return tuiition;
    }

    public void setTuiition(double tuiition) {
        this.tuiition = tuiition;
    }

    public boolean isSchoolarship() {
        return schoolarship;
    }

    public void setSchoolarship(boolean schoolarship) {
        this.schoolarship = schoolarship;
    }
    
    public double caculateTuiition(){
        if(GPA>=9.0){
            return 5000000;
        }
        else{
            return 10000000;
        }
    }
    private boolean caculateschoolarship(){
        return (GPA>=9.0);
    }
    public void addStudent(){
        Scanner sc=new Scanner (System.in);
        System.out.println("ID :");
        String id=sc.nextLine();
        this.setId(id);
        System.out.println("FullName :");
        String fullName=sc.nextLine();
        this.setFullname(fullName);
        System.out.println("GPA :");
        float GPA=Float.parseFloat(sc.nextLine());
        this.setGPA(GPA);
        System.out.println("Major :");
        String major=sc.nextLine();
        this.setMajor(major);
        System.out.println("date of birth :");
        String ngaySinh=sc.nextLine();
        SimpleDateFormat sft=new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date dateOfBirth=sft.parse(ngaySinh);
            this.setDateOfBirth(dateOfBirth);
        }catch(Exception e){
            System.out.println("Wrong Fomat !");
        }
            
    }
    public void displayInfo(){
        System.out.println("hien thi thong tin sinh vien :");
        System.out.println("ID :"+this.getId());
        System.out.println("FullName :"+this.getFullname());
        System.out.println("GPA :"+this.getGPA());
        System.out.println("Major :"+this.getMajor());
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("date of birth :"+sdf.format(dateOfBirth));
        System.out.println("tuiition :"+(long)this.getTuiition());
        System.out.print("schoolarship :");
        if(schoolarship){
            System.out.println("sinh vien co  hoc bong");
        }
        else {
            System.out.println("sinh vien khong co hoc bong");
        }
    }
    
}
