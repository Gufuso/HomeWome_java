package guru.qa;

public class Moto {

    public static void main(String[] args) {
        Price price = new Price("125", "Red","185","290",1000000);
        price.price();
        price.engineCapacity(1200);
    }
}
