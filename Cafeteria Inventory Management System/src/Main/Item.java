package Main;

public class Item {
    private int itemID;
    private String itemName;
    private int itemQuantity;
    private int itemReorderQuantity;
    private String itemExpiryName;
    private int itemPrice;

    public Item(int itemID, String itemName, int itemQuantity, int itemReorderQuantity, String itemExpiryName, int itemPrice) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.itemReorderQuantity = itemReorderQuantity;
        this.itemExpiryName = itemExpiryName;
        this.itemPrice = itemPrice;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int getItemReorderQuantity() {
        return itemReorderQuantity;
    }

    public void setItemReorderQuantity(int itemReorderQuantity) {
        this.itemReorderQuantity = itemReorderQuantity;
    }

    public String getItemExpiryName() {
        return itemExpiryName;
    }

    public void setItemExpiryName(String itemExpiryName) {
        this.itemExpiryName = itemExpiryName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
}
