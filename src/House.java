public class House implements Property{
    private String type;
    private float price;
    private float area;
    private int roomCount;
    private int salonCount;

    public House(String type, int price, int area, int roomCount, int salonCount) {
        this.type = type;
        this.price = price;
        this.area = area;
        this.roomCount = roomCount;
        this.salonCount = salonCount;
    }
    // get metotları
    public String getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public float getArea() {
        return area;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getSalonCount() {
        return salonCount;
    }
}