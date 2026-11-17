import insilico.core.model.InsilicoModel;
import insilico.ppb_coral.ismPPBCoral;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the PPBCoral model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class PPBCoralRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismPPBCoral());
    }
}
