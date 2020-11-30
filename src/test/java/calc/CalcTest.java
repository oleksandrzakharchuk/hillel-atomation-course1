package calc;

import org.junit.*;

import static org.junit.Assert.*;

public class CalcTest {
    private Calc c;


    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("BEFORE CLASS");

    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("AFTER CLASS");

    }

    @Before
    public void setUp() throws Exception {
        System.out.println("BEFORE");
        c=new Calc();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("AFTER");
    }

    @Test
    public void getSum() {
        assertEquals(7, c.getSum(5,2));
    }

    @Test
    public void getDivide() {
        assertEquals(2, c.getDivide(5,2));
    }

    @Test
    public void getMultiple() {
        assertEquals(10,c.getMultiple(5,2));
    }
    @Test(expected =ArithmeticException.class)
    public void getDivide2(){
        assertEquals(2, c.getDivide(5,0));
    }
}