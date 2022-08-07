package guru.qa;

public class Price {
    String power;
    String color;
    String weight;
    String speed;
    int price;
    private static final int priceMoto = 1000000;
    int cubature;

    public Price(String power, String color, String weight, String speed, int price) {
        this.power = power;
        this.color = color;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    /*
    Определимся с ценой Мотоцикла
     */
    void price() {
        int result = price - priceMoto;
        if (price >= priceMoto) {
            System.out.println("Основная цена" + price + "руб");

        } else if (price >= 750000) {
            System.out.println("Максимальная цена" + price + "руб");

        } else
            System.out.println("Вам не хватает: " + result + "руб. Минимальная цена " + priceMoto);
    }

    /*
    Обьем двигателя
     */
    void engineCapacity(int cubature) {
        this.cubature = cubature;
        if (cubature > 600 && cubature < 1000) {
            System.out.println("Обьем двигателя: " + cubature);

        } else if (cubature >= 1200) {
            System.out.println("Максимальная модель мото 1000 куб.см, вы хотите купить: " + cubature);

        } else if (cubature == 0) {
            System.out.println("Мотоцикл не приобретен");
        }
    }
}