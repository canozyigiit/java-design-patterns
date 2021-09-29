package creational.factory;

public class Note8 implements Phone {

    private String model;
    private String battery;
    private int size;

    public Note8(String model, String battery, int size) {
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

    public void setModel(String model) {
        this.model = model;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Note8{" +
                "model='" + model + '\'' +
                ", battery='" + battery + '\'' +
                ", size=" + size +
                '}';
    }
}
