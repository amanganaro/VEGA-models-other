import insilico.core.model.InsilicoModel;
import insilico.totalhl_qsarins.ismTotalHLQsarins;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the TotalHLQsarins model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 * <p>
 * Known issue: PaDEL is not reproducible for some molecules. For ts molecule 1068
 * ({@code O=C3C4=CC=2C(N=C1C=CC=CC1=2)=C(N4(C(O)=CN3C))C6CC=5OCOC=5CC6}) TopoPSA is either 76.29 or 71.36 (an aromatic
 * nitrogen perceived or not, with small changes in minHsOH, gmax and AATS7p), so LogHLt is 0.746 or 0.729. The cause
 * is identity-hash iteration order in the standardization and aromaticity perception of the old CDK inside
 * PadelFullLib. Through PadelService the test is stable, because the service always receives the same sequence of
 * molecules from a fresh process; if it turns red on that molecule only, it is this issue. Details and measurements in
 * VEGA-insilico-core {@code docs/models-dependency-analysis.md}.
 */
public class TotalHLQsarinsRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismTotalHLQsarins());
    }
}
