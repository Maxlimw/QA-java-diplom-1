import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunTests {

    private final String inputName;
    private final float inputPrice;
    private final String expectedName;
    private final float expectedPrice;

    public BunTests(String inputName, float inputPrice, String expectedName, float expectedPrice) {
        this.inputName = inputName;
        this.inputPrice = inputPrice;
        this.expectedName = expectedName;
        this.expectedPrice = expectedPrice;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "Cheese Bun", 100, "Cheese Bun", 100 },
                { "Ржаная булочка", 2.5f, "Ржаная булочка", 2.5f },
                { "White Bun", 1.77f, "White Bun", 1.77f }
        });
    }

    @Test
    public void testGetBunName() {
        Bun bun = new Bun(inputName, inputPrice);
        assertEquals(expectedName, bun.getName());
    }

    @Test
    public void testGetBunPrice() {
        Bun bun = new Bun(inputName, inputPrice);
        assertEquals(expectedPrice, bun.getPrice(), 0);
    }
}
