package edu.towson.cis.cosc442.project4.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>InventoryTest</code> contains tests for the class <code>{@link Inventory}</code>.
 *
 * @generatedBy CodePro at 3/14/21, 1:04 PM
 * @author Stephanie Prem
 * @version $Revision: 1.0 $
 */
public class InventoryTest {
	Inventory fixture;
	Recipe recipe;
	
	/**
	 * Run the Inventory() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testInventory_1()
		throws Exception {
		assertNotNull(fixture);
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", fixture.toString());
		assertEquals(15, fixture.getChocolate());
		assertEquals(15, fixture.getSugar());
		assertEquals(15, fixture.getCoffee());
		assertEquals(15, fixture.getMilk());
	}
	/**
	 * Mutation test for lines 16-19
	 * @throws Exception
	 * removed call to...
	 */
	@Test
	public void testInventory_2()
		throws Exception {
		fixture.setCoffee(15);
		fixture.setMilk(15);
		fixture.setSugar(15);
		fixture.setChocolate(15);
		assertEquals(15, fixture.getChocolate());
		assertEquals(15, fixture.getSugar());
		assertEquals(15, fixture.getCoffee());
		assertEquals(15, fixture.getMilk());
	}

	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testEnoughIngredients_1()
		throws Exception {
		boolean result = fixture.enoughIngredients(recipe);

		assertEquals(true, result);
	}
	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testEnoughIngredients_2()
		throws Exception {
		Inventory i3 = new Inventory();
		i3.setCoffee(0);
		boolean result = i3.enoughIngredients(recipe);

		assertEquals(false, result);
	}
	/**
	 * Mutation test
	 * @throws Exception
	 * changed conditional boundary
	 */
	@Test
	public void testEnoughIngredients_3()
		throws Exception {
		Inventory i3 = new Inventory();
		i3.setCoffee(3);
		i3.setMilk(1);
		i3.setSugar(1);
		i3.setChocolate(0);
		boolean result = i3.enoughIngredients(recipe);
		
		assertEquals(true, result);
	}

	/**
	 * Run the int getChocolate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testGetChocolate_1()
		throws Exception {
		int result = fixture.getChocolate();

		assertEquals(15, result);
	}

	/**
	 * Run the int getCoffee() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testGetCoffee_1()
		throws Exception {
		int result = fixture.getCoffee();

		assertEquals(15, result);
	}

	/**
	 * Run the int getMilk() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testGetMilk_1()
		throws Exception {
		int result = fixture.getMilk();

		assertEquals(15, result);
	}

	/**
	 * Run the int getSugar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testGetSugar_1()
		throws Exception {
		int result = fixture.getSugar();

		assertEquals(15, result);
	}

	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testSetChocolate_1()
		throws Exception {
		fixture.setChocolate(-1);
		int result = fixture.getChocolate();
		
		assertEquals(0, result);
	}
	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testSetChocolate_2()
		throws Exception {
		int chocolate = 1;
		fixture.setChocolate(chocolate);
		int result = fixture.getChocolate();
		
		assertEquals(1, result);
	}
	/**
	 * Mutation test
	 * @throws Exception
	 * changed conditional boundary
	 */
	@Test
	public void testSetChocolate_3()
		throws Exception {
		fixture.setChocolate(0);
		int result = fixture.getChocolate();
		
		assertEquals(0, result);
	}

	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testSetCoffee_1()
		throws Exception {
		int coffee = -1;
		fixture.setCoffee(coffee);
		int result = fixture.getCoffee();
		
		assertEquals(0, result);
	}
	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testSetCoffee_2()
		throws Exception {
		int coffee = 1;
		fixture.setCoffee(coffee);
		int result = fixture.getCoffee();
		
		assertEquals(1, result);
	}
	/**
	 * Mutation test
	 * @throws Exception
	 * changed conditional boundary
	 */
	@Test
	public void testSetCoffee_3()
		throws Exception {
		fixture.setCoffee(0);
		int result = fixture.getCoffee();
		
		assertEquals(0, result);
	}

	/**
	 * Run the void setMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testSetMilk_1()
		throws Exception {
		int milk = -1;
		fixture.setMilk(milk);
		int result = fixture.getMilk();
		
		assertEquals(0, result);
	}
	/**
	 * Run the void setMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testSetMilk_2()
		throws Exception {
		int milk = 1;
		fixture.setMilk(milk);
		int result = fixture.getMilk();
		
		assertEquals(1, result);
	}
	/**
	 * Mutation test
	 * @throws Exception
	 * changed conditional boundary
	 */
	@Test
	public void testSetMilk_3()
		throws Exception {
		fixture.setMilk(0);
		int result = fixture.getMilk();
		
		assertEquals(0, result);
	}

	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testSetSugar_1()
		throws Exception {
		int sugar = -1;
		fixture.setSugar(sugar);
		int result = fixture.getSugar();
		
		assertEquals(0, result);
	}
	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testSetSugar_2()
		throws Exception {
		int sugar = 1;
		fixture.setSugar(sugar);
		int result = fixture.getSugar();
		
		assertEquals(1, result);
	}
	/**
	 * Mutation test
	 * @throws Exception
	 * changed conditional boundary
	 */
	@Test
	public void testSetSugar_3()
		throws Exception {
		fixture.setSugar(0);
		int result = fixture.getSugar();
		
		assertEquals(0, result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		String result = fixture.toString();

		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", result);
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
		throws Exception {
		fixture = new Inventory();
		fixture.setChocolate(15);
		fixture.setSugar(15);
		fixture.setCoffee(15);
		fixture.setMilk(15);
		
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
		new org.junit.runner.JUnitCore().run(InventoryTest.class);
	}
}