class Truck extends MotorVehicle{

    protected int maximumLoad;

    public Truck(Engine engine, String mark, String model, String color,
                 double length, double width, double height,
                 int maximumLoad){
        super(engine, mark, model, color, length, width, height);
        this.maximumLoad = maximumLoad;
    }

    @Override
    public void printInfo(){
        System.out.println("-----TRUCK-----");
        super.printInfo();
        System.out.println("Maximum load that it can pull: " + maximumLoad);
    }

}
