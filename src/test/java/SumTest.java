import com.hitzy.services.Calculation;
import com.hitzy.services.Executor;
import com.hitzy.services.SumCommand;
import org.junit.Test;

public class SumTest {

    @Test
    public void test(){
        Calculation calculation = new Calculation(1,2);
        SumCommand sumCommand = new SumCommand(calculation);

        Executor executor = new Executor();
        executor.putCommand(sumCommand);

        executor.executeCommand();
    }
}
