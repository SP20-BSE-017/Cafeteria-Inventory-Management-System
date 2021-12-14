package Main;

public class Recipe {
    private int recipeID;
    private String recipeName;
    private int recipePrice;
    private int[] itemIDs;

    public Recipe(int recipeID, String recipeName, int recipePrice) {
        this.recipeID = recipeID;
        this.recipeName = recipeName;
        this.recipePrice = recipePrice;
    }

    public int getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public int getRecipePrice() {
        return recipePrice;
    }

    public void setRecipePrice(int recipePrice) {
        this.recipePrice = recipePrice;
    }

    public int[] getItemIDs() {
        return itemIDs;
    }

    public void setItemIDs(int[] itemIDs) {
        this.itemIDs = itemIDs;
    }
}
