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
 * the unit test Class for VendingMachine *
 */
public class VendingMachineTest {
	/** Declaring necessary test objects for {@link VendingMachine}*/
	VendingMachine ven1, ven2; 
	VendingMachineItem item1, item2;
	
	/**
	 * Initializes the necessary test objects for the test cases to use.
	 * @throws java.lang.Exception
	 */
	// The amount of money in the vending machine currently
		protected double balance;
	@Before
	public void setUp() throws Exception {
		ven1 = new VendingMachine();
		ven2 = new VendingMachine();
		item1 = new VendingMachineItem("chips", 3.00); //matches venItem1 in VendingMachineItemTest.java
		item2 = new VendingMachineItem("candy", 2.50);//matches venItem2 in VendingMachineItemTest.java
		
	}

	/**
	 * Cleans up test objects after a test case is executed.
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		ven1 = null;
		ven2 = null;
		item1 = null;
		item2 = null;
		balance = 0;
	}

	/**
	 * Precondition: The slot specified by the code must be empty
	 * Postcondition: The item is now at the slot specified by the code
	 * Test for the addItem() method
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachine#addItem(edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineItem, java.lang.String)}.
	 */
	@Test
	public void testAddItem() {
		// should add chips for $3.00 in slot A in ven1
		ven1.addItem(item1, "A");
	
		//this should add the item properly 
		assertEquals(ven1.getItem("A"), item1 );
		
		//this should add the item properly 
		ven2.addItem(item2, "C");
		assertEquals(ven2.getItem("C"), item2 );
	}
	/** 
	 *Test for the addItem() method of the {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachine#addItem(edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineItem, java.lang.String)} class.
	 *This test should fail and throw the exception
	 *
	 *The code of where this item should be in the vending machine
	 * @throws VendingMachineException under the following conditions:
	 * 1. If you add an item to a slot that is already occupied. 
	 */
	@Test (expected = VendingMachineException.class)
	public void testAddItem_bad(){		
		ven2.addItem(item2, "C");
		ven2.addItem(item2, "C");
		//adding an item in a slot that is full in ven2
		assertEquals("candy", 2.50, ven2.getItem("C"));
	}
	/** 
	 *Test for the addItem() method of the {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachine#addItem(edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineItem, java.lang.String)} class.
	 *This test should fail and throw the exception
	 *
	 *The code of where this item should be in the vending machine
	 * @throws VendingMachineException under the following conditions:
	 * 2. If you add an item with an invalid code
	 */
	@Test(expected = VendingMachineException.class)
	public void testAddItem_bad2(){	
		// should try to add item2 in a slot that is invalid throwing the exception 
		ven2.addItem(item2, "Z");
		assertEquals(item2, ven2.getItem("Z"));
	}
	

	/**
	 * Postcondition: If the code slot is not empty, the item in that slot is removed.
	 * Test for the removeItem() method
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachine#removeItem(java.lang.String)}.
	 */
	@Test
	public void testRemoveItem() {
		ven1.addItem(item1, "A");//need to add item to remove
		ven1.removeItem("A");// should remove chips for $3.00 in slot A in ven1
		
		// expected removes item1 in slot A that has chips for $3.00
		//test oracle actual value = expected value
		assertEquals(ven1.getItem("A"), null);
	}
	/**
	 * Test for the removeItem() method of the {@link VendingMachine} class.
	 *This test should fail and throw the exception
	 * @throws VendingMachineException If the slot at the specified code is empty 
	 */
	@Test(expected = VendingMachineException.class)
	public void testRemoveItem_bad(){		
		ven2.removeItem("B"); // should remove an item from a slot that is already empty
		
		assertEquals(ven2.getItem("B"), null);
	}
	/**
	 * Test for the removeItem() method of the {@link VendingMachine} class.
	 *This test should fail and throw the exception
	 * @throws VendingMachineException 
	 * if the code is invalid
	 */
	@Test(expected = VendingMachineException.class)
	public void testRemoveItem_bad2(){	
		ven2.addItem(item2, "Z");//try to add an item to an invalid spot
		ven2.removeItem("Z");//should try to remove an item from from a slot that is invalid
		
		assertEquals(ven2.getItem("Z"), "Z");
	}
	

