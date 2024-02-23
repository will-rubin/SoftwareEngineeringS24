package User;


public class OutputConfig {
    public class InMemoryOutputConfig<T> implements OutputConfig<T> {
        private final List<T> output;
        public InMemoryOutputConfig() {
        this.output = new ArrayList<>();
    }
    @Override
    public void write(T data) {
        output.add(data);
    }
    public List<T> readWrittenData() {
        return Collections.unmodifiableList(output); 
    }
}
}
