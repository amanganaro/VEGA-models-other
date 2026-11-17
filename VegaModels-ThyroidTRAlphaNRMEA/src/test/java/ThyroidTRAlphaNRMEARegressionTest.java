import insilico.core.model.InsilicoModel;
import insilico.thyroid_tralpha_nrmea.ismTRAlphaNRMEA;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the ThyroidTRAlphaNRMEA model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class ThyroidTRAlphaNRMEARegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismTRAlphaNRMEA());
    }
}
