public class Model<K, V> {
    private K key;
    private V value;

    public Model(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Model model = (Model) o;

        if (key != null ? !key.equals(model.key) : model.key != null) return false;
        return value != null ? value.equals(model.value) : model.value == null;
    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "key='" + key + '\'' +", value='" + value + '\'';
    }
}
