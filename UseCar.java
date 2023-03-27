package com.day11.oops2;

public class UseCar {
	public static void main(String[] args) {
		Car c1=new Car("BMW",1200000,"Black",true);
		Car c2=new Car("KIA",7000000,"White",false);
		Car c3=new Car("Honda",5000000,"Red",false);
		Car c4=new Car("Toyata",8000000,"Yellow",true);
		Car c5=new Car("Benz",18000000,"White",true);
		Car[] cars= {c1,c2,c3,c4,c5};
		int max=cars[0].price;
		Car a=null;
		for(Car x: cars) {
			if(x.price>=max) {
				max=x.price;
				a=x;
			}
		}
	System.out.println(a.brand+" "+ a.color+" " +a.price+" " +a.isAutomatic);
	System.out.println("");
	}

}
