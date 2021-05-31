package edu.towson.cis.cosc442.project4.coffeemaker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Starts the console UI for the CoffeeMaker
 * @author Josh
 * @version $Revision: 1.0 $
 */
public class Main {
    private static CoffeeMaker coffeeMaker;

    public static void mainMenu() {
        System.out.println("1. Add a recipe");
        System.out.println("2. Delete a recipe");
        System.out.println("3. Edit a recipe");
        System.out.println("4. Add inventory");
        System.out.println("5. Check inventory");
        System.out.println("6. Make coffee");
        System.out.println("0. Exit" + System.getProperty("line.separator")); // added System.getProperty("line.separator") instead of \n
        
        //Get user input
        //made the variable userInput final
        final int userInput = stringToInt(inputOutput("Please press the number that corresponds to what you would like the coffee maker to do."));
        
        if(userInput == 1) addRecipe();
        if(userInput == 2) deleteRecipe();
        if(userInput == 3) editRecipe();
        if(userInput == 4) addInventory();
        if(userInput == 5) checkInventory();
        if(userInput == 6) makeCoffee();
        if(userInput == 0) System.exit(0);
    }
	public static void addRecipe() {
	    //Read in recipe name
		//made the variable name final
	    final String name = inputOutput(System.getProperty("line.separator")+"Please enter the recipe name: ");//added System.getProperty("line.separator") instead of \n
	    
	    //Read in recipe price
	    //made the variable priceString final
	    final String priceString = inputOutput(System.getProperty("line.separator")+"Please enter the recipe price: $");// added System.getProperty("line.separator") instead of \n
	    
	    //made the variable price final
	    final int price = stringToInt(priceString);
	    if(price < 0) {
	    	mainMenu();
	    }
	    
	    //Read in amt coffee
	    //made the variable coffeeString final
	    final String coffeeString = inputOutput(System.getProperty("line.separator")+"Please enter the units of coffee in the recipe: ");// added System.getProperty("line.separator") instead of \n
	    
	    //made the variable amtCoffee final
	    final int amtCoffee = stringToInt(coffeeString);
	    if(amtCoffee < 0) {
	    	mainMenu();
	    }
	    
	    //Read in amt milk
	    //made the variable milkString final
	    final String milkString = inputOutput(System.getProperty("line.separator")+"Please enter the units of milk in the recipe: ");// added System.getProperty("line.separator") instead of \n
	    
	    //made the variable amtMilk final
	    final int amtMilk = stringToInt(milkString);
	    if(amtMilk < 0) {
	    	mainMenu();
	    }
	    
	    //Read in amt sugar
	    //made the variable sugarString final
	    final String sugarString = inputOutput(System.getProperty("line.separator")+"Please enter the units of sugar in the recipe: ");// added System.getProperty("line.separator") instead of \n
        
	    //made the variable amtSugar final
	    final int amtSugar = stringToInt(sugarString);
	    if(amtSugar < 0) {
	    	mainMenu();
	    }
	    
	    //Read in amt chocolate
	    //made the variable chocolateString final
	    final String chocolateString = inputOutput(System.getProperty("line.separator")+"Please enter the units of chocolate in the recipe: ");//added System.getProperty("line.separator") instead of \n
	    
	    //made the variable amtChocolate final
	    final int amtChocolate = stringToInt(chocolateString);
	    if(amtChocolate < 0) {
	    	mainMenu();
	    }
	    
	    boolean recipeAdded = false;
	    //made the variable recipe final
		final Recipe recipe = new Recipe(); //refactored the name and made it recipe 
		recipe.setName(name);
		recipe.setPrice(price);
		recipe.setAmtCoffee(amtCoffee);
		recipe.setAmtMilk(amtMilk);
		recipe.setAmtSugar(amtSugar);
		recipe.setAmtChocolate(amtChocolate);
		   
		recipeAdded = coffeeMaker.addRecipe(recipe);
	    
	    if(recipeAdded) System.out.println(name + " successfully added.");
	    else System.out.println(name + " could not be added.");
	    
	    mainMenu();
    }
    
