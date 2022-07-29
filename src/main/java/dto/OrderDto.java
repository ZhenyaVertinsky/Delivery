package dto;

import com.verta.entity.Addition;
import com.verta.entity.Cuisines;
import com.verta.entity.Dessert;
import com.verta.entity.Drink;
import com.verta.entity.Lunch;
import com.verta.entity.Meal;

public class OrderDto {
    private Addition addition;
    private Cuisines cuisines;
    private Dessert dessert;
    private Drink drink;
    private Lunch lunch;
    private Meal meal;

    public OrderDto(Addition addition, Cuisines cuisines, Dessert dessert, Drink drink, Lunch lunch, Meal meal) {
        this.addition = addition;
        this.cuisines = cuisines;
        this.dessert = dessert;
        this.drink = drink;
        this.lunch = lunch;
        this.meal = meal;
    }

    public Addition getAddition() {
        return addition;
    }

    public void setAddition(Addition addition) {
        this.addition = addition;
    }

    public Cuisines getCuisines() {
        return cuisines;
    }

    public void setCuisines(Cuisines cuisines) {
        this.cuisines = cuisines;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Lunch getLunch() {
        return lunch;
    }

    public void setLunch(Lunch lunch) {
        this.lunch = lunch;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "addition=" + addition +
                ", cuisines=" + cuisines +
                ", dessert=" + dessert +
                ", drink=" + drink +
                ", lunch=" + lunch +
                ", meal=" + meal +
                '}';
    }
}
