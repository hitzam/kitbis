import com.hitzy.test.FibonacciTest;
import com.hitzy.test.MultiplyTest;
import com.hitzy.test.PrimeTest;
import com.hitzy.test.SumTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SumTest.class,
        MultiplyTest.class,
        PrimeTest.class,
        FibonacciTest.class})
public class AllTests {
}
