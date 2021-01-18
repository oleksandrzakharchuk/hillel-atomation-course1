package progeckts.ua.orange;
import org.example.logger.TestLogger;
import org.junit.Test;

public abstract class OrangeProductViewTests extends OrangeUaTestBase {


    private TestLogger logger;

    @Test
    public void testViewProductFromOrangeCatalog(){

        logger.log("Open product catalog pop up ");
        logger.log("Select Job");
        logger.log(("Select Job Titles"));
        logger.log("Check page");

    }
}
