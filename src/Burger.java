import java.util.HashMap;

public class Burger extends Ingredient {
    String name;
    String[] ingredients={};

    Burger(String name, String[] Ing) {
        this.name = name;
        for (int i = 0; i < Ing.length; i++) {
            ingredients[i] = Ing[i];
        }
    }

    public double computeCost() {
        double cost = 0;
        for (int i = 0; i < ingredients.length; i++) {
            cost = ingredient.get(ingredients[i]) + cost;
            System.out.println(cost);
        }
        // for (String i : ingredient.keySet()) {
        //     cost = ingredient.get(ingredients[i]) + cost;
        // }
        return cost;    
    }
}
