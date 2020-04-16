package ch04.ex06;

import java.util.Objects;

public class Item {
  private String description;
  private double price;

  public Item(String description, double price) {
    super();
    this.description = description;
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object otherObj) {
    if (this == otherObj)
      return true;
    if (otherObj == null)
      return false;
    if (!(otherObj instanceof Item))
      return false;
    Item otherItem = (Item) otherObj;
    return Objects.equals(description, otherItem.description) && price == otherItem.price;
  }

}
