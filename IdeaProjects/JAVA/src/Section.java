import java.util.ArrayList;

public class Section {
 private int id;
 private String name;
 private Employee sectionHead;
 private ArrayList<Employee> employees;

 public Section(int id, String name, Employee sectionHead) {
 this.id = id;
 this.name = name;
 this.sectionHead = sectionHead;
 this.employees = new ArrayList<Employee>();
 }

 public void addEmployee(Employee employee) {
    employees.add(employee);
 }
    public void removeEmployee(Employee employee) {
 employees.remove(employee);
 }
    public void printSectionInfo() {
 System.out.println("Section Information:");
 System.out.println("ID: " + id);
 System.out.println("Name: " + name);
 System.out.print("Section Head ");
sectionHead.report();
System.out.println();
 if(employees.size()==0)
System.out.println("this department is empty of employees .");
else
 {
 System.out.println("Employees:");
 for (Employee employee : employees) {
 employee.report();
System.out.println();
 }
 }
}
}