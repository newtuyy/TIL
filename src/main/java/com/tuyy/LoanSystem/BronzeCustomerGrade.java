package com.tuyy.LoanSystem;

public class BronzeCustomerGrade implements CustomerGrade {
	
	private static final int MIN_POSSIBLE_LOAN_MONEY = 0;
	private static final int MAX_POSSIBLE_LOAN_MONEY = 200;
	
	@Override
	public boolean isPossibleLoan(int money) {
		if (money <= MIN_POSSIBLE_LOAN_MONEY || money > MAX_POSSIBLE_LOAN_MONEY) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public CustomerGrade getPreviousGrade() {
		return this;
	}
}
