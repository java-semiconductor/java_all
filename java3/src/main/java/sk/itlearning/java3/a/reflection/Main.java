package sk.itlearning.java3.a.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {

		String conf = "sk.itlearning.java3.a.reflection.VypocetA";
		
		while (true) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			
			try {
				Class<?> clazz = Class.forName(conf);
				Constructor<?> constructor = clazz.getConstructor(int.class);
				Vypocet v = (Vypocet) constructor.newInstance(50);
				Method m = clazz.getMethod("vypocitaj");
				System.out.println(m.invoke(v));
			} catch (ClassNotFoundException e) {
				e.printStackTrace();				
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		
	}

}
