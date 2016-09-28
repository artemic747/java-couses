public class Calculator {
	private double result;
	
		//Метод проводит математические операции 
	public void add(double params, double params2, String operator){
			if(operator.equals("+")){this.result = params + params2;}
			else if(operator.equals("-")){this.result = params - params2;} 
			else if(operator.equals("*")){this.result = params * params2;} 
			else if(operator.equals("/")){this.result = params / params2;}
			else if(operator.equals("^")){this.result = (int) Math.pow(params, params2);}
				
			}
	//Метод возвращает результат 
	public double getResult(){
		return this.result;
	}
	
	//Метод очищает результат
	public void clearResult(){
		this.result = 0;
	}
}