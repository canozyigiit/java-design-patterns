package Builder;

public class EstateAgent {
    public static void main(String[] args) {
        Home home = new Home();
        home.setCity("Sivas");
        home.setCounty("Merkez");
        home.setDistrict("Akdeğirmen");
        home.setRoomCount(5);

        Home home2 = new Home("Sivas","Merkez","Mevlana",5,2018,2,false,false,true);
        System.out.println(home);
        System.out.println(home2);
    }
}
