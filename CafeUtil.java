import java.util.ArrayList;

public class CafeUtil {
    public void militaryHoursTest() {
        for (int i = 0; i < 24; i++) {
            System.out.println(i);
        }
    }

    public void specialsAlert() {
        for (int i = 6; i < 16; i++) {
            if (i % 3 == 0) {
                System.out.println("In the next 15 minutes you may recive a free coffee.");
            } else {
                System.out.println("Come back later and find out about our special offers.");
            }
        }
    }

    public void coffeeNotification() {
        for (int i = 0; i < 24; i++) {
            System.out.println("it is" + i + ":00, do you need a coffee break?");
        }
    }

    public void displayMenu(String[] menu) {
        for (String name : menu) {
            System.out.println(name);
        }
    }

    public int leadsAtDay10() {
        int lead = 0;
        for (int i = 1; i < 11; i++) {
            lead += i;
        }
        return lead;
    }

    public double getHighestPrice(double[] prices) {
        double max = 0.0;
        for (double price : prices) {
            if (price > max) {
                max = price;
            }
        }
        return max;
    }

    public double getOrderTotal(double[] order) {
        double total = 0.0;
        for (double price : order) {
            total += price;
        }
        return total;
    }

    public ArrayList<String> raffleWinners(String[] customers) {
        ArrayList<String> winners = new ArrayList<>();
        for (int i = 0; i < customers.length; i += 4) {
            winners.add(customers[i]);
        }
        return winners;
    }
}