import insilico.ahr_up.ismAhrUp;
import insilico.core.exception.GenericFailureException;
import insilico.core.exception.InitFailureException;
import insilico.core.model.InsilicoModel;
import model.ModelExecutionTest;

public class AhR_upTest extends ModelExecutionTest {
    @Override
    protected InsilicoModel getModel() throws InitFailureException, GenericFailureException {
        return new ismAhrUp();
    }
}
