public class ServiceStation {

    public void check(WheeledTransport wheeledTransport) {
        wheeledTransport.check();

    }

    public void check(Car car) {
        car.checkTyres();
        car.checkEngine();
    }

    public void check(Bicycle bicycle) {
        bicycle.checkTyres();
    }

    public void check(Truck truck) {
        truck.checkTyres();
        truck.updateTyre();
        truck.checkEngine();
    }


}
