package ch06.ex03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TableTest {

  @Test
  void testTablePutGet() {
    Table<String, String> table = new Table<>();

    assertEquals(null, table.get("k1"));

    table.put("k1", "v1");
    assertEquals("v1", table.get("k1"));
  }

  @Test
  void testTableRemove() {
    Table<String, String> table = new Table<>();

    assertEquals(null, table.remove("k1"));

    table.put("k1", "v1");
    assertEquals("v1", table.remove("k1"));

    assertEquals(null, table.remove("k1"));
  }

}
