package creational.abstractFactory;

public interface PhoneFactory {

    Phone getPhone(String model,String battery,int size);
}
