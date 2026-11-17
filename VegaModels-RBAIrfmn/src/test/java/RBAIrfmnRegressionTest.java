import insilico.core.model.InsilicoModel;
import insilico.rba_irfmn.ismRbaIRFMN;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the RBAIrfmn model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class RBAIrfmnRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismRbaIRFMN());
    }
}
