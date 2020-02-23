package sk.itlearning.java4.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import sk.itlearning.java4.a.xml.CatalogLoader;
import sk.itlearning.java4.book.Book;
import sk.itlearning.java4.book.Catalog;

public class MainController {
	
	Catalog catalog;
	
	ObservableList<Book> data;
	
	@FXML
	TableView<Book> xmlDataTable;
	
	@FXML
	TableColumn<Book, String> c1;

	@FXML
	TableColumn<Book, String> c2;
	
	@FXML
	public void updateTable() {
		catalog = CatalogLoader.getFullCatagalog(CatalogLoader.class.getResourceAsStream("book.xml"));
		data = FXCollections.observableArrayList(catalog.getBook());	
		xmlDataTable.setItems(data);
		c1.setCellValueFactory(data -> Bindings.createStringBinding(() -> data.getValue().getAuthor()));
		c1.setCellValueFactory(data -> Bindings.createStringBinding(() -> data.getValue().getTitle()));
	}

	public void remove() {
		Book b = xmlDataTable.getSelectionModel().getSelectedItem();
		data.remove(b);
	}
	
	public void save() throws FileNotFoundException {
		catalog.getBook().clear();
		catalog.getBook().addAll(data);
		CatalogLoader.saveCatagalog(catalog, new FileOutputStream(new File("book.xml")));
	}

}
