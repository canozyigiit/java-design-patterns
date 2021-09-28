package Factory;

public class S8 implements Phone {

    private String model;
    private String battery;
    private int size;

    public S8(String model, String battery, int size) {
        this.model = model;
        this.battery = battery;
        this.size = size;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBattery() {
        return battery;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "S8{" +
                "model='" + model + '\'' +
                ", battery='" + battery + '\'' +
                ", size=" + size +
                '}';
    }
}
