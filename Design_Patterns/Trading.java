public class Trading extends Reminder {

	private Product product;

	private OfferingList offeringList;
	
	public void accept(NodeVisitor nodeVisitor) {
		System.out.println("Assignment Reminder ...");
		return nodeVisitor.visitAssignment(this);
	}
	public void addTrading() {
		System.out.println("Add Trading ....");
	}

	public void viewTrading() {
		System.out.println("View Trading ....");
	}
}
