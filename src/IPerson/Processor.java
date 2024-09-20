
package IPerson;

import java.util.Scanner;


public class Processor {
    public static void main(String[] args) {
        StudentList list = new StudentList();
        Scanner sc = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("---------------------");
            System.out.println("1. Add a new student");
            System.out.println("2. Update a student's GPA by ID");
            System.out.println("3. Delete a student by ID");
            System.out.println("4. Display all students");
            System.out.println("5. Find the student with the highest GPA");
            System.out.println("6. Exit");
            System.out.print("Choice :");
            luaChon = sc.nextInt();
            sc.nextLine();
            
            switch (luaChon) {
                case 1:
                    list.addStudent();
                    break;
                case 2:
                    list.updateStudentById();
                    break;
                case 3:
                    list.deleteStudentById();
                    break;
                case 4:
                    list.displayAllStudent();
                    break;
                case 5:
                    list.findTopStudent();
                    break;
                case 6:
                    System.out.println("Exit ");
                default :
                    System.out.println("chuong trinh khong hop le");
                    
            }
        }while(luaChon!=6);
    }
}
