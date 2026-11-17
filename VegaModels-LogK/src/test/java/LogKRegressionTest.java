import insilico.core.model.InsilicoModel;
import insilico.logk.ismLogK;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the LogK model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class LogKRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismLogK());
    }
}
