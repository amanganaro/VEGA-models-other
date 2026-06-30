import insilico.core.exception.GenericFailureException;
import insilico.core.exception.InitFailureException;
import insilico.core.model.InsilicoModel;
import insilico.ontox_assay.ismOntoxAssay;
import model.ModelExecutionTest;

public class Cox1OntoxTest extends ModelExecutionTest {
    @Override
    protected InsilicoModel getModel() throws InitFailureException, GenericFailureException {
        return new ismOntoxAssay(true, null, "COX1_ONTOX");
    }
}
