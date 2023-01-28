import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        List<Property> allBuild = new ArrayList<>();
        allBuild.addAll(service.getHouses());
        allBuild.addAll(service.getVillas());
        allBuild.addAll(service.getSummerHouses());

        for (Property build : allBuild) {
            System.out.println(build.getType() + " Fiyatı: " + build.getPrice() + " Oda sayısı: " + build.getRoomCount() + " Salon sayısı: " + build.getSalonCount());
        }
        System.out.println("Evlerin toplam fiyatı =" + service.getHousesTotalPrice());
        System.out.println("Villaların toplam fiyatı =" + service.getVillasTotalPrice());
        System.out.println("Yazlıkların toplam fiyatı =" + service.getSummerHousesTotalPrice());
        System.out.println("Tüm tipteki evlerin toplam fiyatı =" + service.getTotalPrice());
        System.out.println("Evlerin ortalama metrekaresi =" + service.getHousesAverageArea());
        System.out.println("Villaların ortalama metrekaresi =" + service.getVillasAverageArea());
        System.out.println("Yazlıkların  ortalama metrekaresi =" + service.getSummerHouseAverageArea());
        System.out.println("Tüm tipteki evlerin ortalama metrekaresi =" + service.getTotalAvergeArea());
        List<Property> filteredProperties = service.filterPropertiesByRoomsAndSalons(3, 1);
        System.out.println("3 Oda 1 salon sayısına göre tüm tipteki evler");
        for (Property property : filteredProperties) {
            System.out.println(property.getType() + " "  + property.getPrice() + " " + property.getArea() + " " + property.getRoomCount() + " " + property.getSalonCount());
        }

        }
    }
