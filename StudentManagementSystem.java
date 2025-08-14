package taskonconclassandfun.student_management;

import java.util.HashMap;
import java.util.Scanner;

public class StudentManagementSystem {

    private static HashMap<Integer ,Student> studentMap = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
         int choice;
        do{
            System.out.println("\n  ******** student management system ******** ");
            System.out.println("1.  add student");
            System.out.println("2.  view all student");
            System.out.println("3.  Search Student by Roll No");
            System.out.println("4.  Update Student");
            System.out.println("5.  delete student");
            System.out.println("6.  Exit ");
            System.out.println("enter choice:   ");
            choice=sc.nextInt();

            switch(choice){
                case 1 ->addStudent();
                case 2 ->viewStudents();
                case 3 ->searchStudent();
                case 4 ->updateStudent();
                case 5 ->deleteStudent();
            }
        }while(choice !=6);
    }

    //delete student
    private static void deleteStudent() {
        System.out.println("Enter RollNo:   ");
        int rollNo = sc.nextInt();
        if(studentMap.remove(rollNo)!=null){
            System.out.println("Student Deleted Succesfully");
        }else{
            System.out.println("Student Not found");
        }
    }
    //update student
    private static void updateStudent() {
        System.out.println("Enter RollNo:   ");
       int rollNo = sc.nextInt();
       Student s = studentMap.get(rollNo);
       if(s==null){
        System.out.println("Student Not Found");
        return;
       }
       sc.nextLine();
       System.out.println("Enter New Name:  ");
       s.setName(sc.nextLine());
       System.out.println("Enter New Age:   ");
       s.setAge(sc.nextInt());
       sc.nextLine();
       System.out.println("Enter New Course:    ");
       s.setCourse(sc.nextLine());
       System.out.println("Student updated successfully!");
    }

    //add students
    private static void addStudent() {
        System.out.println("Enter rollNo:   ");
        int rollNo = sc.nextInt();
        if(studentMap.containsKey(rollNo)){
            System.out.println("Roll No Already Exist");
            return;
        }
        sc.nextLine();
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Age:  ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Course:   ");
        String course = sc.nextLine();

        studentMap.put(rollNo, new Student(rollNo, name, age, course));

        System.out.println("Student Added Succesfully");
    }

    //view Students
    private static void viewStudents(){
        if(studentMap.isEmpty()){
            System.out.println("No Students Found!");
            return;
        }
        studentMap.values().forEach(System.out::println);
    }

    //searchStudent
    private static void searchStudent(){
        System.out.println("Enter RollNo:   ");
        int rollNo=sc.nextInt();
        Student s = studentMap.get(rollNo);
        if(s !=null){
            System.out.println(s);
        }else{
            System.out.println("Student not found");
        }
    }
      
}
