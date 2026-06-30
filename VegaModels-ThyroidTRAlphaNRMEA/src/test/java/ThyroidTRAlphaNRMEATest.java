import insilico.core.exception.GenericFailureException;
import insilico.core.exception.InitFailureException;
import insilico.core.model.InsilicoModel;
import insilico.thyroid_tralpha_nrmea.ismTRAlphaNRMEA;
import model.ModelExecutionTest;

public class ThyroidTRAlphaNRMEATest extends ModelExecutionTest {
    @Override
    protected InsilicoModel getModel() throws InitFailureException, GenericFailureException {
        return new ismTRAlphaNRMEA();
    }
}
