package Project5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Stephanie Prem
 *
 */
public class JamesBond 
{
	public Boolean bondRegex (String input)
	{
		
		Pattern p = Pattern.compile(".*(\\().*(\\b0\\s0\\s7\\b).*(\\)).*");
	    Matcher m = p.matcher(input);   
	    return m.find(); 
	     
	}

}
