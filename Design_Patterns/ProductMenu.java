public interface ProductMenu {

	private Person person;

	public abstract void showMenu();

	public abstract void showAddButton();

	public abstract void showViewButton();

	public abstract void showRadioButton();

	public abstract void showLabels();

	public abstract void showComboxes();

	public abstract void SelectProduct(int UserType);

	public void createProductList() {
		System.out.println("Product List created ...");
	}

	public void AttachProductToUser() {
		System.out.println("User Attached .... ");
	}

	public void productOperation() {
		System.out.println("Operation performed on the Product...");
	}

}
