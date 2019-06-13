import com.hitzy.services.Calculation;
import com.hitzy.services.Executor;
import com.hitzy.services.MultiplyCommand;
import org.junit.Test;

public class MultiplyTest {

    @Test
    public void test(){
        Calculation calculation = new Calculation(1,2);
        MultiplyCommand multiplyCommand = new MultiplyCommand(calculation);

        Executor executor = new Executor();
        executor.putCommand(multiplyCommand);

        executor.executeCommand();
    }
}
