import java.util.ArrayList;
import java.util.List;

public class Service implements  Property{
    private List<House> houses;
    private List<Villa> villas;
    private List<SummerHouse> summerHouses;

    public List<House> getHouses() {
        return houses;
    }

    public List<Villa> getVillas() {
        return villas;
    }

    public List<SummerHouse> getSummerHouses() {
        return summerHouses;
    }

    public Service() {
        houses = new ArrayList<>();
        villas = new ArrayList<>();
        summerHouses = new ArrayList<>();
        houses.add(new House("Ev1", 400000, 130, 2, 1));
        houses.add(new House("Ev2", 500000, 170, 2, 2));
        houses.add(new House("Ev3", 600000, 200, 3, 1));
        villas.add(new Villa("Villa1",1000000,200,3,1));
        villas.add(new Villa("Villa2",1500000,250,4,1));
        villas.add(new Villa("Villa3",2500000,200,5,2));
        summerHouses.add(new SummerHouse("Yazlık1",3000000,100,2,1));
        summerHouses.add(new SummerHouse("Yazlık2",4000000,150,3,1));
        summerHouses.add(new SummerHouse("Yazlık3",8000000,100,5,2));
    }
        //Evlerin toplam fiyatlarını dönen bir metot
        public double getHousesTotalPrice() {
        double totalPrice = 0;
        for (House house : houses) {
            totalPrice += house.getPrice();
        }
        return totalPrice;
        }

        //Villaların toplam fiyatlarını dönen bir metot
        public double getVillasTotalPrice() {
            double totalPrice = 0;
            for (Villa villa : villas) {
                totalPrice += villa.getPrice();
            }
            return totalPrice;
        }

        //Yazlıkların toplam fiyatlarını dönen metot
        public double getSummerHousesTotalPrice() {
            double totalPrice = 0;
            for (SummerHouse summerHouse : summerHouses) {
                totalPrice += summerHouse.getPrice();
            }
            return totalPrice;
        }

        //Tüm tipteki evlerin toplam fiyatını dönen metot
        public double getTotalPrice() {
            return getHousesTotalPrice() + getVillasTotalPrice() + getSummerHousesTotalPrice();
        }

        //Evlerin ortalama metrekaresini dönen bir metot
        public double getHousesAverageArea() {
            double totalArea = 0;
            for (House house : houses) {
                totalArea += house.getArea();
            }
            return totalArea / houses.size();
        }

         //Villaların ortalama metrekaresini dönen bir metot
        public double getVillasAverageArea() {
            double totalArea = 0;
            for (Villa villa : villas) {
                totalArea += villa.getArea();
            }
            return totalArea / villas.size();
        }

        //Yazlıkların ortalama metrekaresini dönen metot
        public double getSummerHouseAverageArea() {
            double totalArea= 0;
            for (SummerHouse summerHouse : summerHouses) {
                totalArea += summerHouse.getArea();
            }
            return totalArea / summerHouses.size();
        }

        //Tüm tipteki evlerin ortalama metrekaresini dönen metot
         public double getTotalAvergeArea() {
             return (getHousesAverageArea() + getVillasAverageArea() + getSummerHouseAverageArea()) / 3;
    }

        //Oda ve salon sayısına göre tüm tipteki evleri filtreleyip dönen metot
        public List<Property> filterPropertiesByRoomsAndSalons(int roomCount, int salonCount) {
            List<Property> filteredProperties = new ArrayList<>();
            for (Property property : houses) {
                if (property.getRoomCount() == roomCount && property.getSalonCount() == salonCount) {
                    filteredProperties.add(property);
                }
            }
            for (Property property : villas) {
                if (property.getRoomCount() == roomCount && property.getSalonCount() == salonCount) {
                    filteredProperties.add(property);
                }
            }
            for (Property property : summerHouses) {
                if (property.getRoomCount() == roomCount && property.getSalonCount() == salonCount) {
                    filteredProperties.add(property);
                }
            }
            return filteredProperties;
        }
    @Override
    public String getType() {
        return null;
    }

    @Override
    public float getPrice() {
        return 0;
    }

    @Override
    public float getArea() {
        return 0;
    }

    @Override
    public int getRoomCount() {
        return 0;
    }

    @Override
    public int getSalonCount() {
        return 0;
    }
}