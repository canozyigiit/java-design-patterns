package creational.factory;

public class PhoneFactory {

    public static Phone getPhone(String model,String battery,int size){
        Phone phone;
        if ("s8".equalsIgnoreCase(model)){
            phone = new S8(model,battery,size);
        }else if("note8".equalsIgnoreCase(model)){
            phone = new Note8(model,battery,size);
        }else {
            throw new RuntimeException("Geçersiz bir telefon modeli girdiniz.");
        }
        return phone;
    }
}
