import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class IngredientTest {
    public Ingredient ingredient;

    @Before
    public void setUp() {
        ingredient = new Ingredient(IngredientType.SAUCE, "bacon", 5.5f);
    }

    @Test
    public void getNameIngredient() {
        Assert.assertEquals("bacon", ingredient.getName());
    }

    @Test
    public void getPriceIngredient() {
        Assert.assertEquals(5.5f, ingredient.getPrice(), 0.1f);
    }
}