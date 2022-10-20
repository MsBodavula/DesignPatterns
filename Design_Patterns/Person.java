public class Person {

	private ProductMenu productMenu;

	public abstract void showMenu();

	public abstract ProductMenu CreateProductMenu();

	@SuppressWarnings("static-access")
	Person(ProductMenu productMenu) {
		this.productMenu = productMenu;
	}

	public void showAddButton() {
		productMenu.showAddButton();
	}

	public void showViewButton() {
		productMenu.showViewButton();
	}

	public void showRadioButton() {
		productMenu.showRadioButton();

	}

	public void showLabels() {
		productMenu.showLabels();
	}

}
