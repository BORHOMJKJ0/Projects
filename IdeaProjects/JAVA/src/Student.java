public class Student extends Person {
    String university;
    String collage;
     String department;
    Student(String name,String gender,String birthDate,String university,String collage,String department)
    {
        super(name, gender, birthDate);
        this.university=university;
        this.collage=collage;
        this.department=department;
    }

    @Override
    void print() {
        System.out.println("Student Info ");
        super.print();
        System.out.println("the university is "+university);
        System.out.println("the collage is "+collage);
        System.out.println("the department is "+department);
    }
}