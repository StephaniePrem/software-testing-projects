package edu.towson.cis.cosc442.project4.coffeemaker;
/**
 * CoffeeMaker object
 * @version $Revision: 1.0 $
 */
public class CoffeeMaker {
	/** Array of recipes in coffee maker */
	private Recipe [] recipeArray;
	/** Number of recipes in coffee maker */
	private final int NUM_RECIPES = 4;
	/** Array describing if the array is full */
	private boolean [] recipeFull;
	/** Inventory of the coffee maker */
    private Inventory inventory;
	
    /**
     * Constructor for the coffee maker
     *
     */
	public CoffeeMaker() {
	    recipeArray = new Recipe[NUM_RECIPES];
	    recipeFull = new boolean[NUM_RECIPES];
		for(int i = 0; i < NUM_RECIPES; i++) {
		   recipeArray[i] = new Recipe();
		   recipeFull[i] = false;
		}
		inventory = new Inventory();
	}

	/**
	 * Returns true if a recipe is successfully added to the 
	 * coffee maker
	 * @param r
	 * @return boolean */
	public boolean addRecipe(Recipe r) {
        boolean canAddRecipe=true;
            
        //Check if the recipe already exists
        for(int i = 0; i < NUM_RECIPES; i++) {
            if(r.equals(recipeArray[i])) {
                canAddRecipe = false;
            }
        }
      
        //Check for an empty recipe, add recipe to first empty spot
        if(canAddRecipe) {
        	int emptySpot = -1;
        	for(int i = 0; i < NUM_RECIPES; i++) {
        		if(!recipeFull[i]) {
        			emptySpot = i;
        			canAddRecipe = true;
        		}
        	}
        	if(emptySpot != -1) {
        		recipeArray[emptySpot] = r;
        		recipeFull[emptySpot] = true;
        	}
        	else {
        		canAddRecipe = false;
        	}
        }
        return canAddRecipe;
    }
    
	/**
	 * Returns true if the recipe was deleted from the 
	 * coffee maker
	 * @param r
	
	 * @return boolean */
    public boolean deleteRecipe(Recipe r) {
        boolean canDeleteRecipe = false;
        if(r != null) {
	        for(int i = 0; i < NUM_RECIPES; i++) {
	            if(r.equals(recipeArray[i])) {
	                this.recipeArray[i] = recipeArray[i]; //added this.
	                canDeleteRecipe = true;
	            }
	        }
        }
        return canDeleteRecipe;
    }
    
    /**
     * Returns true if the recipe is successfully edited
     * @param oldRecipe
     * @param newRecipe
    
     * @return boolean */
    public boolean editRecipe(Recipe oldRecipe, Recipe newRecipe) {
        boolean canEditRecipe = false;
        for(int i = 0; i < NUM_RECIPES; i++) {
        	if(recipeArray[i].getName() != null) {
	            if(newRecipe.equals(recipeArray[i])) { 
	            	recipeArray[i] = new Recipe();
	            	if(addRecipe(newRecipe)) {
	            		canEditRecipe = true;
	            	} else {
	            		canEditRecipe = false;
	            	}
	            }
        	}
        }
        return canEditRecipe;
    }
    
    /**
     * Returns true if inventory was successfully added
     * @param amtCoffee
     * @param amtMilk
     * @param amtSugar
     * @param amtChocolate
    
     * @return boolean */
    public boolean addInventory(int amtCoffee, int amtMilk, int amtSugar, int amtChocolate) {
        boolean canAddInventory = true;
        if(amtCoffee < 0 || amtMilk < 0 || amtSugar < 0 || amtChocolate < 0) {//changed to have amtSugar < 0 
            canAddInventory = false;
        }
        else {
	        inventory.setCoffee(inventory.getCoffee() + amtCoffee);
	        inventory.setMilk(inventory.getMilk() + amtMilk);
	        inventory.setSugar(inventory.getSugar() + amtSugar);
	        inventory.setChocolate(inventory.getChocolate() + amtChocolate);
        }
        return canAddInventory;
    }
    
    /**
     * Returns the inventory of the coffee maker
    
     * @return Inventory */
    public Inventory checkInventory() {
        return inventory;
    }
    
    /**
     * Returns the change of a user's beverage purchase, or
     * the user's money if the beverage cannot be made
     * @param r
     * @param amtPaid
    
     * @return int */
    public int makeCoffee(Recipe r, int amtPaid) {
        boolean canMakeCoffee = true;
        int coffee;
        int milk;
        int sugar;
        int chocolate;
        if(amtPaid < r.getPrice()) {
            canMakeCoffee = false;
        }
        if(!inventory.enoughIngredients(r)) {
            canMakeCoffee = false;
        }
        if(canMakeCoffee) {
	        coffee = (inventory.getCoffee() - r.getAmtCoffee());//changed to subtraction 
	        milk = (inventory.getMilk() - r.getAmtMilk());
	        sugar = (inventory.getSugar() - r.getAmtSugar());
	        chocolate = (inventory.getChocolate() - r.getAmtChocolate());
	        //inventory.setCoffee(coffee);//Mutation: removed call
	        //inventory.setMilk(milk); //Mutation: removed call
	        //inventory.setSugar(sugar); //Mutation: removed call
	       // inventory.setChocolate(chocolate); //Mutation: removed call
	        
	        amtPaid = amtPaid - r.getPrice();
        }
        
        return amtPaid;//Mutation: replaced int return with 0
    }

    /**
     * Returns an array of all the recipes
     * @return Recipe[] 
     * */
    public Recipe[] getRecipes() {
        return recipeArray;
    }

    /**
     * Returns the Recipe associated with the given name
     * @param name
    
     * @return Recipe */
	public Recipe getRecipeForName(String name) {
		Recipe recipeName = new Recipe(); //refactored to change the name to recipeName
		for(int i = 0; i < NUM_RECIPES; i++) {
			if(recipeArray[i].getName() != null) { 
				if((recipeArray[i].getName()).equals(name)) {
					recipeName = recipeArray[i];
				}
			}
		}
		return recipeName;
	}
}
