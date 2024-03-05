import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import server.InputConfig;

public class InMemoryInputConfig<T> implements InputConfig {
    private final List<Integer> inputs = new ArrayList<>();

    public InMemoryInputConfig(int... inputs) {
		for (int i : inputs) {
			this.inputs.add(i);
		}
	}

    public InMemoryInputConfig(Collection<Integer> inputs) {
		this.inputs.addAll(inputs);
	}

    public List<Integer> getInputs() {
		return inputs;
	}
}