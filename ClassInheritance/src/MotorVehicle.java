abstract class MotorVehicle {
    protected Engine engine;
    protected String mark;
    protected String model;
    protected String color;
    protected double length;
    protected double width;
    protected double height;

    public MotorVehicle(Engine engine, String mark, String model, String color, double length, double width, double height){
        this.engine = engine;
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void printInfo(){
        System.out.println("Mark" + mark);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Engine model: " + engine.model);
        System.out.println("Engine weight: " + engine.weight);
        System.out.println("Engine horse power: " + engine.horsePower);
        System.out.println("Engine consumption: " + engine.consumption);
    }

}
