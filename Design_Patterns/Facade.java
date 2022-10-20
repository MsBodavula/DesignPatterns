public class Facade {

	private int userType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	public void startFacade() {
		System.out.println("Facade pattern initiated ");
		UserType = login() ? 1:0;
		System.out.println("Select from available Product Menu \n 1. Meat Product Menu \n 2. Produce Product Menu ");
		Scanner scan = new Scanner(System.in);
		selectedProduct = scan.nextLine();
		if (theSelecteCourse.equalsIgnoreCase("Meat Product Menu")) {
			SelectProduct(new MeatProductMenu(), UserType);
		} else if (theSelecteCourse.equalsIgnoreCase("Low Level Course Menu")) {
			SelectProduct(new LowLevelCourseMenu(), UserType);
		} else {
			System.out.println("Wrong Selection");
			System.exit(-1);
		}
		System.out.println("Implementing Visitor Pattern....");
		remind();
		System.out.println("Implementing Iterator pattern ....");
		Product productList = new Product();
		@SuppressWarnings("rawtypes")
		Iterator iterate = (Iterator) productList.createIterator();
		ProductIterator productIterator = new ProductIterator();
		OfferingList offeringList = new OfferingList();
		@SuppressWarnings("rawtypes")
		Iterator iterate2 = (Iterator) offeringList.createIterator();
		OfferingIterator oi = new OfferingIterator();
		while (productIterator.HasNext(iterate)) {
			System.out.println(productIterator.Next(iterate));
			System.out.println(oi.Next(iterate2));
		}
		scan.close();
		
	}

	public boolean login() {
		System.out.println("Enter Username ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String username = scan.next();
		System.out.println("Enter Password ");
		String password = scan.next();
		userType = validation(username, password);
		return (userType > 0);
	}

	public int validation(String username, String password) {
		if ((username.equalsIgnoreCase("tutu")) && (password.equalsIgnoreCase("1111"))) {
			System.out.println("Welcome Tutu ");
			userType = 0;
		}
		else if ((username.equalsIgnoreCase("mimi")) && (password.equalsIgnoreCase("2222"))) {
			System.out.println("Welcome mimi ");
			userType = 0;
		}
		else if ((username.equalsIgnoreCase("nana")) && (password.equalsIgnoreCase("3333"))) {
			System.out.println("Welcome mimi ");
			userType = 0;
		}
		else if ((username.equalsIgnoreCase("pepe")) && (password.equalsIgnoreCase("3333"))) {
			System.out.println("Welcome pepe ");
			userType = 1;
		}
		else {
			System.out.println("Invalid User ");
			System.exit(-1);
		}

		return userType;
	}

	public void addTrading(Trading t) {
		t.addTrading();
	}

	public void viewTrading(Trading t) {
		t.viewTrading();
	}

	public void decideBidding(Offering o) {
		o.decideBidding();
	}

	public void discussBidding(Offering o) {
		o.discussBidding();
	}

	public void submitBidding(Offering o) {
		o.submitBidding();
	}

	public void remind() {
		ReminderVisitor remind = new ReminderVisitor();
		Product p = new Product();
		p.accept(remind);

	}

	public void createUser(UserInfoItem userinfoitem) {
		userinfoitem.createUSer();
	}

	public void createProductList(ProductMenu prodMenu) {
		prodMenu.createProductList();
	}

	public void AttachProductToUser(ProductMenu prodMenu) {
		prodMenu.AttachProductToUser();
	}

	public void SelectProduct(ProductMenu prodMenu, int userType) {
		prodMenu.SelectProduct(userType);
	}

	public void productOperation(ProductMenu prodMenu) {
		prodMenu.productOperation();
	}

}
