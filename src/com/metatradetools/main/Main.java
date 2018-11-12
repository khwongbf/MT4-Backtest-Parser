package com.metatradetools.main;

import com.metatradetools.backtest.models.Backtest;
import com.metatradetools.backtest.parsers.BacktestParser;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

import java.io.File;

public class Main extends Application{
	FileChooser fileChooser;
	
	@Override
	public void start (Stage primaryStage){
		Button button = new Button("Read Backtest");
		button.setOnMouseClicked(event -> {
			fileChooser = new FileChooser();
			fileChooser.setTitle("Backtest Report");
			fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("HTM files","*.htm", "*.html"));
			File file = fileChooser.showOpenDialog(null);
			if (file != null){
				Backtest backtest = BacktestParser.parseFileToBacktest(file);
			}
		});
		button.setAlignment(Pos.CENTER);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(button);
		
		primaryStage.setScene(new Scene(borderPane));
		primaryStage.show();
	}
	
	public static void main(String args[]){
		launch(args);
	}
}
