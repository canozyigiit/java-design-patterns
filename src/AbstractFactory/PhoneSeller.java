package AbstractFactory;

import Factory.PhoneFactory;

public class PhoneSeller {

    public static void main(String[] args) {
        Note8Factory note8Factory = new Note8Factory();
        S8Factory s8Factory = new S8Factory();
        Phone s8 = s8Factory.getPhone("s8","2700mah",6);
        Phone note8 = note8Factory.getPhone("note8","300mah",7);

        System.out.println(s8);
        System.out.println(note8);
    }
}

