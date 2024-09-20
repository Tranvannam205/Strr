
package Ver2;

import java.util.Scanner;


public class Processor {
     public static void main(String[] args) {
        StudentList list=new StudentList();
        Scanner sc=new Scanner (System.in);
        int luaChon;
        do{
            System.out.println("1. Thêm mới student");
            System.out.println("2. Cập nhật student bởi id");
            System.out.println("3. Xoá student bởi id");
            System.out.println("4. Hiển thị tất cả sinh viên");
            System.out.println("5. Tìm sinh viên có điểm gpa cao nhất");
            System.out.println("6. Hiển thị sinh viên có học bổng");
            System.out.println("7. Hiển thị tổng học phí của tất cả sinh viên");
            System.out.println("8. ket thuc chuong trinh");
            luaChon=sc.nextInt();
            sc.nextLine();
            
            switch(luaChon){
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
                    list.findScholarshipStudent();
                    break;
                case 7:
                    System.out.println("Tong hoc phi tat ca Sinh Vien : "+(long)list.caculateTuiitionOfAllStudents());
                    break;
                case 8:
                    System.out.println("exit ");
                default :
                    System.out.println("chuong trinh khong hop le !");
                    
            }
        }while(luaChon!=8);
        
        
    }

}
