import insilico.core.model.InsilicoModel;
import insilico.nrf2_up.ismNRF2Up;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the NRF2Up model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class NRF2UpRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismNRF2Up());
    }
}
