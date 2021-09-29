package creational.builder;

public class HomeBuilder {

    private String City;
    private String County;
    private String District;

    private int RoomCount;
    private int YearOfConstruction;
    private int BathCount;


    private boolean isDublex;
    private boolean isPool;
    private boolean hasCarPax;

    public static HomeBuilder startBuild(String city,String county, String district,int roomCount,int yearOfConstruction){
       HomeBuilder homeBuilder = new HomeBuilder();
       homeBuilder.City = city;
       homeBuilder.County = county;
       homeBuilder.District = district;
       homeBuilder.RoomCount = roomCount;
       homeBuilder.YearOfConstruction = yearOfConstruction;
       return homeBuilder;

    }

    public Home build(){
        Home home = new Home();
        home.setCity(City);
        home.setCounty(County);
        home.setDistrict(District);
        home.setRoomCount(RoomCount);
        home.setYearOfConstruction(YearOfConstruction);
        home.setBathCount(BathCount);
        home.setDublex(isDublex);
        home.setPool(isPool);
        home.setHasCarPax(hasCarPax);

        return  home;

    }



    public HomeBuilder setBathCount(int bathCount) {
        BathCount = bathCount;
        return this;
    }

    public HomeBuilder setDublex(boolean dublex) {
        isDublex = dublex;
        return this;
    }

    public HomeBuilder setPool(boolean pool) {
        isPool = pool;
        return this;
    }

    public HomeBuilder setHasCarPax(boolean hasCarPax) {
        this.hasCarPax = hasCarPax;
        return this;
    }
}
