import insilico.core.exception.GenericFailureException;
import insilico.core.exception.InitFailureException;
import insilico.core.model.InsilicoModel;
import insilico.rba_irfmn.ismRbaIRFMN;
import model.ModelExecutionTest;

public class RBAIrfmnTest extends ModelExecutionTest {
    @Override
    protected InsilicoModel getModel() throws InitFailureException, GenericFailureException {
        return new ismRbaIRFMN();
    }
}
