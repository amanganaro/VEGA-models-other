import insilico.ontox_assay.ismOntoxAssay;
import model.PythonBatchComparison;

/**
 * Checks that the models of this family give the same results in batch as they do one molecule at a time.
 * <p>
 * The 25 models are instances of the same class, one per tag, and share the shape of their input and output, so a
 * couple of tags are enough to verify the family. This is also the module where the batch mode matters most:
 * without it every molecule costs 25 Python processes, one per model.
 * <p>
 * Pass the tags to check as arguments, or none to use the default two.
 */
public class OntoxAssayBatchCheck {

    private static final String[] DEFAULT_TAGS = { "ACE_ONTOX", "AHR_ONTOX" };

    public static void main(String[] args) throws Exception {

        String[] tags = args.length > 0 ? args : DEFAULT_TAGS;
        int problems = 0;

        for (String tag : tags) {
            System.out.println();
            System.out.println("######## " + tag + " ########");
            ismOntoxAssay model = new ismOntoxAssay(true, null, tag);
            problems += PythonBatchComparison.run(model);
        }

        System.out.println();
        System.out.println(problems == 0
                ? "ALL ONTOX TAGS OK (" + tags.length + " checked)"
                : problems + " PROBLEM(S) over " + tags.length + " tags");
        System.exit(problems == 0 ? 0 : 1);
    }
}
