import insilico.core.exception.GenericFailureException;
import insilico.core.exception.InitFailureException;
import insilico.core.model.InsilicoModel;
import insilico.ppara_up.ismPPARAUp;
import model.ModelExecutionTest;

public class PPARa_UpTEST extends ModelExecutionTest {
    @Override
    protected InsilicoModel getModel() throws InitFailureException, GenericFailureException {
        return new ismPPARAUp();
    }
}
