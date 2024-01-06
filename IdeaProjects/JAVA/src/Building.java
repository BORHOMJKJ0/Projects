class Building {
    int buildingNumber;
    int floorsNumber;
    int floorArea;
    Building(){}
    Building(int buildingNumber,int floorsNumber,int floorArea)
    {
        this.buildingNumber=buildingNumber;
        this.floorsNumber=floorsNumber;
        this.floorArea=floorArea;
    }
    void print()
    {
        System.out.println("The number of building is "+buildingNumber);
        System.out.println("The number of floors is "+floorsNumber);
        System.out.println("The floor area is "+floorArea);
    }

}
