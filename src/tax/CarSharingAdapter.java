package tax;

public class CarSharingAdapter implements TaxiService {
    private CarSharing carSharing;

    public CarSharingAdapter(CarSharing carSharing) {
        this.carSharing = carSharing;
    }

    @Override
    public void requestTaxi(Passenger passenger) {
        Driver driver = new Driver();
        carSharing.rentFreeCar(driver);
        System.out.println("Car rented for passenger.");
    }
}