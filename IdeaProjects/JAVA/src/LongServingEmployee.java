public class LongServingEmployee extends FullTimeEmployee{
 private int ServingYearsNumber=15;
 public LongServingEmployee(String address, String fullName, int ServingYearsNumber,boolean serving)
 {
 super(address, fullName, ServingYearsNumber,serving);
 }
@Override
 public void CalcLeave(){
  int years=ServingYearsNumber;
    years-=15;
vacation+=30;
vacation+=years/2;}
@Override
public void addVacation()
 {
 vacation++;
 }
 @Override
 public void getVacation()
{
 System.out.println("Vacations are "+vacation);
}
@Override
 public void report(){
  this.CalcLeave();
super.report();}}