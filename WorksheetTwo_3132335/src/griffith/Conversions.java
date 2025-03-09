package griffith;

public class Conversions {

	public double euroToDollar(double euro) {
	    return euro * 1.10; // Assume conversion rate is 1.10
	}


	public double dollarToEuro(double dollar) {
	    return dollar * 0.91; // Assume conversion rate is 0.91
	}


	public int stringToInteger(String val) {
	    return Integer.parseInt(val);
	}

	public String integerToString(int val) {
	    return String.valueOf(val);
	}

	public String switchCase(String input) {
	    StringBuilder result = new StringBuilder();
	    
	    for (char c : input.toCharArray()) {
	        if (Character.isUpperCase(c)) {
	            result.append(Character.toLowerCase(c));
	        } else if (Character.isLowerCase(c)) {
	            result.append(Character.toUpperCase(c));
	        } else {
	            result.append(c);
	        }
	    }
	    
	    return result.toString();
	}

}