    public static void deleteRecipe() {
        //made the variable recipes final
    	final Recipe [] recipes = coffeeMaker.getRecipes();
        for(int i = 0; i < recipes.length; i++) {
            System.out.println((i+1) + ". " + recipes[i].getName());
        }
        //made the variable recipeToDeleteString final
        final String recipeToDeleteString = inputOutput("Please select the number of the recipe to delete.");
        
        //made the variable recipeToDelete final
        final int recipeToDelete = stringToInt(recipeToDeleteString) - 1;
	    if(recipeToDelete < 0) {
	    	mainMenu();
	    }
        //made the variable recipeDeleted final
        final boolean recipeDeleted = coffeeMaker.deleteRecipe(recipes[recipeToDelete]);
        
        if(recipeDeleted) System.out.println(recipes[recipeToDelete].getName() + " successfully deleted.");
	    else System.out.println(recipes[recipeToDelete].getName() + "could not be deleted.");
        
        mainMenu();
    }
    
    public static void editRecipe() {
        //made the variable recipes final
    	final Recipe [] recipes = coffeeMaker.getRecipes();
        for(int i = 0; i < recipes.length; i++) {
            System.out.println((i+1) + ". " + recipes[i].getName());
        }
        //made the variable recipeToEditString final
        final String recipeToEditString = inputOutput("Please select the number of the recipe to edit.");
        //made the variable recipeToEdit final
        final int recipeToEdit = stringToInt(recipeToEditString) -1;
	    if(recipeToEdit < 0) {
	    	mainMenu();
	    }
	    //made the variable oldRecipe final
        final Recipe oldRecipe = recipes[recipeToEdit];
        
	    //Read in recipe name and made the variable name final
	    final String name = inputOutput(System.getProperty("line.separator")+"Please enter the recipe name: ");// added System.getProperty("line.separator") instead of \n
	    
	    //Read in recipe price
	    //made the variable priceString final
	    final String priceString = inputOutput(System.getProperty("line.separator")+"Please enter the recipe price: $");//added System.getProperty("line.separator") instead of \n
	    
	    //made the variable price final
	    final int price = stringToInt(priceString);
	    if(price < 0) {
	    	mainMenu();
	    }
	    
	    //Read in amt coffee and made the variable coffeeString final
	    final String coffeeString = inputOutput(System.getProperty("line.separator")+"Please enter the units of coffee in the recipe: ");//added System.getProperty("line.separator") instead of \n
	    //made the variable amtCoffee final
	    final int amtCoffee = stringToInt(coffeeString);
	    if(amtCoffee < 0) {
	    	mainMenu();
	    }
	    
	    //Read in amt milk
	    final String milkString; //made the variable milkString final
	    milkString = inputOutput(System.getProperty("line.separator")+"Please enter the units of milk in the recipe: ");//added System.getProperty("line.separator") instead of \n
	    
	    final int amtMilk; //made the variable amtMilk final
	    amtMilk = stringToInt(milkString);
	    if(amtMilk < 0) {
	    	mainMenu();
	    }
	    
	    //Read in amt sugar
	    final String sugarString; //made the variable sugarString final
	    sugarString = inputOutput(System.getProperty("line.separator")+"Please enter the units of sugar in the recipe: ");//added System.getProperty("line.separator") instead of \n
	    
	    //made the variable amtSugar final
	    final int amtSugar = stringToInt(sugarString);
	    if(amtSugar < 0) {
	    	mainMenu();
	    }
	    
	    //Read in amt chocolate
	    final String chocolateString; //made the variable chocolateString final
	    chocolateString = inputOutput(System.getProperty("line.separator")+"Please enter the units of chocolate in the recipe: ");//added System.getProperty("line.separator") instead of \n
	    
	    //made the variable amtChocolate final
	    final int amtChocolate = stringToInt(chocolateString);
	    if(amtChocolate < 0) {
	    	mainMenu();
	    }
	    final Recipe newRecipe; //made the variable newRecipe final
	    newRecipe = new Recipe();
	    newRecipe.setName(name);
	    newRecipe.setPrice(price);
	    newRecipe.setAmtCoffee(amtCoffee);
	    newRecipe.setAmtMilk(amtMilk);
	    newRecipe.setAmtSugar(amtSugar);
	    newRecipe.setAmtChocolate(amtChocolate);
        
	    final boolean recipeEdited; //made the variable recipeEdited final
        recipeEdited = coffeeMaker.editRecipe(oldRecipe, newRecipe);
        
        if(recipeEdited) System.out.println(oldRecipe.getName() + " successfully edited.");
	    else System.out.println(oldRecipe.getName() + "could not be edited.");
        
        mainMenu();
    }
    
