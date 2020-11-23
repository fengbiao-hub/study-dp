package dp.structure.bridge;

public class Desktop extends Computer {

	public Desktop(Brand brand) {
		super(brand);
	}

	@Override
	public void sale() {
		System.out.println("===========================");
		System.out.println("销售：台式机");
		super.sale();
		System.out.println("===========================");
	}
}