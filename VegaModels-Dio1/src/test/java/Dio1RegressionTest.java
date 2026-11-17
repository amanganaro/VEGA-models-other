import insilico.core.model.InsilicoModel;
import insilico.dio1.ismDio1;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the Dio1 model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class Dio1RegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismDio1());
    }
}
