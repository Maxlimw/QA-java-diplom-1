import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(Parameterized.class)
public class IngredientTests {

    public IngredientType type;
    public String name;
    public float price;

    public IngredientTests(IngredientType type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { IngredientType.SAUCE, "Соус 1000 островов", 100 },
                { IngredientType.FILLING, "Малиновый джем", 2.5f },
                { IngredientType.FILLING, "Апельсиновая котлета", 1.77f }
        });
    }

    @Test
    public void createIngredientTest() {
        Ingredient ingredient = new Ingredient(type, name, price);
        assertNotNull("Ингредиент не null", ingredient);
        assertEquals("Название ингредиента верное", name, ingredient.getName());
        assertEquals("Цена ингредиента верна", price, ingredient.getPrice(), 0);
        assertEquals("Тип ингредиента верный", type, ingredient.getType());
    }
}
