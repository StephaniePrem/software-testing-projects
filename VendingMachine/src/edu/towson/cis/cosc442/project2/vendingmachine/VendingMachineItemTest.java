/**
 * 
 */
package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Stephanie Prem
 * The unit test Class for VendingMachineItem. *
 */
public class VendingMachineItemTest {

	/** Declaring necessary test objects for {@link VendingMachineItem} */
	VendingMachineItem venItem1, venItem2, venItem3; 
	
	/**
	 * Initializes the necessary test objects for the test cases to use.
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		venItem1 = new VendingMachineItem("chips", 3.00); 
		venItem2 = new VendingMachineItem("candy", 2.50); 
		venItem3 = new VendingMachineItem("gum", 1.00); 
		
	}

	/**
	 * Cleans up test objects after a test case is executed.
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		venItem1 = null;
		venItem2 = null;
		venItem3 = null;
	}

	/**
	 * Precondition: price argument >= 0
	 * Postcondition:  The name and price of the item is set to be the values in the arguments
	 * Test for the VendingMachineItem(String name, double price) 
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineItem#VendingMachineItem(java.lang.String, double)}.
	 */
	@Test
	public void testVendingMachineItem() {
		//test oracle actual value = expected value
		assertEquals("gum", venItem3.getName());//tests if the name is correct
	}
	/**
	 * Precondition: price argument >= 0
	 * Postcondition:  The name and price of the item is set to be the values in the arguments
	 * Test for the VendingMachineItem(String name, double price) 
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineItem#VendingMachineItem(java.lang.String, double)}.
	 */
	@Test
	public void testVendingMachineItem2() {
		//test oracle actual value = expected value
		assertEquals(1.00, venItem3.getPrice(), 0);//tests if the price is correct and >= 0
	}
	/**
	 * Test for the VendingMachineItem(String name, double price) method of the {@link VendingMachineItem} class.
	 * @throws VendingMachineException Thrown if price is less than zero
	 */
	@Test(expected = VendingMachineException.class)
	public void testVendingMachineItem_bad() {
		VendingMachineItem venItem4 = new VendingMachineItem("cheetos", -1.00); //this should fail
		assertEquals(-1.00, venItem4.getPrice(), 0);//this will fail because the price is <= 0
	}



	/**
	 * Postcondition: the actual name of the item is returned
	 *  Test for the getName()
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineItem#getName()}.
	 */
	@Test
	public void testGetName() {
		//test oracle actual value = expected value
		assertEquals("chips", venItem1.getName()); //should be correct and name should be "chips"
	}


	/**
	 * Test for the getPrice() method
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineItem#getPrice()}.
	 */
	@Test 
	public void testGetPrice() {
		//test oracle actual value = expected value
		assertEquals(3.00, venItem1.getPrice(), 0); //should be correct price return
	}
}
