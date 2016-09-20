public class Calculator {
	private int result;
	public void add(int params, int params2, String operator){
			if(operator.equals("+")){this.result = params + params2;}
			else if(operator.equals("-")){this.result = params - params2;} 
			else if(operator.equals("*")){this.result = params * params2;} 
			else if(operator.equals("/")){this.result = params / params2;}
			else if(operator.equals("^")){this.result = (int) Math.pow(params, params2);}
				
			}
	
	public int getResult(){
		return this.result;
	}
	
	public void clearResult(){
		this.result = 0;
	}
}