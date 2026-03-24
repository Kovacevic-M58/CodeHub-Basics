public class Main {
    public static void main(String[] args) {

        Engine carEngine = new Engine(180, 150, 6, "TDI");
        Engine truckEngine = new Engine(300, 300, 20, "Diesel");

        Car car = new Car(carEngine, "Peugeot", "308", "White", 3.8,
                1.9, 1.6, 200, 5);

        Truck truck = new Truck(truckEngine, "Volvo", "2000", "Black",
                5, 2.5, 3, 6000);


        car.printInfo();
        System.out.println();
        truck.printInfo();
    }
}