import insilico.core.model.InsilicoModel;
import insilico.pxr_up.ismPxrUp;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the PXR_up model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class PXR_upRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismPxrUp());
    }
}
