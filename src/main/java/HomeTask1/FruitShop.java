package HomeTask1;

import lesson.AbstractShop;

public class FruitShop extends AbstractShop {
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void showLocation()
    {
        System.out.println("The store is located in " + location);
    }

    @Override
    public String toString() {
        return "FruitShop{" +
                "location='" + location + '\'' +
                '}';
    }
}
