package day11;

class Bank{
	double roi() {
		return 0.0;
	}
}


class ICICI extends Bank{
	@Override
	double roi() {
		return 10.5;
	}
}

class AXIS extends Bank{
	@Override
	double roi() {
		return 11.5;
	}
}

public class OverridingDemo {
	public static void main(String[] args) {
		ICICI ic = new ICICI();
		System.out.println(ic.roi());

		AXIS ax = new AXIS();
		System.out.println(ax.roi());

		Bank bn = new Bank();
		System.out.println(bn.roi());
	}	
}
