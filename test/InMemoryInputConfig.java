import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import User.InputConfig;

public class InMemoryInputConfig<T> implements InputConfig {
    private final List<T> data;
    public InMemoryInputConfig(List<T> data) {
        this.data = Collections.unmodifiableList(data); 
    }
}