public class ReminderVisitor extends NodeVisitor {

	public Reminder visitProduct(Product product) {
		System.out.println("visiting Product ....");
		return product;
	}

	public Reminder visitTrading(Trading trading) {
		System.out.println("visiting trading ....");
		return trading;
	}

	public void visitFacade(Facade facade) {
		System.out.println("visiting Facade ....");
	}

}
