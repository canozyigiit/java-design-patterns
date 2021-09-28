package Builder;

public class Home {

    private String City;
    private String County;
    private String District;

    private int RoomCount;
    private int YearOfConstruction;
    private int BathCount;


    private boolean isDublex;
    private boolean isPool;
    private boolean hasCarPax;

    public Home() {
    }

    public Home(String city, String county, String district, int roomCount, int yearOfConstruction, int bathCount, boolean isDublex, boolean isPool, boolean hasCarPax) {
        City = city;
        County = county;
        District = district;
        RoomCount = roomCount;
        YearOfConstruction = yearOfConstruction;
        BathCount = bathCount;
        this.isDublex = isDublex;
        this.isPool = isPool;
        this.hasCarPax = hasCarPax;
    }


    @Override
    public String toString() {
        return "Home{" +
                "City='" + City + '\'' +
                ", County='" + County + '\'' +
                ", District='" + District + '\'' +
                ", RoomCount=" + RoomCount +
                ", YearOfConstruction=" + YearOfConstruction +
                ", BathCount=" + BathCount +
                ", isDublex=" + isDublex +
                ", isPool=" + isPool +
                ", hasCarPax=" + hasCarPax +
                '}';
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCounty() {
        return County;
    }

    public void setCounty(String county) {
        County = county;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public int getRoomCount() {
        return RoomCount;
    }

    public void setRoomCount(int roomCount) {
        RoomCount = roomCount;
    }

    public int getYearOfConstruction() {
        return YearOfConstruction;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        YearOfConstruction = yearOfConstruction;
    }

    public int getBathCount() {
        return BathCount;
    }

    public void setBathCount(int bathCount) {
        BathCount = bathCount;
    }

    public boolean isDublex() {
        return isDublex;
    }

    public void setDublex(boolean dublex) {
        isDublex = dublex;
    }

    public boolean isPool() {
        return isPool;
    }

    public void setPool(boolean pool) {
        isPool = pool;
    }

    public boolean isHasCarPax() {
        return hasCarPax;
    }

    public void setHasCarPax(boolean hasCarPax) {
        this.hasCarPax = hasCarPax;
    }
}
