package edu.towson.cis.cosc442.project4.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CoffeeMakerTest</code> contains tests for the class <code>{@link CoffeeMaker}</code>.
 *
 * @generatedBy CodePro at 3/14/21, 1:04 PM
 * @author Stephanie Prem
 * @version $Revision: 1.0 $
 */
public class CoffeeMakerTest {
	private CoffeeMaker fixture;
	private Inventory i;
	private Recipe recipe;

	/**
	 * Run the CoffeeMaker() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testCoffeeMaker_1()
		throws Exception {
		CoffeeMaker result = new CoffeeMaker();
		assertNotNull(result);
	}


	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 * matching the Acceptance Tests Document
	 */
	@Test
	public void testAddInventory1_1()
		throws Exception {
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 0;
		int amtChocolate = -1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);
		assertEquals(false, result);
	}
	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 * matching the Acceptance Tests Document
	 */
	@Test
	public void testAddInventory1_2()
		throws Exception {
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 0;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);
		assertEquals(true, result);
	}
	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 * matching the Acceptance Tests Document
	 */
	@Test
	public void testAddInventory1_3()
		throws Exception {
		int amtCoffee = -1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);
		assertEquals(false, result);
	}
	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 * matching the Acceptance Tests Document
	 */
	@Test
	public void testAddInventory1_4()
		throws Exception {
		int amtCoffee = 1;
		int amtMilk = -1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);
		assertEquals(false, result);
	}
	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 * matching the Acceptance Tests Document
	 */
	@Test
	public void testAddInventory1_5()
		throws Exception {
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);
		assertEquals(true, result);
	}
	/**
	 * Mutation test
	 * @throws Exception
	 * changed conditional boundary
	 */
	@Test
	public void testAddInventory1_6()
		throws Exception {
		int amtCoffee = 0;
		int amtMilk = 0;
		int amtSugar = 0;
		int amtChocolate = 0;
		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 * matching the Acceptance Tests Document
	 */
	@Test
	public void testAddRecipe1_1()
		throws Exception {
		boolean result = fixture.addRecipe(recipe);
		assertEquals(true, result);
	}
	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 * matching the Acceptance Tests Document
	 */
	@Test
	public void testAddRecipe1_2()
		throws Exception {
		Recipe newR = new Recipe();
		boolean result = recipe.equals(newR);
		assertEquals(false, result);
	}
	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 * matching the Acceptance Tests Document
	 */
	@Test
	public void testAddRecipe1_3()
		throws Exception {
		Recipe [] recipeArray = new Recipe[4];
		recipeArray[3]= recipe;
		boolean result = true;
		for (int i=0; i<4; i++) {
			if (recipeArray[i] == recipe)
				result = false;
		}
		assertEquals(false, result);
	}

	/**
	 * Run the Inventory checkInventory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 * matching the Acceptance Tests Document
	 */
	@Test
	public void testCheckInventory_1()
		throws Exception {
		assertNotNull(i);
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", i.toString());
		assertEquals(15, i.getChocolate());
		assertEquals(15, i.getSugar());
		assertEquals(15, i.getCoffee());
		assertEquals(15, i.getMilk());
	}
	/**
	 * Run the Inventory checkInventory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 * matching the Acceptance Tests Document
	 */
	@Test
	public void testCheckInventory_2()
		throws Exception {
		fixture.addInventory(5, 5, 5, 5);

		assertNotNull(i);
		assertEquals("Coffee: 20\r\nMilk: 20\r\nSugar: 20\r\nChocolate: 20\r\n", i.toString());
		assertEquals(20, i.getChocolate());
		assertEquals(20, i.getSugar());
		assertEquals(20, i.getCoffee());
		assertEquals(20, i.getMilk());
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 * matching the Acceptance Tests Document
	 */
	@Test
	public void testDeleteRecipe1_1()
		throws Exception {
		boolean result = fixture.deleteRecipe(recipe);
		assertEquals(false, result);
	}
	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 * matching the Acceptance Tests Document
	 */
	@Test
	public void testDeleteRecipe1_2()
		throws Exception {
		Recipe r = new Recipe();
		r.setName("coffee");
		r.setAmtCoffee(3);
		r.setAmtMilk(1);
		r.setAmtSugar(1);
		r.setAmtChocolate(1);
		fixture.addRecipe(r);
		
		boolean result = fixture.deleteRecipe(r);
		assertEquals(true, result);
	}
	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 * matching the Acceptance Tests Document
	 */
	@Test
	public void testDeleteRecipe1_3()
		throws Exception {
		Recipe r = null;
		boolean result = fixture.deleteRecipe(r);
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 * matching the Acceptance Tests Document
	 */
	@Test
	public void testEditRecipe1_1()
		throws Exception {
		Recipe newRecipe = new Recipe();

		boolean result = fixture.editRecipe(recipe, newRecipe);
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 * matching the Acceptance Tests Document
	 */
	@Test
	public void testEditRecipe1_2()
		throws Exception {
		Recipe newRecipe = new Recipe();
		newRecipe.setName("coffee");
		fixture.addRecipe(recipe);
		fixture.addRecipe(newRecipe);
	
		assertNotNull(recipe);
		assertNotNull(newRecipe);
		assertEquals(true, fixture.editRecipe(recipe, newRecipe));
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testGetRecipeForName_1()
		throws Exception {
		String name = "";
		Recipe result = fixture.getRecipeForName(name);
		
		assertNotNull(result);
		assertEquals(null, result.getName());
		assertEquals(null, result.toString());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getPrice());
	}
	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testGetRecipeForName_2()
		throws Exception {
		String name = "coffee";
		Recipe result = new Recipe();
		fixture.addRecipe(result);
		result.setName(name);

		assertNotNull(result);
		assertEquals("coffee", result.getName());
		assertEquals("coffee", result.toString());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getPrice());
	}
	/**
	 * Mutation test
	 * @throws Exception
	 * negated conditional 
	 */
	@Test
	public void testGetRecipeForName_3()
		throws Exception {
		boolean result;
		if (recipe.getName()!= recipe.getName())
			result=false;
		else
			result=true;

		assertEquals(true, result);
	}
	
	/**
	 * Run the Recipe[] getRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testGetRecipes_1()
		throws Exception {
		Recipe[] result = fixture.getRecipes();

		assertNotNull(result);
		assertEquals(4, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].getName());
		assertEquals(null, result[0].toString());
		assertEquals(0, result[0].getAmtCoffee());
		assertEquals(0, result[0].getAmtSugar());
		assertEquals(0, result[0].getAmtChocolate());
		assertEquals(0, result[0].getAmtMilk());
		assertEquals(0, result[0].getPrice());
		assertNotNull(result[1]);
		assertEquals(null, result[1].getName());
		assertEquals(null, result[1].toString());
		assertEquals(0, result[1].getAmtCoffee());
		assertEquals(0, result[1].getAmtSugar());
		assertEquals(0, result[1].getAmtChocolate());
		assertEquals(0, result[1].getAmtMilk());
		assertEquals(0, result[1].getPrice());
		assertNotNull(result[2]);
		assertEquals(null, result[2].getName());
		assertEquals(null, result[2].toString());
		assertEquals(0, result[2].getAmtCoffee());
		assertEquals(0, result[2].getAmtSugar());
		assertEquals(0, result[2].getAmtChocolate());
		assertEquals(0, result[2].getAmtMilk());
		assertEquals(0, result[2].getPrice());
		assertNotNull(result[3]);
		assertEquals(null, result[3].getName());
		assertEquals(null, result[3].toString());
		assertEquals(0, result[3].getAmtCoffee());
		assertEquals(0, result[3].getAmtSugar());
		assertEquals(0, result[3].getAmtChocolate());
		assertEquals(0, result[3].getAmtMilk());
		assertEquals(0, result[3].getPrice());
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 * matching the Acceptance Tests Document
	 */
	@Test
	public void testpurchaseBeverage1_1()
		throws Exception {
		int amtPaid = 50;
		int result = fixture.makeCoffee(recipe, amtPaid);

		assertEquals(0, result);
	}
	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 * matching the Acceptance Tests Document
	 */
	@Test
	public void testpurchaseBeverage2_1()
		throws Exception {
		int amtPaid = 0;
		int result = fixture.makeCoffee(recipe, amtPaid);

		assertEquals(0, result);
	}
	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 * matching the Acceptance Tests Document
	 */
	@Test
	public void testpurchaseBeverage2_2()
		throws Exception {
		recipe.setAmtCoffee(50);
		int result = fixture.makeCoffee(recipe, recipe.getAmtCoffee());
		
		assertEquals(50, result);
	}
	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 * matching the Acceptance Tests Document
	 */
	@Test
	public void testpurchaseBeverage2_3()
		throws Exception {
		int amtPaid = 1;
		int result = fixture.makeCoffee(recipe, amtPaid);

		assertEquals(1, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Before                            
	public void setUp()
	{
		fixture = new CoffeeMaker();
		
		i = fixture.checkInventory();
		i.setChocolate(15);
		i.setCoffee(15);
		i.setMilk(15);
		i.setSugar(15);
	
		recipe = new Recipe();
		recipe.setName("Coffee");
		recipe.setPrice(50);
		recipe.setAmtCoffee(3);
		recipe.setAmtMilk(1);
		recipe.setAmtSugar(1);
		recipe.setAmtChocolate(0);

	}

	/**
	 * Perform post-test clean-up.
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@After
	public void tearDown()
		throws Exception {
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CoffeeMakerTest.class);
	}
}