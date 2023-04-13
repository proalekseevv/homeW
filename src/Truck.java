public class Truck extends WheeledTransport implements  Engineable {

    public Truck (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        checkTyres();
        checkEngine();
        checkTrailer();
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void updateTyre(){
        System.out.println(
                "Меняем покрышку у груз-ка"
        );
    }
}
