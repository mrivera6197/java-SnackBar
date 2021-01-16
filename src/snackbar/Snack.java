package snackbar;

public class Snack {
  // fields
  private static int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineId;

  // constructor
  public Snack(String name, int quantity, double cost, int vendingMachineId) {
    maxId++;
    id = maxId;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachineId = vendingMachineId;
  }

  // getters
  public String getName() {
    return name;
  }

  public int getQuantity() {
    return quantity;
  }

  public double getCost() {
    return cost;
  }

  public int getVendingMachineId() {
    return vendingMachineId;
  }

  public int getId() {
    return id;
  }

  // setters
  public void setName(String name) {
    this.name = name;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public void setVendingMachineId(int vendingMachineId) {
    this.vendingMachineId = vendingMachineId;
  }

  public void addSnack(int amount) {
    this.quantity += amount;
  }

  public void buySnack(int amount) {
    this.quantity -= amount;
  }

  public double getTotalCost(int amount) {
    double totalCost = this.cost * amount;
    return totalCost;
  }

}
