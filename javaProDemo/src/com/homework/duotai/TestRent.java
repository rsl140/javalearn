package com.homework.duotai;
//上机3、4
public class TestRent {
	public static void main(String[] args) {
		Customer test = new Customer();
		MotoVehicle[] motos = new MotoVehicle[5];
		motos[0] = new Car("京NY28588","宝马");
		motos[1] = new Car("京NNN3284","宝马");
		motos[2] = new Car("京NT43765","别克");
		motos[3] = new Bus("京5643765","金龙");
		motos[4] = new Truck("京GD78124","解放");
		
		System.out.println("租5天得价格为：" + test.calcToteRent(motos, 5));;
		
	}
	
}