	/**
	 * Precondition: amount >= 0
	 * Postcondition: balance is now the previous balance + amount.
	 * Test for the insertMoney()
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachine#insertMoney(double)}.
	 */
	@Test
	public void testInsertMoney() {
		ven1.insertMoney(3.00);//to pay for the chips in slot A
		
		//the balance in ven1 expected to be $3.00
		//test oracle actual value = expected value
		assertEquals(ven1.getBalance(), 3.00, 0);		
	}
	/**
	 * Precondition: amount >= 0
	 * Postcondition: balance is now the previous balance + amount.
	 * Test for the insertMoney()
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachine#insertMoney(double)}.
	 */
	@Test
	public void testInsertMoney2() {
		ven1.insertMoney(3.00);
		ven1.insertMoney(3.00);//adding more money to see if the balance is added

		//the balance in ven1 expected to be $6.00
		//test oracle actual value = expected value
		assertEquals(ven1.getBalance(), 6.00, 0);
	}
	/** 
	 *Test for the insertMoney() method of the {@link VendingMachine} class.
	 *This test should fail and throw the exception
	 * @throws VendingMachineException Throws a VendingMachineException if the amount is < 0
	*/
	@Test(expected = VendingMachineException.class)
	public void testInsertMoney_bad() {
		ven2.insertMoney(-3.00);//entering an amount < 0
		
		//the balance in ven1 expected to be -$3.00 throwing the exception
		assertEquals(ven2.getBalance(), -3.00, 0);
	}
	/** 
	 *Test for the insertMoney() method of the {@link VendingMachine} class.
	 *This test should fail and throw the exception
	 * @throws VendingMachineException Throws a VendingMachineException if the amount is = 0
	*/
	@Test(expected = VendingMachineException.class)
	public void testInsertMoney_bad2() {
		ven2.insertMoney(0.00);//entering an amount = 0
		
		//the balance in ven1 expected to be $0.00 throwing the exception
		assertEquals(ven2.getBalance(), 0.00, 0);
	}
	

	/**
	 * Test for the getBalance() method 
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachine#getBalance()}.
	 *Precondition: balance >= 0; Note that the vending machine should start with a 0 balance.
	 */
	@Test
	public void testGetBalance() {
		assertEquals(ven1.getBalance(), 0, 0);//should start with a balance of zero
	}
	/**
	 * Test for the getBalance() method 
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachine#getBalance()}.
	 *Postcondition: the balance is >= 0 
	 */
	@Test
	public void testGetBalance2() {
		ven1.insertMoney(3.00);
		
		//the balance in ven1 expected to be $3.00 (>=0)
		//test oracle actual value = expected value
		assertEquals(ven1.getBalance(), 3.00, 0);
	}
	/**
	 * Test for the getBalance() method 
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachine#getBalance()}.
	 *Postcondition: remains the same as it was before the function was called.
	 */
	@Test
	public void testGetBalance3() {
		assertEquals(ven1.balance, ven1.balance, 0);
	}
	/** 
	 *Test for the getBalance() method of the {@link VendingMachine} class.
	 * This test should fail and throw the exception
	 * Postcondition: the balance is >= 0 
	*/
	@Test(expected = VendingMachineException.class)
	public void testGetBalance_bad() {
		
		ven2.balance = -3.00;
		//the balance in ven2 expected to be -$3.00 throwing the exception (< 0)
		assertEquals(ven2.getBalance(), 0, -3.00);
	}

