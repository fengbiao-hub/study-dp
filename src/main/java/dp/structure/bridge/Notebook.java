package dp.structure.bridge;

public class Notebook extends Computer {

	public Notebook(Brand brand) {
		super(brand);
	}

	@Override
	public void sale() {
		System.out.println("===========================");
		System.out.println("销售：笔记本电脑");
		super.sale();
		System.out.println("===========================");
	}

}