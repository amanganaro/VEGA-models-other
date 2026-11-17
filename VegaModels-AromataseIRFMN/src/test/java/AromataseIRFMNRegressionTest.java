import insilico.core.model.InsilicoModel;
import insilico.aromatase_irfmn.ismAromataseIRFMN;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the AromataseIRFMN model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class AromataseIRFMNRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismAromataseIRFMN());
    }
}
