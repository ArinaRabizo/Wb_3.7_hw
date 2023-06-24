import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Samsung", "Galaxy J1", 3200));
        phones.add(new Phone("Samsung", "Galaxy S 23", 45000));
        phones.add(new Phone("iPhone", "5S", 9800));
        phones.add(new Phone("Lenovo", "A 34L", 10000));
        phones.add(new Phone("Huawei", "Y6", 11500));
        phones.add(new Phone("Xiaomi", "M11 pro", 15900));
        phones.add(new Phone("Samsung", "Galaxy M31", 6700));
        List<String> phones1 = phones.stream()
                .filter(phone -> phone.developer.equals("Samsung"))
                .map(phone -> phone.model)
                .toList();
        ArrayList<String> phones_1 = new ArrayList<>(phones1);
        System.out.println(phones_1);
        ArrayList<Phone> NewPhones = new ArrayList<>();
        NewPhones.add(new Phone("Samsung", "Galaxy J1", 3200));
        NewPhones.add(new Phone("Samsung", "Galaxy S 23", 45000));
        NewPhones.add(new Phone("iPhone", "5S", 9800));
        NewPhones.add(new Phone("Lenovo", "A 34L", 10000));
        NewPhones.add(new Phone("Huawei", "Y6", 11500));
        NewPhones.add(new Phone("Xiaomi", "M11 pro", 15900));
        NewPhones.add(new Phone("Samsung", "Galaxy J2", 6700));
        List priceAndModel = NewPhones.stream().sorted().flatMap(phone -> Stream.of("Model: " +phone.model + " price: " + phone.price)).toList();
        System.out.println(priceAndModel);
    }
}