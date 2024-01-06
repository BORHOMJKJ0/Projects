public class Hospital extends Building{
    String name;
    int bedsNumber;
    int departmentsNumber;
    Hospital(){}
    Hospital(String name,int buildingNumber,int floorsNumber,int floorArea,int bedsNumber,int departmentsNumber)
    {
        super(buildingNumber,floorsNumber,floorArea);
        this.bedsNumber=bedsNumber;
        this.departmentsNumber=departmentsNumber;
        this.name=name;
    }
    @Override
    void print(){
        System.out.println("The hospital Info ");
        super.print();
        System.out.println("The name of Hospital is"+name);
        System.out.println("The number of beds is "+bedsNumber);
        System.out.println("The number of Department is "+departmentsNumber);
    }
}
