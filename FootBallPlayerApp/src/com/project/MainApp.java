package com.project;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//Application startup Class--contains Table JavaFX objects
public class MainApp extends Application{
	//Creating TableView Object for Player
	TableView<Player> table;
	//Textfield creation for available variables/input fields
	TextField nameInput,clubInput,countryInput,goalsScoredInput,positionInput;
	//Object of PlayersObject class--to perform serialization
	PlayersObject po= new PlayersObject();
	//JavaFX Collection--default sample list of players
	ObservableList<Player> players;
	//Java collection--List to add player records
	List<Player> playerList = new ArrayList<Player>();
	//Main method-Entry point of the application 
	public static void main(String[] args) {
		launch(args);
	}


	@SuppressWarnings("unchecked")
	@Override
	//Method initialized by main method,contains execution logic
	public void start(Stage primaryStage) throws Exception {
		//Title definition
		primaryStage.setTitle("Table View Sample");
		//Table creation for displaying available records
		//nameCol--contains Player name
		TableColumn<Player,String> nameCol = new TableColumn<>("Name");
		nameCol.setMinWidth(100);
		nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
		nameInput=new TextField();
		nameInput.setPromptText("Player Name");
		//clubCol--contains Player Club
		TableColumn<Player,String> clubCol = new TableColumn<>("Club");
		clubCol.setMinWidth(100);
		clubCol.setCellValueFactory(new PropertyValueFactory<>("club"));
		clubInput=new TextField();
		clubInput.setPromptText("Player Team");
		//countryCol--contains Player Country
		TableColumn<Player,String> countryCol = new TableColumn<>("Country");
		countryCol.setMinWidth(100);
		countryCol.setCellValueFactory(new PropertyValueFactory<>("country"));
		countryInput=new TextField();
		countryInput.setPromptText("Player Country");
		//goalsScoredCol--contains goals scored by player
		TableColumn<Player,String> goalsScoredCol = new TableColumn<>("Goals Scored");
		goalsScoredCol.setMinWidth(100);
		goalsScoredCol.setCellValueFactory(new PropertyValueFactory<>("goalsScored")); 
		goalsScoredInput=new TextField();
		goalsScoredInput.setPromptText("Player Goal scored");
		//positionCol--contains Player Country
		TableColumn<Player,String> positionCol = new TableColumn<>("Position");
		positionCol.setMinWidth(100);
		positionCol.setCellValueFactory(new PropertyValueFactory<>("position"));
		positionInput=new TextField();
		positionInput.setPromptText("Player Position");

		//Button for Add operation
		Button addButton=new Button("Add");
		//Event handler call on Add button-- on click event
		addButton.setOnAction(e-> addButtonClicked());
		//CSS for Add Button
		addButton.getStyleClass().add("button");
		//Button for Delete operation
		Button deleteButton=new Button("Delete");
		//Event handler call on Delete button-- on click event
		deleteButton.setOnAction(e-> deleteButtonClicked());
		//CSS for Delete Button
		deleteButton.getStyleClass().add("button");

		//Horizontal Box of Table
		HBox hbox = new HBox();
		//Spacing between table elements
		hbox.setSpacing(5);
		//10 pixel each spacing on Right,Left,Top,Bottom of the table
		hbox.setPadding(new Insets(10, 10, 10, 10));
		//adding elements on the horizontal pane of table
		hbox.getChildren().addAll(nameInput,clubInput,countryInput,goalsScoredInput,positionInput,addButton,deleteButton);

		table=new TableView<>();
		//Setting available Player list on tableview
		table.setItems(getPlayers());
		//Setting table columns
		table.getColumns().addAll(nameCol,clubCol,countryCol,goalsScoredCol,positionCol);
		//Vertical Box of Table
		VBox vBox=new VBox();
		//adding elements on the vertical pane of table
		vBox.getChildren().addAll(table,hbox);

		Scene scene=new Scene(vBox);
		primaryStage.setScene(scene);
		//Reference of CSS Stylesheet to the MainApp class
		scene.getStylesheets().add(MainApp.class.getResource("Style.css").toExternalForm());
		primaryStage.show();

	}
	//Delete button onClick event handler
	private void deleteButtonClicked() {
		ObservableList<Player> playerSelected,allPlayers;
		allPlayers=table.getItems();
		playerSelected=table.getSelectionModel().getSelectedItems();
		playerSelected.forEach(allPlayers::remove);


	}

	//Add button onClick event handler
	public void addButtonClicked() {
		//Player object creation and setting values from GUI
		Player player=new Player();
		player.setName(nameInput.getText());
		player.setClub(clubInput.getText());
		player.setCountry(countryInput.getText());
		player.setGoalsScored(Integer.parseInt(goalsScoredInput.getText()));
		player.setPosition(positionInput.getText());
		//add the new record in GUI table
		table.getItems().add(player);
		//add new record in the Player list
		playerList.add(player);
		//saving updated players list--calling PlayersObject savePlayer method
		po.savePlayer(playerList);
		//Making player object empty
		nameInput.clear();
		clubInput.clear();
		countryInput.clear();
		goalsScoredInput.clear();
		positionInput.clear();
	}
	//Pre-defined sample list of Favourite football players
	public ObservableList<Player> getPlayers(){
		players=FXCollections.observableArrayList();
		players.add(new Player("Messi","MU","Argentina",25,"Attacker"));
		players.add(new Player("Ronaldo","Ar","Spain",30,"Defender"));
		//Add existing records into Players list
		playerList.addAll(players);
		return players;


	}

	@Override
	//To stop all existing executions
	public void stop() throws Exception {
		super.stop();
		System.out.println("Inside stop() method! Destroy resources. Perform Cleanup.");
	}
}
