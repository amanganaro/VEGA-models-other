import insilico.core.model.InsilicoModel;
import insilico.pgp_nic.ismPgpNic;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the PGPNic model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class PGPNicRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismPgpNic());
    }
}
