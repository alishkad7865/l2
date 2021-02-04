// import org.junit.Assert.*;
// import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test; //JUnit5

public class BurgerTest {
    @Test
    public void costResult() {
        String [] arr  = {"Ciabatta", "Patty", "Feta", "Mayo", "Mustard", "Arugula", "Fries" };
        System.out.println(arr[3]);
        Burger Never_been_Feta = new Burger("Never been Feta", arr);
        double result = Never_been_Feta.computeCost();
        System.out.println(Never_been_Feta.computeCost());
        assertEquals(2.58, result); // expected, actual
    }
}