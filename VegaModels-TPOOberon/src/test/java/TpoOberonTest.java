import insilico.core.exception.GenericFailureException;
import insilico.core.exception.InitFailureException;
import insilico.core.model.InsilicoModel;
import insilico.tpo_oberon.ismTpoOberon;
import model.ModelExecutionTest;

public class TpoOberonTest extends ModelExecutionTest {
    @Override
    protected InsilicoModel getModel() throws InitFailureException, GenericFailureException {
        return new ismTpoOberon();
    }
}
