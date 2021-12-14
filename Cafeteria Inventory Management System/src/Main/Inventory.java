package Main;

import java.util.Date;

public class Inventory {
    public void viewStock(){

    }

    public void addItem(int itemID, String itemName, int itemQuantity, int itemReorderQuantity, Date itemExpiryDate, int itemPrice){
        Item newItem = new Item(itemID, itemName, itemQuantity, itemReorderQuantity, itemExpiryDate, itemPrice);
    }

    public void removeItem(){

    }

    public void addRecipe(int recipeID,String recipeName, int recipePrice, int noOfIngredients){
        Recipe newRecipe = new Recipe(recipeID,recipeName, recipePrice, noOfIngredients);
    }

    public void removeRecipe(){

    }

}
