import com.hitzy.services.Executor;
import com.hitzy.services.PrimeCommand;
import com.hitzy.services.PrintNumbers;
import org.junit.Test;

public class PrimeTest {

    @Test
    public void test(){
        PrintNumbers printNumbers = new PrintNumbers(4);
        PrimeCommand primeCommand = new PrimeCommand(printNumbers);

        Executor executor = new Executor();
        executor.putCommand(primeCommand);

        executor.executeCommand();
    }
}
