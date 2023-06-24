public class Phone implements Comparable<Phone>{ // название производителя, название модели и стоимость. Конструктор. Потом реализовать ArrayList из телефонов
     String developer;
     String model;
     int price;

    public Phone(String developer, String model, int price) {
        this.developer = developer;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "developer='" + developer + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Phone o) {
        return this.price - o.price;
    }
}
