import java.util.Scanner;

public class InteractRunner {
	
	public static void main(String[]args){
		Scanner reader = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
				String exit = "no";
				String UseResult = "no";
				while (!exit.equals("yes")){
                    String first;
                    if(UseResult.equals("yes")){
                        first = String.valueOf(calc.getResult());
                        System.out.println(first);
						} else{
                        System.out.println("Enter first arg : ");
                        first = reader.next();
						}
                        
                        System.out.println("Enter operator");
                        String operator = reader.next();
                            while(!(operator.equals("^") || operator.equals("+") || operator.equals("/")|| operator.equals("-")|| operator.equals("*"))){
                            System.out.println("Enter operator");
                            operator = reader.next();
							}
                    
							System.out.println("Enter second arg : ");
							String second = reader.next();                                        
                            while(second.equals("0") && operator.equals("/")){
                            System.out.println("Division by zero");
                            System.out.println("Enter second arg : ");
                            second = reader.next();
							}
                    	
							System.out.println("Exit : yes/no ");
							exit = reader.next();

                            if(exit.equals("no")){
                            calc.add(Integer.valueOf(first), Integer.valueOf(second), operator);
                            System.out.println("Use result : yes/no ");
                            UseResult = reader.next();
                            } 
							else { 
							calc.add(Integer.valueOf(first), Integer.valueOf(second), operator);
							}
						}
                System.out.println("Result : " + calc.getResult());
		}finally{
			reader.close();
		}
	}
}