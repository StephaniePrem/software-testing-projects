package edu.towson.cis.cosc442.project4.coffeemaker;



/**
 * The class <code>InventoryFactory</code> implements static methods that return instances of the class <code>{@link Inventory}</code>.
 *
 * @generatedBy CodePro at 3/14/21, 1:15 PM
 * @author flute
 * @version $Revision: 1.0 $
 */
public class InventoryFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 3/14/21, 1:15 PM
	 */
	private InventoryFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Inventory}</code>.
	 *
	 * @generatedBy CodePro at 3/14/21, 1:15 PM
	 */
	public static Inventory createInventory() {
		return new Inventory();
	}
}