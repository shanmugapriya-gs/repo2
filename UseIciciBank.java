package com.day11.oops2;

public class UseIciciBank {
	public static void main(String[] args) {
		IciciBank i=new IciciBank();
		i.isInternational=true;
		i.branch="Perambur";
		i.isSaving=true;
		System.out.println(i.getLoanIntrestAmount(255450));
	}

}
