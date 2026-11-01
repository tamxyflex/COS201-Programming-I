import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        double totalCost = quantity * unitPrice;

        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: ₦" + unitPrice);
        System.out.println("Total Cost: ₦" + totalCost);

        input.close();
    }
}