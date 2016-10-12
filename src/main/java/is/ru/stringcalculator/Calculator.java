package is.ru.stringcalculator;

public class Calculator{
	
	public static int add(String text){	
		if(text.equals("")){
			return 0;
		}

		checkIfNegatives(text);
		
		if(text.contains(",") || text.contains("\n")){
			String [] numbers = text.split(",|\n");
			int sum = 0;
			for (String str : numbers) {
				if(toInt(str) <= 1000){
					sum += toInt(str);
				}
			}
			return sum;
		}

			return toInt(text);
	}

	public static void checkIfNegatives(String text){
		String [] numbers = text.split(",|\n");
		String negatives = "";
		for (String str : numbers) {
			if(toInt(str) < 0){
				negatives += str + ",";
			}
		}
		if(!(negatives == "")){
			throw new IllegalArgumentException("Negatives not allowed: " + negatives);
		}

	}
	public static int toInt(String text){
		return Integer.parseInt(text);
	}
}