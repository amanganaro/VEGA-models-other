import insilico.core.exception.GenericFailureException;
import insilico.core.exception.InitFailureException;
import insilico.core.model.InsilicoModel;
import insilico.ontox_assay.ismOntoxAssay;
import model.ModelExecutionTest;

public class BmpOntoxTest extends ModelExecutionTest {
    @Override
    protected InsilicoModel getModel() throws InitFailureException, GenericFailureException {
        return new ismOntoxAssay(true, null, "BMP_ONTOX");
    }
}
