package ch06.ex03;

import java.util.ArrayList;
import java.util.List;

public class Table<K, V> {
  private List<Entry<K, V>> table;

  public Table() {
    table = new ArrayList<>();
  }

  public V get(K key) {
    for (Entry<K, V> entry : table) {
      if (entry.getKey().equals(key)) {
        return entry.getValue();
      }
    }
    return null;
  }

  public void put(K key, V value) {
    for (Entry<K, V> entry : table) {
      if (entry.getKey().equals(key)) {
        entry.setValue(value);
        return;
      }
    }
    table.add(new Entry<K, V>(key, value));
  }

  public V remove(K key) {
    for (Entry<K, V> entry : table) {
      if (entry.getKey().equals(key)) {
        table.remove(entry);
        return entry.getValue();
      }
    }
    return null;
  }
}
