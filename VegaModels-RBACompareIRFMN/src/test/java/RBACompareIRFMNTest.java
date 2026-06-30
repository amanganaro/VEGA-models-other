import insilico.core.exception.GenericFailureException;
import insilico.core.exception.InitFailureException;
import insilico.core.model.InsilicoModel;
import insilico.rba_compara_irfmn.ismAndrogenBindingComparaIRFMN;
import model.ModelExecutionTest;

public class RBACompareIRFMNTest extends ModelExecutionTest {
    @Override
    protected InsilicoModel getModel() throws InitFailureException, GenericFailureException {
        return new ismAndrogenBindingComparaIRFMN();
    }
}
