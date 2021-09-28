package Builder;

public class EstateAgentV2 {
    public static void main(String[] args) {
        Home home = HomeBuilder.startBuild("Sivas","Merkez","Akdeğirmen",5,2020)
                .setPool(false)
                .setDublex(false)
                .build();


        Home home1 = HomeBuilder.startBuild("Sivas","Merkez","Mevlana",6,2019)
                        .build();

        Home home2 = HomeBuilder.startBuild("Sivas","Merkez","Kılavuz",5,2015)
                        .setDublex(false)
                        .setPool(false)
                        .setBathCount(3)
                        .setHasCarPax(true)
                        .build();
        System.out.println(home);
        System.out.println(home1);
        System.out.println(home2);
    }
}
