public class Arithmetic {
	
	private int numberOne;
	private int numberTwo;
	
	public Arithmetic(int numberOne, int numberTwo) {
		super();
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
	}

	public long calculate(String sinal) {
		Operation operation;
		
		switch (sinal) {
		case "+":
			operation = new Sum();
			break;
                case "-":
			operation = new Subtract();
			break;
                case "*":
			operation = new Multiply();
			break;
                case "/":
			operation = new Divide();
			break;
		default:
			System.out.println("Must inform a operator!");
			operation = new NotInformedOperation();
			break;
		}
		
		return operation.calculate(numberOne, numberTwo);
	}
}
