package edu.towson.cis.cosc442.project4.coffeemaker;



/**
 * The class <code>RecipeFactory</code> implements static methods that return instances of the class <code>{@link Recipe}</code>.
 *
 * @generatedBy CodePro at 3/14/21, 1:15 PM
 * @author flute
 * @version $Revision: 1.0 $
 */
public class RecipeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 3/14/21, 1:15 PM
	 */
	private RecipeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Recipe}</code>.
	 *
	 * @generatedBy CodePro at 3/14/21, 1:15 PM
	 */
	public static Recipe createRecipe() {
		return new Recipe();
	}
}