import org.junit.Test;
import praktikum.IngredientType;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class IngredientTypeTests {

    @Test
    public void testIngredientTypeValues() {
        IngredientType[] expectedValues = { IngredientType.SAUCE, IngredientType.FILLING };
        assertArrayEquals(expectedValues, IngredientType.values());
    }

    @Test
    public void testValueOf() {
        assertEquals(IngredientType.SAUCE, IngredientType.valueOf("SAUCE"));
        assertEquals(IngredientType.FILLING, IngredientType.valueOf("FILLING"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidValueOf() {
        IngredientType.valueOf("INVALID_TYPE");
    }
}
