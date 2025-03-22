import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class NumberUtilsTest {

//            There may be
//            more than one method with @BeforeAll,
//            as well as @AfterAll.
//            If the test class has the annotation,
//            as @TestInstance with the value of
//            Testinstance.Lifecycle.PER_CLASS passed in the parameter

    @BeforeAll
    public static void callBeforeAnyTestMethodsExecute(){
        System.out.println("1st method to be called...before all only be used on 1 method");
    }

    @BeforeEach
    public void callBeforEachTestMethod(){
        System.out.println("This method runs before all methods");
    }

   @Test
    public void testIsNumberEven(){
       //Check with test data: 4
       //expected result: true
       assertTrue(NumberUtils.isNumberEven(4));

       //Check with test data: 5
       //expected result: false
       assertFalse(NumberUtils.isNumberEven(5));
    }

    @AfterEach
    public void callAfterEachTestMethod(){
        System.out.println("This method runs after each test method");
    }

    @AfterAll
    public static void callAfterTestMethodsHaveExecuted(){
        System.out.println("Used to cleaning up resources....last method to be called after all");
    }
}
