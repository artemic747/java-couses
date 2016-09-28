import java.util.Scanner;

public class InteractRunner {
	
	public static void main(String[]args){
		Scanner reader = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			
			//exit - выход из программы
			String exit = "no";
			
			//UseResult - использование результата в дальнейшем вычислении
			String UseResult = "no";
				
				while (!exit.equals("yes")){
                    String first;
			
					// Ввод первого операнда. 
					if(UseResult.equals("yes")){
                        first = String.valueOf(calc.getResult());
						} else{
                        System.out.println("Enter first arg : ");
                        first = reader.next();
						}
                        
					// Ввод оператора. 
					System.out.println("Enter operator");
                    String operator = reader.next();
                        while(!(operator.equals("^") || operator.equals("+") || operator.equals("/")|| operator.equals("-")|| operator.equals("*"))){
                        System.out.println("Enter operator");
                        operator = reader.next();
						}
                    
					//Ввод второго операнда с проверкой деления на ноль.
					System.out.println("Enter second arg : ");
					String second = reader.next();                                        
                        while(second.equals("0") && operator.equals("/")){
                        System.out.println("Division by zero");
                        System.out.println("Enter second arg : ");
                        second = reader.next();
						}
                    	
					/**
					Программа спрашивает выйти или продолжить. Если exit = "no" - использовать ли результат в дальнейшем вычислении. 
					Если UseResult = "yes" ввод первого операнда пропускается и переменной first присваевается значение calc.getResult
					*/
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
					
				//итоговый результат
                System.out.println("Result : " + calc.getResult());
		}finally{
			reader.close();
		}
	}
}