package taskonconclassandfun.student_management;

public class Student {
    //fields
    private int rollNo;
    private String name;
    private int age;
    private String course;

    //parameterized constrctor
    public Student(int rollNo,String name,int age,String course){
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
        this.course=course;
    }

    //getters and setters
    public int getRollNo(){return rollNo;}
    public String getName(){return name;}
    public int getAge(){return age;}
    public String getCourse(){return course;}

    public void setRollNo(int rollNo){this.rollNo=rollNo;}
    public void setName(String name){this.name=name;}
    public void setAge(int age){this.age=age;}
    public void setCourse(String course){this.course=course;}
    
    @Override
    public String toString() {
        return "StudentManagementSystem [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", course=" + course
                + "]";
    }
}
