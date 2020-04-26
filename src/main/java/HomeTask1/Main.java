package HomeTask1;

public class Main {
    public static void main(String[] args) {
        FruitShop fruitShop = new FruitShop();
        Fruit apple = new Fruit("Apple", 700, 1, "Aport" );
        Fruit cherry = new Fruit("Cherry", 1000, 2, "Venok" );
        Fruit bananas = new Fruit("Bananas", 500, 0.5, "Dacca");
        fruitShop.setLocation("Karaganda, 8 district, 31");
        fruitShop.add(apple);
        fruitShop.add(cherry);
        fruitShop.add(bananas);

        fruitShop.printAllProducts();
        fruitShop.sell(bananas);

        fruitShop.showLocation();
        fruitShop.printAllProducts();





    }
}
