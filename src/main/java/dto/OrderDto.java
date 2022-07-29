package dto;

public class OrderDto {
    private String cuisines;
    private String lunch;
    private String meal;
    private String dessert;
    private String drink;
    private String addition;

    public OrderDto(String cuisines, String lunch, String meal, String dessert, String drink, String addition) {
        this.cuisines = cuisines;
        this.lunch = lunch;
        this.meal = meal;
        this.dessert = dessert;
        this.drink = drink;
        this.addition = addition;
    }

    public String getCuisines() {
        return cuisines;
    }

    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getAddition() {
        return addition;
    }

    public void setAddition(String addition) {
        this.addition = addition;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "cuisines='" + cuisines + '\'' +
                ", lunch='" + lunch + '\'' +
                ", meal='" + meal + '\'' +
                ", dessert='" + dessert + '\'' +
                ", drink='" + drink + '\'' +
                ", addition='" + addition + '\'' +
                '}';
    }
}
