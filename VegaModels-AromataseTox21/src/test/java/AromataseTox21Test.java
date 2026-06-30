import insilico.aromatase_activity.ismAromataseTox21;
import insilico.core.exception.GenericFailureException;
import insilico.core.exception.InitFailureException;
import insilico.core.model.InsilicoModel;
import model.ModelExecutionTest;

public class AromataseTox21Test extends ModelExecutionTest {
    @Override
    protected InsilicoModel getModel() throws InitFailureException, GenericFailureException {
        return new ismAromataseTox21();
    }
}
