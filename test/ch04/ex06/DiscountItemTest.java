package ch04.ex06;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class DiscountItemTest {

  @Test
  public void test() {
    DiscountItem discountItem1 = new DiscountItem("book", 19.99, 20);
    Item item = new Item("book", 19.99);
    DiscountItem discountItem2 = new DiscountItem("book", 19.99, 30);

    assertTrue(discountItem1.equals(item));
    assertTrue(item.equals(discountItem1));
    assertTrue(item.equals(discountItem2));
    assertTrue(discountItem2.equals(item));
    assertFalse(discountItem1.equals(discountItem2));
    assertFalse(discountItem2.equals(discountItem1));
  }

}
