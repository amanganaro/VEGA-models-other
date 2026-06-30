import insilico.core.exception.GenericFailureException;
import insilico.core.exception.InitFailureException;
import insilico.core.model.InsilicoModel;
import insilico.rba_cerapp.ismEstrogenBindingCerapp;
import model.ModelExecutionTest;

public class RBACerappTest extends ModelExecutionTest {
    @Override
    protected InsilicoModel getModel() throws InitFailureException, GenericFailureException {
        return new ismEstrogenBindingCerapp();
    }
}
