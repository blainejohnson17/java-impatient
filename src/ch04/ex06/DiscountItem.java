package ch04.ex06;

public class DiscountItem extends Item {
  private double discount;

  public DiscountItem(String description, double price, double discount) {
    super(description, price);
    this.discount = discount;
  }

  public double getDiscount() {
    return discount;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }

  @Override
  public boolean equals(Object otherObj) {
    if (!super.equals(otherObj))
      return false;

    if (getClass() == otherObj.getClass()) {
      DiscountItem other = (DiscountItem) otherObj;
      return discount == other.discount;
    }
    return true;
  }

}
