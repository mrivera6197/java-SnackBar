package snackbar;

import java.text.DecimalFormat;

public class Main {
  private static DecimalFormat df = new DecimalFormat("$#, ##0.00");

  public static void main(String[] args) {

    // instantiate 2 customers
    Customer jane = new Customer("Jane", 45.25);
    Customer bob = new Customer("Bob", 33.14);

    // instantiate 3 vending machines
    VendingMachine v1 = new VendingMachine("Food");
    VendingMachine v2 = new VendingMachine("Drink");
    VendingMachine v3 = new VendingMachine("Office");

    // instantiate 5 snacks
    Snack chips = new Snack("Chips", 36, 1.75, v1.getId());
    Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
    Snack pretzel = new Snack("Pretzel", 30, 2.00, v1.getId());
    Snack soda = new Snack("Soda", 24, 2.50, v2.getId());
    Snack water = new Snack("Water", 20, 2.75, v2.getId());

    jane.loseCash(soda.getTotalCost(3));
    System.out.println("Jane cash on hand " + df.format(jane.getCashOnHand()));
    soda.buySnack(3);
    System.out.println("Quantity of soda is " + soda.getQuantity());
    System.out.println();

    jane.loseCash(pretzel.getTotalCost(1));
    pretzel.buySnack(1);
    System.out.println("Jane cash on hand " + df.format(jane.getCashOnHand()));
    System.out.println("Quantity of pretzel is " + pretzel.getQuantity());
    System.out.println();

    bob.loseCash(soda.getTotalCost(2));
    soda.buySnack(2);
    System.out.println("Bob cash on hand " + df.format(bob.getCashOnHand()));
    System.out.println("Quantity of soda is " + soda.getQuantity());
    System.out.println();

    jane.getCash(10.00);
    System.out.println("Jane cash on hand " + df.format(jane.getCashOnHand()));
    System.out.println();

    jane.loseCash(chocolateBar.getTotalCost(1));
    chocolateBar.buySnack(1);
    System.out.println("Jane cash on hand " + df.format(jane.getCashOnHand()));
    System.out.println("Quantity of chocolate bar is " + chocolateBar.getQuantity());
    System.out.println();

    pretzel.addSnack(12);
    System.out.println("Quantity of pretzel is " + pretzel.getQuantity());
    System.out.println();

    bob.loseCash(pretzel.getTotalCost(3));
    pretzel.buySnack(3);
    System.out.println("Bob cash on hand " + df.format(bob.getCashOnHand()));
    System.out.println("Quantity of pretzel is " + pretzel.getQuantity());
    System.out.println();


  }
}
