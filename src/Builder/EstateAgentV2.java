package Builder;

public class EstateAgentV2 {
    public static void main(String[] args) {
        Home home = HomeBuilder.startBuild("Sivas","Merkez","Akdeğirmen",5,2020)
                .setPool(false)
                .setDublex(false)
                .build();


        System.out.println(home);
    }
}
