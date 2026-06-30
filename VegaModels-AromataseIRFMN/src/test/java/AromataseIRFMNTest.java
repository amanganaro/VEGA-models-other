import insilico.aromatase_irfmn.ismAromataseIRFMN;
import insilico.core.exception.GenericFailureException;
import insilico.core.exception.InitFailureException;
import insilico.core.model.InsilicoModel;
import model.ModelExecutionTest;

public class AromataseIRFMNTest extends ModelExecutionTest {
    @Override
    protected InsilicoModel getModel() throws InitFailureException, GenericFailureException {
        return new ismAromataseIRFMN();
    }
}
