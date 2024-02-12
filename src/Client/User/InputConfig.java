public interface InputConfig {
    public class InMemoryInputConfig<T> implements InputConfig<T> {
        private final List<T> data;
        public InMemoryInputConfig(List<T> data) {
            this.data = Collections.unmodifiableList(data); 
    }
    @Override
    public Iterator<T> getIterator() {
        return data.iterator();
    }
}

    
} 
