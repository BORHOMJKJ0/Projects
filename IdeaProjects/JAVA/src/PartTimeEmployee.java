
public class PartTimeEmployee extends Employee{
 private int workedHours;
 private static int hoursalary=3500;
        public PartTimeEmployee(String address, String fullName, int workedHours,boolean serving) {
 super(address, fullName,serving);
 this.workedHours=workedHours;
 }
 @Override
 public void addVacation(){}
    @Override
    public void getVacation(){}
    public int CalcPay()
{
return hoursalary*workedHours;
}
        @Override
 public void report(){
 super.report();
System.out.println("his monthSalary is : "+CalcPay());
}
    }
