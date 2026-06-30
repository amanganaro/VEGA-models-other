import insilico.core.exception.GenericFailureException;
import insilico.core.exception.InitFailureException;
import insilico.core.model.InsilicoModel;
import insilico.steroidogenesisedscreen.ismSteroidogenesisEDScreen;
import model.ModelExecutionTest;

public class SteroidogenesisEDScreenTest extends ModelExecutionTest {
    @Override
    protected InsilicoModel getModel() throws InitFailureException, GenericFailureException {
        return new ismSteroidogenesisEDScreen();
    }
}
