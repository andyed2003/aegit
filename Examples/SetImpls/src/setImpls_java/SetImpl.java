package setImpls_java;

import java.util.HashSet;
import java.util.Iterator;

public class SetImpl<E> extends HashSet<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2638976734931447983L;

	public SetImpl<E> union(SetImpl<E> otherSet) {
		addAll(otherSet);
		return this;
	}

	public SetImpl<E> intersect(SetImpl<E> otherSet) {
		retainAll(otherSet);
		return this;
	}

	public SetImpl<E> subtract(SetImpl<E> otherSet) {
		removeAll(otherSet);
		return this;
	}

	public E getFirst() {
		Iterator<E> iter = iterator();
		return iter.next();
	}

	public SetImpl<E> setUnion(E element) {
		add(element);
		return this;
	}

}
