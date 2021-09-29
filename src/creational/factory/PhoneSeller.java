package creational.factory;

public class PhoneSeller {

    public static void main(String[] args) {
        Phone s8 = PhoneFactory.getPhone("s8","2700mah",6);
        Phone note8 = PhoneFactory.getPhone("note8","300mah",7);

        System.out.println(s8);
        System.out.println(note8);
    }
}

