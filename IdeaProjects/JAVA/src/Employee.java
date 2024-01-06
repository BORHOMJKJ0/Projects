import java.util.Scanner;

public abstract class Employee{
 Scanner input=new Scanner(System.in);
 private int employeeNumber;
 private static int counter=1;
 private String address,fullName;
 private int year,month,day;
 protected boolean serving;
 public Employee()
 {
 employeeNumber=counter;
 counter++;
 }
 public Employee(String address, String fullName,boolean serving) {
 employeeNumber=counter;
 this.address = address;
 this.fullName = fullName;
 this.serving=serving;
 counter++;
 }
 public void setBirthDate(int day,int month,int year)
 {
 while(day>31 || month>12 ||year>2023 ||year<1900)
 {
 System.out.println("Error input .please tyr again .");
 System.out.println("enter birthdate as following order :day,month,year");
 day=input.nextInt();
 month=input.nextInt();
 year=input.nextInt();
 }
 this.day=day;
 this.month=month;
 this.year=year;
 }
 public abstract void addVacation();
 public abstract void getVacation();
 public int getEmployeeNumber() {
 return employeeNumber;
 }
 public void setEmployeeNumber(int employeeNumber) {
 this.employeeNumber = employeeNumber;
}
 public void report()
 {
 System.out.println("Personal Information of Employee : ");
 System.out.println("his name is "+fullName+" . ");
 System.out.println("his number is "+employeeNumber+" . ");
 System.out.println("his address is "+address+" . ");
 System.out.println("his birthDate is "+day+"/"+month+"/"+year);
}
}