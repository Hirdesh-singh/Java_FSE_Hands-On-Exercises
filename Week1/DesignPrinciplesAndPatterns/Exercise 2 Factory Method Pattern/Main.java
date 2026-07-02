public class Main {

    public static void main(String[] args) {

        Vehicle car = VehicleFactory.getVehicle("CAR");
        car.manufacture();

        Vehicle bike = VehicleFactory.getVehicle("BIKE");
        bike.manufacture();

    }

}