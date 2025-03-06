import java.util.LinkedHashMap;
import java.util.Map;

public class AccessOrderMap extends LinkedHashMap {
    private final int capacity;

    public AccessOrderMap(int capacity) {
        super(capacity, 0.75f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest){
        return size() > capacity;
    }
}
