import insilico.core.model.InsilicoModel;
import insilico.tissueblood_ineris.ismTissueBloodIneris;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the TissueBloodIneris model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class TissueBloodInerisRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismTissueBloodIneris());
    }
}
