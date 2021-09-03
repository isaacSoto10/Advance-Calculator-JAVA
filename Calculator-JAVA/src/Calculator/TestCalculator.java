package Calculator;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator calc = new Calculator(10.3, "+", 9.1, "*", 8.3);
		Calculator calc1 = new Calculator(10.3, "+", 9.1, "-", 9.7);
		Calculator calc2 = new Calculator(10.3, "+", 9.1, "+", 6.2);
		
		calc.performOperation();
		calc1.performOperation();
		calc2.performOperation();
		calc.getResults();
		calc1.getResults();
		calc2.getResults();
	}

}
