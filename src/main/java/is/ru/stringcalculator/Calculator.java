package is.ru.stringcalculator;

public class Calculator{
	
	public static int add(String text){

		if(text.equals("")){
			return 0;
		}
		else if(text.contains(",")){
				String [] numbers = text.split(",");

			if(toInt(numbers[0]) >= 1000 || toInt(numbers[1]) >= 1000){
				if(toInt(numbers[1]) >= 1000 && !(toInt(numbers[0]) >= 1000)){
					return toInt(numbers[0]);
				}
				else if( !(toInt(numbers[1]) >= 1000) && toInt(numbers[0]) >= 1000){
					return toInt(numbers[1]);
				}
				return 0;
			}
			int sum = 0;
			for (String str : numbers) {
				sum += toInt(str);
			}
			return sum;
		}
		else {
			return toInt(text);
		}
	}

	public static int toInt(String text){
		return Integer.parseInt(text);
	}
}