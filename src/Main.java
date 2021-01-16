package snackbar;

import java.text.DecimalFormat;

public class Main {
  private static DecimalFormat df = new DecimalFormat("$#, ##0.00");

  private static void main(String arg[]) {

    // instantiate 2 customers
    Customer jane = new Customer("Jane", 45.25);
    Customer bob = new Customer("Bob", 33.14);

    // instantiate 3 vending machines
    VendingMachine v1 = new VendingMachines("Food");
    VendingMachine v2 = new VendingMachines("Drink");
    VendingMachine v3 = new VendingMachines("Office");

    // instantiate 5 snacks
    Snack chips = new Snack("Chips", 36, 1.75);
    Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00);
    Snack pretzel = new Snack("Pretzel", 30, 2.00);
    Snack soda = new Snack("Soda", 24, 2.50);
    Snack water = new Snack("Water", 20, 2.75);
  }
}
