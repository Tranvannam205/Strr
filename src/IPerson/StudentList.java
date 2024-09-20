
package IPerson;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import javax.lang.model.util.SimpleAnnotationValueVisitor14;


public class StudentList {
    private ArrayList<Student>studentList =new ArrayList<>();

    public StudentList() {
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    public void addStudent(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so luong sinh vien can them :");
        int nhap=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<nhap;i++){
            System.out.println("so luong sinh vien can them "+(i+1)+":");
            Student student=new Student();
            student.addStudent();
            studentList.add(student);
        }
            
    }
    public void updateStudentById(){
        Scanner sc=new Scanner (System.in);
        System.out.println("nhap ID sinh vien can cap nhat :");
        String id=sc.nextLine();
        for(int i=0;i<studentList.size();i++){
            if(studentList.get(i).getId().equals(id)){
                System.out.println("cap nhat :");
                Student capNhat=new Student();
                System.out.println("fullName moi :");
                capNhat.setFullName(sc.nextLine());
                System.out.println("GPA moi :");
                capNhat.setGPA(Float.parseFloat(sc.nextLine()));
                System.out.println("date of birth :");
                String dob=sc.nextLine();
                SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
                try{
                    capNhat.setDateOfBirth(sdf.parse(dob));
                }catch(Exception e){
                    System.out.println("Wrong Fomat!");
                }
                System.out.println("Major moi :");
                capNhat.setMajor(sc.nextLine());
                studentList.set(i, capNhat);
                    
            }
                
        }
            
    }
    public void deleteStudentById(){
        Scanner sc=new Scanner (System.in);
        System.out.println("nhap ID sinh vien can xoa :");
        String id=sc.nextLine();
        for(int i=0;i<studentList.size();i++){
            if(studentList.get(i).getId().equals(id)){
                studentList.remove(i);
                System.out.println("ID :"+id+"da duoc xoa .");
            }
        }
            
    }
    public void displayAllStudent(){
        for(int i=0;i<studentList.size();i++){
            Student student=studentList.get(i);
            student.displayInfo();
            System.out.println();
        }
            
    }
    public void findTopStudent(){
        Student max=studentList.get(0);
        for(int i=0;i<studentList.size();i++){
            Student student=studentList.get(i);
            if(student.getGPA()>max.getGPA()){
                max=student;
            }
        }
        System.out.println("sinh vien co GPA lon nhat :");
        max.displayInfo();
    }
        
        
}
