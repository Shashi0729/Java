

class Store {
    public String itemNames[] = new String[4];
    public int index = 0;

    public int getLength() {
        return this.itemNames.length;
    }

    public void setItem(String item) {
        if (this.index < this.getLength()) {
            this.itemNames[index] = item;
            index++;
        }
    }

    public void displayItems() {
        for (int i = 0; i < this.getLength(); i++) {
            System.out.println("Items are: " + itemNames[i]);
        }
    }

    // Search
    public String searchItem(String item) {
        for (String i : itemNames) {
            if (i == item) {
                System.out.println("Item is: " + i);
                return "Item found.";
            }
        }
        return "not found";
    }

    // Update
    public String updateItem(String oldItem, String newItem) {
        for (int i = 0; i < this.getLength(); i++) {
            if (oldItem == itemNames[i]) {
                itemNames[i] = newItem;
                return "Updated";
            }
        }
        return "not found";
    }

    // Delete
    public String deleteItem(String itemName) {
        for (int i = 0; i < this.getLength(); i++) {
            if (itemName == itemNames[i]) {
                itemNames[i] = null;
                return "Deleted";
            }
        }
        return "not found";
    }
}


