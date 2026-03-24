class Car extends MotorVehicle{
    protected int trunkLoad;
    protected int numberOfPassengers;

    public Car(Engine engine, String mark, String model, String color,
               double length, double width, double height,
               int trunkLoad, int numberOfPassengers){
        super(engine, mark, model, color, length, width, height);
        this.trunkLoad = trunkLoad;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public void printInfo(){
        System.out.println("-----CAR-----");
        super.printInfo();
        System.out.println("Trunk load: " + trunkLoad);
        System.out.println("Number of passengers: " + numberOfPassengers);
    }
}
