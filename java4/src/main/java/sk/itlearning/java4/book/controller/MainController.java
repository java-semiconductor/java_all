package sk.itlearning.java4.book.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import sk.itlearning.java4.book.model.Book;
import sk.itlearning.java4.book.model.Catalog;

public class MainController {
	
	Catalog catalog;
	
	ObservableList<Book> data;
	
	TableView<Book> xmlDataTable;
	
	TableColumn<Book, String> c1;

	TableColumn<Book, String> c2;
	
	public void updateTable() {
		catalog = XmlCatalogLoader.getFullCatagalog(XmlCatalogLoader.class.getResourceAsStream("book.xml"));
		data = FXCollections.observableArrayList(catalog.getBook());	
		xmlDataTable.setItems(data);
		c1.setCellValueFactory(data -> Bindings.createStringBinding(() -> data.getValue().getAuthor()));
		c2.setCellValueFactory(data -> Bindings.createStringBinding(() -> data.getValue().getTitle()));
	}

	public void remove() {
		Book b = xmlDataTable.getSelectionModel().getSelectedItem();
		data.remove(b);
	}
	
	public void save() throws FileNotFoundException {
		catalog.getBook().clear();
		catalog.getBook().addAll(data);
		XmlCatalogLoader.saveCatagalog(catalog, new FileOutputStream(new File("book.xml")));
	}

}
