package kr.ac.hansung.model;

public class Credit_division {
	String division;
	int credit_sum;
	
	public Credit_division(){
		
	}

	public Credit_division(String division, int credit_sum) {
		this.division = division;
		this.credit_sum = credit_sum;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public int getCredit_sum() {
		return credit_sum;
	}

	public void setCredit_sum(int credit_sum) {
		this.credit_sum = credit_sum;
	}

	@Override
	public String toString() {
		return "[" + division + "]" + " " + credit_sum;
	}
	
}
