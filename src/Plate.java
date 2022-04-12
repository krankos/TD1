import java.util.*;

public class Plate {
    // plate has name and vector of ingredients
    private String name;
    private Vector<Ingredient> ingredients;

    // plate has constructor with parameters
    public Plate(String name) {
        this.name = name;
        this.ingredients = new Vector<Ingredient>();
    }

    // plate has getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Vector<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    // plate has a method to add ingredients
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public boolean equals(Plate p) {
        boolean result = true;

        if (this.ingredients.size() != p.getIngredients().size()) {
            result = false;
        }
        for (int i = 0; i < ingredients.size(); i++) {
            if (this.ingredients.at(i).equals(p.getIngredients().at(i)) == false) {
                result = false;
            }
        }

    }

    }

    public static void main(String[] args) {
        Ingredient ingredient1 = new Ingredient("choucroute", "cuit", 500, "g");
        Ingredient ingredient2 = new Ingredient("lard", "cuit", 150, "g");
        Ingredient ingredient3 = new Ingredient("saucisse", "entier cuit", 2, "");

        Plate plate1 = new Plate("choucroute");
        plate1.addIngredient(ingredient1);
        plate1.addIngredient(ingredient2);
        plate1.addIngredient(ingredient3);

    }
}
