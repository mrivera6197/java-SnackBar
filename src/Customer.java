package snackbar;

public class Customer {
  // fields
  private int maxId;
  private int id;
  private String name;
  private double cashOnHand;

  // custructor with initial state
  public Customer(String name, double cashOnHand) {
    maxId++;
    id = maxId;
    this.name = name;
    this.cashOnHand = cashOnHand;
  }

  // getters
  public String getName() {
    return name;
  }

  public double getCashOnHand() {
    return cashOnHand;
  }

  public int getId() {
    return id;
  }

  // setters
  public void setName(String name) {
    this.name = name;
  }

  public void getCash(double amount) {
    this.cashOnHand += amount;
  }

  public void loseCash(double amount) {
    this.cashOnHand -= amount;
  }
}
