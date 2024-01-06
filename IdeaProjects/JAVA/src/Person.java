public class Person {
private String name;
private String gender;
private String birthDate;
Person(){}
    Person(String name,String gender,String birthDate)
    {
        this.birthDate=birthDate;
        this.gender=gender;
        this.name=name;
    }
    void print()
    {
        System.out.println("the name is "+name);
        System.out.println("the gender is "+gender);
        System.out.println("the birth date is "+birthDate);
    }
}
