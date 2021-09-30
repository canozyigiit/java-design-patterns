package structural.decorator;


public class App {

    public static void main(String[] args) {
        // çelenk ile dekore edilmiş noel ağacı
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        System.out.println(tree1.decorate());


        // iki tane çelenk ve ışıkla dekore edilmiş noel ağacı
        ChristmasTree tree2 = new BubbleLights(new Garland(new Garland(new ChristmasTreeImpl())));
        System.out.println(tree2.decorate());


    }

}

