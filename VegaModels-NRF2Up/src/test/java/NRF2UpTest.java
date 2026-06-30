import insilico.core.exception.GenericFailureException;
import insilico.core.exception.InitFailureException;
import insilico.core.model.InsilicoModel;
import insilico.nrf2_up.ismNRF2Up;
import model.ModelExecutionTest;

public class NRF2UpTest extends ModelExecutionTest {
    @Override
    protected InsilicoModel getModel() throws InitFailureException, GenericFailureException {
        return new ismNRF2Up();
    }
}
