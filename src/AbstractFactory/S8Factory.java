package AbstractFactory;

public class S8Factory implements PhoneFactory{
    @Override
    public Phone getPhone(String model, String battery, int size) {
        return new S8(model,battery,size);
    }
}
