import java.util.Scanner;

public class School extends Building {
    String name;
    int classesNumber;
    School(){}
    School(int buildingNumber,int floorsNumber,int floorArea,String name,int classesNumber)
    {
        super(buildingNumber,floorsNumber,floorArea);
        this.name=name;
        this.classesNumber=classesNumber;
    }
    @Override
    void print(){
        System.out.println("The school Info ");
        super.print();
        System.out.println("The name od school is "+name);
        System.out.println("The number of classes in floor is "+classesNumber);
    }
}
