import com.hitzy.services.Executor;
import com.hitzy.services.FibonacciCommand;
import com.hitzy.services.PrintNumbers;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void test(){
        PrintNumbers printNumbers = new PrintNumbers(4);
        FibonacciCommand fibonacciCommand = new FibonacciCommand(printNumbers);

        Executor executor = new Executor();
        executor.putCommand(fibonacciCommand);

        executor.executeCommand();
    }
}
