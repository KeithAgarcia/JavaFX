package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    @FXML
    ListView list;

    @FXML
    TextField name;
    @FXML
    TextField phone;
    @FXML
    TextField email;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(contacts);
    }



    public void addContact() {
        if(name.getText().isEmpty()){
            return;
        }
        if(phone.getText().isEmpty()){
            return;
        }
        if (email.getText().isEmpty()){
            return;
        }
        contacts.add(new Contact(name.getText()+ ",   ", phone.getText() +",   ", email.getText()));}


    public void removeContact() {
        Contact contact = (Contact) list.getSelectionModel().getSelectedItem();
        contacts.remove(contact);

    }


}
