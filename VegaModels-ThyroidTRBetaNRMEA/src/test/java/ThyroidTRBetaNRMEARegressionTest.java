import insilico.core.model.InsilicoModel;
import insilico.thyroid_trbeta_nrmea.ismTRBetaNRMEA;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the ThyroidTRBetaNRMEA model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class ThyroidTRBetaNRMEARegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismTRBetaNRMEA());
    }
}
