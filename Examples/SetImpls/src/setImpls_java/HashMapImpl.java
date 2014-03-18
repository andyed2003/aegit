package setImpls_java;

import java.util.HashMap;

public class HashMapImpl<T1, T2> extends HashMap<T1, T2> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2574148088713407819L;

	// like the HashMap's put; but returns the updated function map instead of
	//  the previous value of 'value'.
	public HashMapImpl<T1, T2> put2(T1 d,T2 r){
		put(d,r);
		return this;
	}
}
