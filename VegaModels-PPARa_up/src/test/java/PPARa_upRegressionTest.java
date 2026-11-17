import insilico.core.model.InsilicoModel;
import insilico.ppara_up.ismPPARAUp;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the PPARa_up model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class PPARa_upRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismPPARAUp());
    }
}
