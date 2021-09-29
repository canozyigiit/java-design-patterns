package creational.abstractFactory;

public class Note8Factory implements PhoneFactory{
    @Override
    public Phone getPhone(String model, String battery, int size) {
        return new Note8(model,battery,size);
    }
}
