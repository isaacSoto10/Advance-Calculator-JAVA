package Calculator;

public class Calculator {
	private Double operandOne = 0.0;
	private Double operandTwo = 0.0;
	private Double operantThree = 0.0;
	private Double mathTotal = 0.0;
	private String operation = "";
	private String operation2 = "";
	
	
	public Calculator() {
	}
	public Calculator(Double operandOne, String operation, Double operandTwo, String operation2, Double operantThree) {
		this.setOperandOne(operandOne);
		this.setOperandTwo(operandTwo);
		this.setOperation(operation);
		this.setOperation2(operation2);
		this.setOperandTwo(operantThree);
	}
	public Double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(Double operandOne) {
		this.operandOne = operandOne;
	}
	public Double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(Double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public Double getMathTotal() {
		return mathTotal;
	}
	public void setMathTotal(Double mathTotal) {
		this.mathTotal = mathTotal;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public void performOperation() {
		if(getOperation().equals("+")) {
			if(getOperation2().equals("+")) {
				Double total = getOperandOne() + getOperandTwo() + getOperantThree();
				setMathTotal(total);
			}
			else if(getOperation2().equals("-")) {
				Double total = getOperandOne() + getOperandTwo() - getOperantThree();
				setMathTotal(total);
			}
			else if(getOperation2().equals("*")) {
				Double total = getOperandOne() + getOperandTwo() * getOperantThree();
				setMathTotal(total);
			}

		}
		
		else if(getOperation().equals("-")) {
			if(getOperation2().equals("+")) {
				Double total = getOperandOne() + getOperandTwo() + getOperantThree();
				setMathTotal(total);
			}
			else if(getOperation2().equals("-")) {
				Double total = getOperandOne() + getOperandTwo() - getOperantThree();
				setMathTotal(total);
			}
			else if(getOperation2().equals("*")) {
				Double total = getOperandOne() + getOperandTwo() * getOperantThree();
				setMathTotal(total);
			}
		}
		
		else if(getOperation().equals("*")) {
			if(getOperation2().equals("+")) {
				Double total = getOperandOne() + getOperandTwo() + getOperantThree();
				setMathTotal(total);
			}
			else if(getOperation2().equals("-")) {
				Double total = getOperandOne() + getOperandTwo() - getOperantThree();
				setMathTotal(total);
			}
			else if(getOperation2().equals("*")) {
				Double total = getOperandOne() + getOperandTwo() * getOperantThree();
				setMathTotal(total);
			}
		}
	
	}
	public void getResults() {
		System.out.println(getMathTotal());
		}
	public String getOperation2() {
		return operation2;
	}
	public void setOperation2(String operation2) {
		this.operation2 = operation2;
	}
	public Double getOperantThree() {
		return operantThree;
	}
	public void setOperantThree(Double operantThree) {
		this.operantThree = operantThree;
	}

}
