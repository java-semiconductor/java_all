package sk.itlearning.java2.a.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

	public static void main(String[] args) {

		Connection connection;
		Statement stmt;
		ResultSet rs2;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql:zakaznik","postgres", "sa");
			stmt = connection.createStatement();
			rs2 = stmt.executeQuery("select * from public.zakaznik");
			while (rs2.next()) {
				Obcan o = new Obcan("11", rs2.getString("name"));
				System.out.println(o);
			}
		} catch (SQLException e) {
			System.out.println("Nepodarilo sa pripojit na databazu");
		}
		
		// chyba finally statement

	}

}
