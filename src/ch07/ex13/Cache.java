package ch07.ex13;

import java.util.LinkedHashMap;

public class Cache<K, V> extends LinkedHashMap<K, V> {
  private final int maxCapacity;

  public Cache(int maxCapacity) {
    this.maxCapacity = maxCapacity;
  }

  @Override
  protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
    return size() > maxCapacity;
  }

}
