public class StoreRunner {
    public static void main(String... args) {
        Store store = new Store();
        int length = store.getLength();
        System.out.println("Length is: " + length);
        store.setItem("APPLE");
        store.setItem("BANANA");
        store.setItem("ORANGE");
        store.setItem("GRAPES");
        store.setItem("MANGO");
        store.displayItems();
        System.out.println("-----Search-----");
        String result = store.searchItem("ORANGE");
        System.out.println(result);
        System.out.println("-----Update-----");
        String update = store.updateItem("ORANGE", "WATERMELON");
        System.out.println(update);
        store.displayItems();
        System.out.println("-----Delete-----");
        String delete = store.deleteItem("BANANA");
        System.out.println(delete);
        store.displayItems();
    }
}
