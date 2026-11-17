import insilico.core.model.InsilicoModel;
import insilico.ontox_assay.ismOntoxAssay;
import regression.ModelRegressionTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Regression test of the 25 ONTOX assay models, all Python models using the CDDD descriptors, see
 * {@link ModelRegressionTest}. They share a single module and a single Java class, which is told which assay to run
 * through its model tag, so this test builds one model per tag and produces one reference file per model and dataset.
 * <p>
 * On the {@code core} dataset all 25 models are run on the same molecules, and the CDDD descriptors are computed once
 * and reused (see {@code ModelRegression#cdddFor}); on {@code ts} each model has its own training set.
 * <p>
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class OntoxAssayRegressionTest extends ModelRegressionTest {

    /** The assay tags of the module, in the order of the model files. */
    private static final List<String> MODEL_TAGS = List.of(
            "ACE_ONTOX",
            "ACHE_ONTOX",
            "AHR_ONTOX",
            "AT1R_ONTOX",
            "BMP_ONTOX",
            "BSEP_ONTOX",
            "COX1_ONTOX",
            "CYP26_ONTOX",
            "FGFR1_ONTOX",
            "FGFR2_ONTOX",
            "FGFR3_ONTOX",
            "FGFR4_ONTOX",
            "GR_ONTOX",
            "HDEAC_ONTOX",
            "NMDA_ONTOX",
            "OAT1_ONTOX",
            "PPARA_ONTOX",
            "PPARD_ONTOX",
            "PPARG_ONTOX",
            "PXR_ONTOX",
            "THRA_ONTOX",
            "THRB_ONTOX",
            "TTR_ONTOX",
            "VGSC_ONTOX",
            "WNT_ONTOX");

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        List<InsilicoModel> models = new ArrayList<>(MODEL_TAGS.size());
        for (String tag : MODEL_TAGS)
            models.add(new ismOntoxAssay(true, null, tag));
        return models;
    }
}
