public class Ingredient {
    String ingredient_name, state;
    int quantity;
    String unit;

    // ingredient constructor
    Ingredient(String n, String e, int q, String unit) {
        this.ingredient_name = n;
        this.state = e;
        this.quantity = q;
        this.unit = unit;
    }

    // Ingredient has getters and setters
    public String getIngredient_name() {
        return ingredient_name;
    }

    public void setIngredient_name(String ingredient_name) {
        this.ingredient_name = ingredient_name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public boolean equals(Ingredient i) {
        return this.ingredient_name == i.getIngredient_name() && this.state == i.getState();
    }

    // Ingredient has toString method
    public String toString() {
        return "Ingredient: " + ingredient_name + " " + state + " " + quantity + " " + unit;
    }
}
