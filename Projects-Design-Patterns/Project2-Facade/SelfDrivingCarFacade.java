public class SelfDrivingCarFacade {
    private String carModel;
    private Engine engine;
    private Headlights headlights;
    private Gear gear;
    private Accelerator accelerator;
    private GPS gps;

    public SelfDrivingCarFacade(String carModel) {
        this.carModel = carModel;
        this.engine = new Engine();
        this.headlights = new Headlights();
        this.gear = new Gear();
        this.accelerator = new Accelerator();
        this.gps = new GPS();
    }

    public void startCar(){
        engine.injectFuel();
        engine.igniteFuel();
        headlights.turnOn();
    }

    public void moveCar(){
        gear.changeGear();
        accelerator.accelerate();
    }

    public void followDirectionsToLocation(String location){
        gps.navigateByGPSToLocation(location);
    }

    public void parkCar(){
        System.out.println("Parked the car");
        headlights.turnOff();
        engine.turnOffIgnition();
    }

    public void driveToLocation(String location){
        this.startCar();
        this.moveCar();
        this.followDirectionsToLocation(location);
        this.parkCar();
        System.out.println("You have reached the destination!");
    }
}
