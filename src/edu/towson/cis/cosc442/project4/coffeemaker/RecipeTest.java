package edu.towson.cis.cosc442.project4.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RecipeTest</code> contains tests for the class <code>{@link Recipe}</code>.
 *
 * @generatedBy CodePro at 3/14/21, 1:04 PM
 * @author Stephanie Prem
 * @version $Revision: 1.0 $
 */
public class RecipeTest {
	Inventory fixture;
	Recipe recipe;
	Recipe r2;
	
	/**
	 * Run the boolean equals(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Recipe r3 = new Recipe();
		r3.setName((String) null);
		boolean result = r3.equals(recipe);

		assertEquals(false, result);
	}
	/**
	 * Run the boolean equals(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		boolean result = r2.equals(recipe);

		assertEquals(false, result);
	}
	/**
	 * Run the boolean equals(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Recipe r4 = new Recipe();
		r4.setName("name");
		Recipe r3 = new Recipe();
		r3.setName("name");
		boolean result = r4.equals(r3);

		assertEquals(true, result);
	}

	/**
	 * Run the int getAmtChocolate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testGetAmtChocolate_1()
		throws Exception {
		int result = r2.getAmtChocolate();

		assertEquals(0, result);
	}
	
	/**
	 * Run the int getAmtCoffee() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testGetAmtCoffee_1()
		throws Exception {
		int result = r2.getAmtCoffee();

		assertEquals(0, result);
	}

	/**
	 * Run the int getAmtMilk() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testGetAmtMilk_1()
		throws Exception {
		int result = r2.getAmtMilk();

		assertEquals(0, result);
	}

	/**
	 * Run the int getAmtSugar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testGetAmtSugar_1()
		throws Exception {
		int result = r2.getAmtSugar();

		assertEquals(0, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		String result = r2.getName();

		assertEquals("", result);
	}

	/**
	 * Run the int getPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testGetPrice_1()
		throws Exception {
		int result = r2.getPrice();

		assertEquals(0, result);
	}

	/**
	 * Run the void setAmtChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testSetAmtChocolate_1()
		throws Exception {
		int amtChocolate = -1;
		r2.setAmtChocolate(amtChocolate);
		int result = r2.getAmtChocolate();
		
		assertEquals(0, result);
	}
	/**
	 * Run the void setAmtChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testSetAmtChocolate_2()
		throws Exception {
		int amtChocolate = 1;
		r2.setAmtChocolate(amtChocolate);
		int result = r2.getAmtChocolate();
		
		assertEquals(1, result);
	}
	/**
	 * Mutation test
	 * @throws Exception
	 * changed conditional boundary
	 */
	@Test
	public void testSetAmtChocolate_3()
		throws Exception {
		int amtChocolate = 0;
		r2.setAmtChocolate(amtChocolate);
		int result = r2.getAmtChocolate();
		
		assertEquals(0, result);
	}

	/**
	 * Run the void setAmtCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testSetAmtCoffee_1()
		throws Exception {
		int amtCoffee = -1;
		r2.setAmtCoffee(amtCoffee); 
		int result = r2.getAmtCoffee();
		
		assertEquals(0, result);
	}
	/**
	 * Run the void setAmtCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testSetAmtCoffee_2()
		throws Exception {
		int amtCoffee = 1;
		r2.setAmtCoffee(amtCoffee); 
		int result = r2.getAmtCoffee();
		
		assertEquals(1, result);
	}
	/**
	 * Mutation test
	 * @throws Exception
	 * changed conditional boundary
	 */
	@Test
	public void testSetAmtCoffee_3()
		throws Exception {
		int amtCoffee = 0;
		r2.setAmtCoffee(amtCoffee); 
		int result = r2.getAmtCoffee();
		
		assertEquals(0, result);
	}

	/**
	 * Run the void setAmtMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testSetAmtMilk_1()
		throws Exception {
		int amtMilk = -1;
		r2.setAmtMilk(amtMilk); 
		int result = r2.getAmtMilk();
		
		assertEquals(0, result);
	}
	/**
	 * Run the void setAmtMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testSetAmtMilk_2()
		throws Exception {
		int amtMilk = 1;
		r2.setAmtMilk(amtMilk); 
		int result = r2.getAmtMilk();
		
		assertEquals(1, result);
	}
	/**
	 * Mutation test
	 * @throws Exception
	 * changed conditional boundary
	 */
	@Test
	public void testSetAmtMilk_3()
		throws Exception {
		int amtMilk = 0;
		r2.setAmtMilk(amtMilk); 
		int result = r2.getAmtMilk();
		
		assertEquals(0, result);
	}
	
	/**
	 * Run the void setAmtSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testSetAmtSugar_1()
		throws Exception {
		int amtSugar = -1;
		r2.setAmtSugar(amtSugar); 
		int result = r2.getAmtSugar();
		
		assertEquals(0, result);
	}
	/**
	 * Run the void setAmtSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testSetAmtSugar_2()
		throws Exception {
		int amtSugar = 1;
		r2.setAmtSugar(amtSugar); 
		int result = r2.getAmtSugar();
		
		assertEquals(1, result);
	}
	/**
	 * Mutation test
	 * @throws Exception
	 * changed conditional boundary
	 */
	@Test
	public void testSetAmtSugar_3()
		throws Exception {
		int amtSugar = 0;
		r2.setAmtSugar(amtSugar); 
		int result = r2.getAmtSugar();
		
		assertEquals(0, result);
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		String name = "name";
		r2.setName(name);

		assertEquals("name", r2.getName());
	}

	/**
	 * Run the void setPrice(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testSetPrice_1()
		throws Exception {
		int price = -1;
		r2.setPrice(price);

		assertEquals(0, r2.getPrice());
	}
	/**
	 * Run the void setPrice(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/14/21, 1:04 PM
	 */
	@Test
	public void testSetPrice_2()
		throws Exception {
		int price = 1;
		r2.setPrice(price);

		assertEquals(1, r2.getPrice());
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
		String result = r2.toString();

		assertEquals("", result);
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
		
		r2 = new Recipe();
		r2.setName("");
		
		recipe = new Recipe();
		recipe.setName("Coffee");
		recipe.setPrice(50);
		recipe.setAmtCoffee(6);
		recipe.setAmtMilk(1);
		recipe.setAmtSugar(1);
		recipe.setAmtChocolate(0);
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
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
		new org.junit.runner.JUnitCore().run(RecipeTest.class);
	}
}