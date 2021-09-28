package AbstractFactory;

public interface PhoneFactory {

    Phone getPhone(String model,String battery,int size);
}
