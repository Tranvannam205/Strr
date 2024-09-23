
package ver4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class PersonList {
    private ArrayList<Person> personList = new ArrayList<>();

    public PersonList() {
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong sinh vien can them :");
        int nhap = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < nhap; i++) {
            System.out.println("so luong sinh vien can them "+(i+1)+":");
            Student student = new Student();
            student.addPerson();
            personList.add(student);

        }
    }

    public void addTeacher() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong giao vien :");
        int nhap = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < nhap; i++) {
            System.out.println("so luong giao vien can them"+(i+1)+":");
            Teacher teacher = new Teacher();
            teacher.addPerson();
            personList.add(teacher);
        }

    }

    public void updatePerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id can cap nhat:");
        String id = sc.nextLine();
        for (int i = 0; i < personList.size(); i++) {

            Person person = personList.get(i);
            if (person.getId().equals(id)) {
                if (person instanceof Student) {
                    System.out.println("cap nhat sinh vien");
                    Student capnhat = (Student) person;
                    System.out.println("FullName moi :");
                    capnhat.setFullName(sc.nextLine());
                    System.out.println("GPA moi :");
                    capnhat.setGPA(Float.parseFloat(sc.nextLine()));
                    System.out.println("date of birth :");
                    String dob = sc.nextLine();
                    SimpleDateFormat asd = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        capnhat.setDateOfBirth(asd.parse(dob));
                    } catch (Exception e) {
                        System.out.println("Wrong fomat !");
                    }
                    System.out.println("Major :");
                    capnhat.setMajor(sc.nextLine());

                } else if (person instanceof Teacher) {
                    Teacher capnhat = (Teacher) person;
                    System.out.println("FullName moi :");
                    capnhat.setFullName(sc.nextLine());
                    System.out.println("date of birth moi :");
                    String bob = sc.nextLine();
                    SimpleDateFormat asd = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        capnhat.setDateOfBirth(asd.parse(bob));
                    } catch (Exception e) {
                        System.out.println("Wrong fomat!");
                    }
                    System.out.println(" department moi :");
                    capnhat.setDepartment(sc.nextLine());
                    System.out.println("teachingSubject moi :");
                    capnhat.setTeachingSubject(sc.nextLine());
                }
            }

        }

    }

    public void deletePersonById() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id can xoa :");
        String id = sc.nextLine();
        for (int i = 0; i < personList.size(); i++) {

            if (personList.get(i).getId().equals(id)) {
                personList.remove(i);
                System.out.println("id :" + id + " da duoc xoa .");
            }
        }

    }

    public void displayAllPerson() {
        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            person.displayInfo();
            System.out.println();
        }
    }

    public void findTopStudent() {
        Student max = (Student) personList.get(0);
        for (int i = 0; i < personList.size(); i++) {
            Student student = (Student) personList.get(i);
            if (student.getGPA() > max.getGPA()) {
                max = student;
            }
        }
        System.out.println("sinh vien co GPA cao nhat :");
        max.displayInfo();
    }

    public Teacher findTeacherByDepartment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap  department can tim :");
        String department = sc.nextLine();
        for (int i = 0; i < personList.size(); i++) {
            Teacher teacher = (Teacher) personList.get(i);
            if (teacher.getDepartment().equals(department)) {
                teacher.displayInfo();
                System.out.println();
            }

        }
        return null;

    }


}
