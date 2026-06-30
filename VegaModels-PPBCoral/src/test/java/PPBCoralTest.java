import insilico.core.exception.GenericFailureException;
import insilico.core.exception.InitFailureException;
import insilico.core.model.InsilicoModel;
import insilico.ppb_coral.ismPPBCoral;
import model.ModelExecutionTest;

public class PPBCoralTest extends ModelExecutionTest {
    @Override
    protected InsilicoModel getModel() throws InitFailureException, GenericFailureException {
        return new ismPPBCoral();
    }
}
