package setImpls_java;

import java.util.HashSet;

public class SetImpl<E> extends HashSet<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2638976734931447983L;

	public SetImpl<E> union(SetImpl<E> otherSet) {
		addAll(otherSet);
		return this;
	}

	public SetImpl<E> setIntersect(SetImpl<E> otherSet) {
		retainAll(otherSet);
		return this;
	}

}
