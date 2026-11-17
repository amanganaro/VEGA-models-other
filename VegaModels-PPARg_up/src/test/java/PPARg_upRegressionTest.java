import insilico.core.model.InsilicoModel;
import insilico.pparg_up.ismPPARGup;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the PPARg_up model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class PPARg_upRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismPPARGup());
    }
}
