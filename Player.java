import java.util.HashMap;
import java.util.Map;

public class Player {
    String name;
    int health = 100;
    Map<String, Integer> inventory = new HashMap<>();

    public Player(String name) {
        this.name = name;
        this.health = 100;
    }

    public void addItem(String item) {
        // Add +1 to count if it already exists
        inventory.put(item, inventory.getOrDefault(item, 0) + 1);
        System.out.println("You received " + item + "!");
    }
    public void addItemWithoutPrint(String item) {
        inventory.put(item, inventory.getOrDefault(item, 0) + 1);
    }
    public void showInventory() {
        System.out.println("\n" + name + "'s Inventory:");
        if (inventory.isEmpty()) {
            System.out.println("(empty)");
        } else {
            for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                System.out.println("  " + entry.getKey() + " x" + entry.getValue());
            }
        }
    }
    public boolean hasItem(String item) {
        return inventory.containsKey(item) && inventory.get(item) > 0;
    }
}