import java.util.Iterator;

public class OfferingIterator extends ListIterator {

	private OfferingList offeringList;  //Because the relation may not be correct

	@SuppressWarnings("rawtypes")
	@Override
	public boolean hasNext(Iterator iterator) {
		return iterator.hasNext();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void MoveToHead(Iterator iterator) {
		System.out.println("Head Moved ");
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Offering Next(Iterator iterator) {
		if (this.HasNext(iterator)) {
			return iterator.next();
		} else {
			return null;
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void Remove(Iterator iterator) {
		if (this.HasNext(iterator)) {
			iterator.next();
		}

	}

}
