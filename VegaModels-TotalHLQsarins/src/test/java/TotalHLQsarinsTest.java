import insilico.core.exception.GenericFailureException;
import insilico.core.exception.InitFailureException;
import insilico.core.model.InsilicoModel;
import insilico.totalhl_qsarins.ismTotalHLQsarins;
import model.ModelExecutionTest;

public class TotalHLQsarinsTest extends ModelExecutionTest {
    @Override
    protected InsilicoModel getModel() throws InitFailureException, GenericFailureException {
        return new ismTotalHLQsarins();
    }
}
