public class Seller extends Person {

	Seller() {
		super(theProductMenu);
	}

	Seller(ProductMenu theProductMenu) {
		super(theProductMenu);
	}

	@Override
	public void showMenu() {
		System.out.println("Seller Menu items....");
	}

	@Override
	public ProductMenu CreateProductMenu() {
		int offer = 0;
		if (offer == 0) {
			return new MeatProductMenu();
		} else {
			return new ProduceProductMenu();
		}
	}

}
