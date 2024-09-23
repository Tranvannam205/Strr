
package ver4;

import java.util.Scanner;


public class Processor {
    public static void main(String[] args) {
        PersonList list=new PersonList();
        Scanner sc=new Scanner (System.in);
        int luaChon;
        do{
            System.out.println("1. Add a new student");
            System.out.println("2. Add a new teacher");
            System.out.println("3. Update person ");
            System.out.println("4. Delete person by id");
            System.out.println("5. Display all students and teachers");
            System.out.println("6. Find the student with the highest GPA");
            System.out.println("7. Find a teacher by department");
            System.out.println("8. exit");
            luaChon=sc.nextInt();
            sc.nextLine();
            switch(luaChon){
                case 1:
                    list.addStudent();
                    break;
                case 2:
                    list.addTeacher();
                    break;
                case 3:
                    list.updatePerson();
                    break;
                case 4:
                    list.deletePersonById();
                    break;
                case 5:
                    list.displayAllPerson();
                    break;
                case 6:
                    list.findTopStudent();
                    break;
                case 7:
                    list.findTeacherByDepartment();
                    break;
                case 8:
                    System.out.println("exit.");
                default :
                    System.out.println("chuong trinh khong hop le");
            }
                    
        }while(luaChon!=8);
    }
}