    public static void addInventory() {
	    //Read in amt coffee and made the variable coffeeString final
	    final String coffeeString = inputOutput(System.getProperty("line.separator")+"Please enter the units of coffee to add: ");//added System.getProperty("line.separator") instead of \n
	    
	    //made the variable amtCoffee final
	    final int amtCoffee = stringToInt(coffeeString);
	    if(amtCoffee < 0) {
	    	mainMenu();
	    }
	    
	    //Read in amt milk and made the variable milkString final
	    final String milkString = inputOutput(System.getProperty("line.separator")+"Please enter the units of milk to add: ");//added System.getProperty("line.separator") instead of \n
	    
	    //made the variable amtMilk final
	    final int amtMilk = stringToInt(milkString);
	    if(amtMilk < 0) {
	    	mainMenu();
	    }
	    
	    //Read in amt sugar and made the variable sugarString final
	    final String sugarString = inputOutput(System.getProperty("line.separator")+"Please enter the units of sugar to add: ");//added System.getProperty("line.separator") instead of \n
	    
   	    //made the variable amtSugar final
	    final int amtSugar = stringToInt(sugarString);
	    if(amtSugar < 0) {
	    	mainMenu();
	    }
	    
	    //Read in amt chocolate and and made the variable chocolateString final
	    final String chocolateString = inputOutput(System.getProperty("line.separator")+"Please enter the units of chocolate to add: ");//added System.getProperty("line.separator") instead of \n
	    
	    //made the variable amtChocolate final
	    final int amtChocolate = stringToInt(chocolateString);
	    if(amtChocolate < 0) {
	    	mainMenu();
	    }
	    
        coffeeMaker.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);
        mainMenu();
    }
    
    public static void checkInventory() {
    	//made the variable inventory final
    	final Inventory inventory = coffeeMaker.checkInventory();
        System.out.println(inventory.toString());
        mainMenu();
    }
    
    public static void makeCoffee() {
    	//made the variable recipes final
    	final Recipe [] recipes = coffeeMaker.getRecipes();
        for(int i = 0; i < recipes.length; i++) {
            System.out.println((i+1) + ". " + recipes[i].getName());
        }
        String recipeToPurchaseString = inputOutput("Please select the number of the recipe to purchase.");
        int recipeToPurchase = stringToInt(recipeToPurchaseString) -1;
	    if(recipeToPurchase < 0) {
	    	mainMenu();
	    }
	    //made the variable amountPaid final
        final String amountPaid = inputOutput("Please enter the amount you wish to pay");
        
        //made the variable amountToPay final
        final int amountToPay = stringToInt(amountPaid);
	    if(amountToPay < 0) {
	    	mainMenu();
	    }
        
        Recipe recipe = recipes[recipeToPurchase];
        int change = coffeeMaker.makeCoffee(recipe, amountToPay);
        
        System.out.println("Your change is: " + change + System.getProperty("line.separator"));//added System.getProperty("line.separator") instead of \n
        mainMenu();
    }
    
    /**
     * Method inputOutput.
     * @param message String
     * @return String
     */
    public static String inputOutput(String message) {
        System.out.println(message);
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String returnString = "";
	    try {
	        returnString = br.readLine();
	    }
	    catch (IOException e){
	        System.out.println("Error reading in value");
	        mainMenu();
	    }
	    return returnString;
    }
    
    /**
     * Method stringToInt.
     * @param value String
     * @return int
     */
    private static int stringToInt(String value) {
        int returnInt = -1;
        try {
            returnInt = Integer.parseInt(value);
        }
        catch (NumberFormatException e) {
            System.out.println("Please input an integer"+System.getProperty("line.separator"));//added System.getProperty("line.separator") instead of \n
        }
        return returnInt;
    }
    
    /**
     * Method main.
     * @param args String[]
     */
    public static void main(String[] args) {
	    coffeeMaker = new CoffeeMaker();
	    System.out.println("Welcome to the CoffeeMaker!"+System.getProperty("line.separator"));//added System.getProperty("line.separator") instead of \n
	    mainMenu();
	}
}
