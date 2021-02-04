// import org.junit.Assert.*;
// import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test; //JUnit5

public class BurgerTest {
    Burger Never_been_Feta = new Burger("Never been Feta", new String[] {"Ciabatta", "Patty", "Feta", "Mayo", "Mustard", "Arugula", "Fries" });
    Burger Eggers_cant_be_Cheesers = new Burger("Eggers can't be cheesers", new String[] {"English Muffin", "Patty", "Cheddar", "Egg", "Iceburg", "Fries" });
    Burger Poutine_on_the_Ritz = new Burger ( "Poutine on the Ritz",new String[] { "Bun", "Patty", "Iceburg", "Tomato", "Red Onion", "Ritz Crackers", "Fries", "Gravy", "Cheese Curds"}); 	
    Burger chiveBurger = new Burger( "Baby you can Chive my Car",new String[] { "Bun", "Patty", "Feta", "Mustard", "Sour Cream", "Chives", "Pickle", "Fries"}); 	//2.19
    Burger BlackGarlicBurger =new Burger( "Bet it all on Black",new String[] { "Bun", "Patty", "Mozzarella", "Mayo", "Sriracha", "Black Garlic", "Spinach", "Fries"}); 	//2.53   
    Burger Vegan= new Burger("Keep it light", new String[]{"Bun","Tomato", "Red Onion", "Cheddar", "Spinach", "Iceburg", "Mustard", "Mayo"});
    Burger Tum= new Burger("Make it big", new String[] { "Bun", "Patty", "Iceburg", "Tomato", "Red Onion", "Ritz Crackers", "Fries", "Gravy", "Cheese Curds","Sriracha"} );
    Burger healthy=new Burger("Easy on Belly", new String[]{"Bun","Tomato", "Red Onion", "Cheddar", "Spinach", "Iceburg", "Mustard", "Mayo", "Patty","Sour Cream"});
    @Test
    public void InvalidIngredientCheck(){
        assertEquals("Ingredient Okay",Never_been_Feta.ingredientCheck(),"Ingredient does not exist");
        assertEquals("Ingredient Okay",Poutine_on_the_Ritz.ingredientCheck(),"Ingredient does not exist");
        assertEquals("Ingredient Okay",Eggers_cant_be_Cheesers.ingredientCheck(),"Ingredient does not exist");
        assertEquals("Ingredient Okay",chiveBurger.ingredientCheck(),"Ingredient does not exist");
        assertEquals("Ingredient Okay",BlackGarlicBurger.ingredientCheck(),"Ingredient does not exist");
        assertEquals("Ingredient Okay", Vegan.ingredientCheck(),"Ingredient does not exist");
        assertEquals("Ingredient Okay", Tum.ingredientCheck(),"Ingredient does not exist");
        assertEquals("Ingredient Okay", healthy.ingredientCheck(),"Ingredient does not exist");
    }

    @Test
    public void costResult() {
        //Burger Never_been_Feta = new Burger("Never been Feta", new String[] {"Ciabatta", "Patty", "Feta", "Mayo", "Mustard", "Arugula", "Fries" });
        //double result = chiveBurger.computeCost();
        assertEquals(2.58, Never_been_Feta.computeCost(),"Invalid Ingredient for Never been Feta"); 
        assertEquals(2.52, Eggers_cant_be_Cheesers.computeCost(),"Invalid Ingredient for Eggers can't be cheesers"); 
        assertEquals(4.35, Poutine_on_the_Ritz.computeCost(),"Invalid Ingredient for "+Poutine_on_the_Ritz.name); 
        assertEquals(2.19, chiveBurger.computeCost(),"Invalid Ingredient for "+ chiveBurger.name);
        assertEquals(2.53, BlackGarlicBurger.computeCost(),"Invalid Ingredient for "+ BlackGarlicBurger.name);
        assertEquals(1.18, Vegan.computeCost(),"Invalid Ingredient for "+  Vegan.name);
        assertEquals(4.38, Tum.computeCost(),"Invalid Ingredient for "+  Tum.name);
        assertEquals(2.21, healthy.computeCost(),"Invalid Ingredient for "+  healthy.name);
               
    }

}