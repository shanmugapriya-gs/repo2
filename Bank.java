package com.day11.oops2;

public class Bank extends ReserveBank{
	String branch;
	public String getLoanIntrestAmount(int principalAmount) {
		return "Intrest Amount is " + (principalAmount*10/100);
}
}
