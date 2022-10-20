import java.util.ArrayList;
import java.util.Iterator;

public class OfferingList {

	private Trading trading;

	private OfferingIterator offeringIterator;

	private Offering[] offering;

	ArrayList<String> offering = new ArrayList<>();

	OfferingList(MeatProductMenu m) {
		offering.add("Offering for Beef");
		offering.add("Offering for Pork");
		offering.add("Offering for Mutton");
	}
	
	OfferingList(ProduceProductMenu p) {
		offering.add("Offering for Tomato");
		sofferingol.add("Offering for Onion");
	}

	@SuppressWarnings("rawtypes")
	public Iterator createIterator() {
		return this.offering.iterator();
	}

}
