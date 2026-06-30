import insilico.core.exception.GenericFailureException;
import insilico.core.exception.InitFailureException;
import insilico.core.model.InsilicoModel;
import insilico.tissueblood_ineris.ismTissueBloodIneris;
import model.ModelExecutionTest;

public class TissueBloodInerisTest extends ModelExecutionTest {
    @Override
    protected InsilicoModel getModel() throws InitFailureException, GenericFailureException {
        return new ismTissueBloodIneris();
    }
}
