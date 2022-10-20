public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	private ClassProductList classProductList;

	public void visitProduct(Product product) {
		System.out.println("visiting Product ...."+product);
	}

	public void visitTrading(Trading trading) {
		System.out.println("visiting trading ...."+trading);
	}

	public void visitFacade(Facade facade) {
		System.out.println("visiting Facade ....");
	}

}
