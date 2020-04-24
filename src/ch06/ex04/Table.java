package ch06.ex04;

import java.util.ArrayList;
import java.util.List;

public class Table<K, V> {
  private class Entry {
    private K key;
    private V value;

    public Entry(K key, V value) {
      this.key = key;
      this.value = value;
    }

    public K getKey() {
      return key;
    }

    public V getValue() {
      return value;
    }

    public void setValue(V value) {
      this.value = value;
    }
  }

  private List<Entry> table;

  public Table() {
    table = new ArrayList<>();
  }

  public V get(K key) {
    for (Entry entry : table) {
      if (entry.getKey().equals(key)) {
        return entry.getValue();
      }
    }
    return null;
  }

  public void put(K key, V value) {
    for (Entry entry : table) {
      if (entry.getKey().equals(key)) {
        entry.setValue(value);
        return;
      }
    }
    table.add(new Entry(key, value));
  }

  public V remove(K key) {
    for (Entry entry : table) {
      if (entry.getKey().equals(key)) {
        table.remove(entry);
        return entry.getValue();
      }
    }
    return null;
  }
}
