package sk.itlearning.java3.d.generics;

import java.util.List;

class G0_Adder {
	
	@SuppressWarnings({ "rawtypes", "deprecation", "unchecked" })
	public void add(List list) {
		list.add(new Integer(50));
		list.add(new Boolean(true));
	}
	
}