public class Buyer extends Person {

	Buyer() {
		super(theProductMenu);
	}

	Buyer(ProductMenu theProductMenu) {
		super(theProductMenu);
	}


	@Override
	public void showMenu() {
		System.out.println("Buyer Menu items....");
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
