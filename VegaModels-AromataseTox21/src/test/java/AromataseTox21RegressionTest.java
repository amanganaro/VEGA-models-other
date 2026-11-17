import insilico.core.model.InsilicoModel;
import insilico.aromatase_activity.ismAromataseTox21;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the AromataseTox21 model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class AromataseTox21RegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismAromataseTox21());
    }
}