	/**
	 * Precondition: balance >= 0
	 * Postcondition: The amount of the item is subtracted from the balance
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachine#makePurchase(java.lang.String)}.
	 * @return Returns true if there is enough money to make the purchase.
	 */
	@Test
	public void testMakePurchase() {
		ven1.addItem(item1, "A");
		ven1.insertMoney(3.00);//to pay for the chips in slot A
		//test oracle actual value = expected value
		assertEquals(ven1.makePurchase("A"), true);//there will be enough money to pay for the $3.00 chips
	}
	/**
	 * Precondition: balance >= 0
	 * Postcondition: The amount of the item is subtracted from the balance
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachine#makePurchase(java.lang.String)}.
	 * @return Returns true if there is enough money to make the purchase.
	 */
	@Test
	public void testMakePurchase2() {
		ven1.addItem(item1, "A");
		ven1.insertMoney(3.00);//to pay for the chips in slot A
		ven1.makePurchase("A");//make the purchase 
		assertEquals(ven1.getBalance(), 0, 0);//the balance will be zero once the chips are purchased 
	}

	/** 
	 *Test for the makePurchase() method of the {@link VendingMachine} class.
	 * This test should fail and throw the exception
	 * @return Also returns false if the code is for an empty slot.
	*/
	@Test(expected = VendingMachineException.class)
	public void testMakePurchase_bad3() {
		ven2.addItem(item2, "C"); //add item in slot C
		ven2.insertMoney(2.50); //add enough money to pay for candy in the slot
		assertEquals(true, ven2.makePurchase("Z"));//this slot is invalid 
	}
	

	/**
	 * Test for the returnChange() method
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachine#returnChange()}.
	 * fulfills the pre and post conditions 
	 * Precondition: balance >= 0
	 * Postcondition: balance = 0
	 */
	@Test
	public void testReturnChange() {
		//the change in ven1 expected to be 0 because nothing was entered
		assertEquals(ven1.returnChange(), 0, 0);
	}
	/**
	 * Test for the returnChange() method
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachine#returnChange()}.
	 * fulfills the pre and post conditions 
	 * Precondition: balance >= 0
	 * Postcondition: balance = 0
	 */
	@Test
	public void testReturnChange2() {
		ven1.addItem(item1, "A");
		ven1.insertMoney(3.00);//to pay for the chips in slot A
		ven1.makePurchase("A");//make the purchase
		
		//the change in ven1 expected to be $0.00 because $3 were entered and were used
		assertEquals(ven1.returnChange(), 0, 0);
	}
	/**
	 * Test for the returnChange() method
	 * Test method for {@link edu.towson.cis.cosc442.project3.vendingmachine.VendingMachine#returnChange()}.
	 * fulfills the pre and post conditions 
	 * Precondition: balance >= 0
	 * Postcondition: balance = 0
	 */
	@Test
	public void testReturnChange3() {
		ven1.addItem(item1, "A");
		ven1.insertMoney(4.00);//to pay for the chips in slot A
		ven1.makePurchase("A");//make the purchase
		
		//the change in ven1 expected to be $1.00 because $4 were entered and $3 were used
		assertEquals(ven1.returnChange(), 1.00, 0);
	}
	/** 
	 *Test for the returnChange() method of the {@link VendingMachine} class.
	 * This test should fail and throw the exception
	 * does not fulfill Precondition: balance >= 0
	*/
	@Test(expected = VendingMachineException.class)
	public void testReturnChange_bad() {
		ven2.addItem(item2, "A");
		ven2.insertMoney(-3.00); //<0
		ven2.makePurchase("A");//make the purchase
		assertEquals(ven2.returnChange(), -3.00, 0); //this will fail because the starting balance is < 0
	}
	/**
	 * Tests is the item is returned
	 */
	@Test
	public void testGetItem() {
		ven1.addItem(item1, "D");
		assertEquals(ven1.getItem("D"), item1);
	}
	/**
	 * Tests is the item is out of slot index
	 */
	@Test(expected = VendingMachineException.class)
	public void testGetItem_bad() {
		ven2.addItem(item2, "Z");
		assertEquals(ven2.getItem("Z"), item2);
	}
	/**
	 * Tests is the item is out of slot index
	 */
	@Test(expected = VendingMachineException.class)
	public void testGetItem_bad2() {
		ven2.addItem(item2, "-1");
		assertEquals(ven2.getItem("-1"), item2);
	}
}
