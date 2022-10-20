public class ProduceProductMenu implements ProductMenu {

	@Override
	public void showMenu() {
		System.out.println();
	}

	@Override
	public void showAddButton() {
		System.out.println();
	}

	@Override
	public void showRadioButton() {
		System.out.println();
	}

	@Override
	public void showLabels() {
		System.out.println();
	}

	@Override
	public void showViewButton() {
		System.out.println();
	}

	@Override
	public void showComboxes() {
		System.out.println();
	}

	public void selectCourse(int UserType) {
		System.out.println("Produce Product Menu Selected ...\n Bridge Pattern for connection used ");
		Person person;
		if (UserType == 0) {
			person = PersonFactory.createObject("Buyer");

		} else
		{
			person = PersonFactory.createObject("Seller");

		}
		person.ShowMenu();
	}

}
