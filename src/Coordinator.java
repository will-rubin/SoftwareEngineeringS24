import java.util.*;

public class Coordinator {
    private final DataStore dataStore;
    private final ComputeEngine computeEng;

    public Coordinator(DataStore dataStore, ComputeEngine computeEng) {
        this.dataStore = dataStore;
        this.computeEng = computeEng;
    }

    public String startComputation(String location, String output) {
        try {
            // Read integers from data store
            List<Integer> integers = dataStore.readIntegers(location);
            logger.info("Read " + integers.size() + " integers from " + location);

            // Pass integers to the compute component
            List<Integer> results = computeEng.computeEng(integers);
            logger.info("Computed results: " + results);

            // Write results to data store
            dataStore.writeResults(output, results);
            logger.info("Wrote results to " + output);

            return "Computation completed successfully";
        } catch (Exception e) {
            logger.error("Error during computation: " + e.getMessage());
            return "Error: " + e.getMessage();
        }
    }
}
