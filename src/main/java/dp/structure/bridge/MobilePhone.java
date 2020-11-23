package dp.structure.bridge;

public class MobilePhone extends Computer {

	public MobilePhone(Brand brand) {
		super(brand);
	}

	@Override
	public void sale() {
		System.out.println("===========================");
		System.out.println("销售：手机");
		super.sale();
		System.out.println("===========================");
	}
}
