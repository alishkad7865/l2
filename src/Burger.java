import java.util.HashMap;
import java.util.Arrays;
import java.math.RoundingMode;
import java.math.BigDecimal;
import java.util.*;

public class Burger extends Ingredient {
    public String name;
    public String [] ingredients;
    Ingredient in = new Ingredient();
    //public static DecimalFormat roundCost = new DecimalFormat("0.00");
    Set<String> keySet = in.ingredient.keySet(); 
    ArrayList<String> listOfIng  = new ArrayList<String>(keySet); 
  
    Collection<Double> values = in.ingredient.values();  
    ArrayList<Double> ingredientPrice  = new ArrayList<>(values); 
    Burger(String name, String[] Ing) {
        this.name = name;
        this.ingredients = Ing;
    }
    public String ingredientCheck(){
        for(int j=0; j<ingredients.length;j++){
            if(listOfIng.contains(ingredients[j]) == false){
                return ingredients[j];
            }
        }
        return "Ingredient Okay";
    }
    public double computeCost() {
        
        double cost = 0;
        for (int i = 0; i < listOfIng.size(); i++) {
            for(int j=0; j<ingredients.length;j++){
                if(listOfIng.get(i) == ingredients[j]){
                    cost = ingredientPrice.get(i) + cost;
                }
            }
        }
        BigDecimal bd = new BigDecimal(cost).setScale(2, RoundingMode.HALF_UP);
        double newInput = bd.doubleValue();
        //double Cost =Math.round(cost*100)/100;
        // cost= Double.parsedouble(cost);
        // cost = roundCost.format(cost);
        return newInput;    
    }
}
