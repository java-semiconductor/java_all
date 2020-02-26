package sk.itlearning.java3.d.generics;

import java.util.List;

class G0_Adder {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void add(List list) {
		list.add(Integer.valueOf(10));
		list.add(Boolean.TRUE);
	}
	
}