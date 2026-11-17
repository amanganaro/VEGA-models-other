import insilico.core.model.InsilicoModel;
import insilico.tpo_oberon.ismTpoOberon;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the TPOOberon model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class TPOOberonRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismTpoOberon());
    }
}
