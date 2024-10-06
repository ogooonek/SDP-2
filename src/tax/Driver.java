package tax;

public class Driver {
    private Car car;

    public void addCar(Car car) {
        this.car = car;
        System.out.println("Driver assigned to car: " + car.getModel());
    }
}