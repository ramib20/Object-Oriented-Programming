import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;

/**
* this class includes all our buttons, UI elements, and their functions
*@author Rami Bouhafs
*/
public class StarterUpper extends Application {

    private ArrayList<StartUpIdea> startupIdeas = new ArrayList<>();

    private File ideasFile = new File("ideasFile.txt");

    @Override
    public void start(Stage stage) throws FileNotFoundException {

        Color gtcolors = Color.rgb(179, 163, 105);
        Text titleText = new Text("Record Your Amazing Startup Ideas Below!");
        Font font = Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 18);
        titleText.setFont(font);
        titleText.setFill(gtcolors);

        Text listedProblems = new Text("Current Problems Listed:");
        Font font2 = Font.font("georgia", FontWeight.BOLD, FontPosture.REGULAR, 14);
        listedProblems.setFont(font2);
        listedProblems.setFill(gtcolors);

        Text gapSpacing = new Text("");
        Font spacing = Font.font("georgia", FontWeight.BOLD, FontPosture.REGULAR, 24);
        gapSpacing.setFont(spacing);

        // all text fields and labels:

        TextField userInput = new TextField();
        Label problemInput = new Label("What is the problem?"); // takes in string
        Text problem1 = new Text();
        Text problem2 = new Text();
        Text problem3 = new Text();
        Text problem4 = new Text();
        Text problem5 = new Text();
        Text problem6 = new Text();
        Text problem7 = new Text();

        TextField userInput2 = new TextField();
        Label targetCustomerInput = new Label("Who is the target customer?"); // takes in string

        TextField userInput3 = new TextField();
        Label howMuchNeeded = new Label("How badly does the customer NEED this problem fixed (1-10)?"); // takes in int

        TextField userInput4 = new TextField();
        Label howManyNeed = new Label("How many people do you know who might experience this problem?"); // takes in int

        TextField userInput5 = new TextField();
        Label targetMarketSizeInput = new Label("How big is the target market?"); // takes in int

        TextField userInput6 = new TextField();
        Label competitorsOrExistingSolutions = new Label(
                                                   "Who are the competitors/existing solutions?"); // takes in string

        ComboBox<String> sustainableQuestion = new ComboBox<String>();
        ComboBox<String> feasableQuestion = new ComboBox<String>();
        sustainableQuestion.getItems().addAll("Yes", "No");
        feasableQuestion.getItems().addAll("Yes", "No");
        sustainableQuestion.getSelectionModel().selectFirst();
        feasableQuestion.getSelectionModel().selectFirst();
        Label sustQuest = new Label(
                "Is this idea fundable? Can this be turned into a sustainable business that generates profit?");
        Label feasQuest = new Label("Is this idea feasable and/or realistic?");

        Button addToListButton = new Button();
        addToListButton.setText("Add this startup idea to my list of startup ideas");
        addToListButton.setOnAction(event -> {

                String problem = userInput.getText();
                String targetCustomer = userInput2.getText();
                String customerNeed = userInput3.getCharacters().toString();
                String knownPeopleWithProblem = userInput4.getCharacters().toString();
                String targetMarketSize = userInput5.getCharacters().toString();
                String competitors = userInput6.getText();
                String sustainableQuestionValue = sustainableQuestion.getValue();
                String feasableQuestionValue = feasableQuestion.getValue();
                int noErrorsTracker = 0;

                if ((problem.length() == 0) || (targetCustomer.length() == 0) || (customerNeed.length() == 0)
                    || (knownPeopleWithProblem.length() == 0) || (targetMarketSize.length() == 0)
                    || (competitors.length() == 0)) {
                    noErrorsTracker++;
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setTitle("Error");
                    a.setHeaderText("At least one field is empty!");
                    a.setContentText("Fill out every text box with a valid input.");
                    a.showAndWait();
                }
                try {
                    int customerNeedAsInt = Integer.parseInt(customerNeed);
                    int knownPeopleWithProblemAsInt = Integer.parseInt(knownPeopleWithProblem);
                    int targetMarketSizeAsInt = Integer.parseInt(targetMarketSize);

                    if ((customerNeedAsInt > 10) || (customerNeedAsInt == 0)) {
                        noErrorsTracker++;
                        Alert a = new Alert(Alert.AlertType.ERROR);
                        a.setTitle("Error");
                        a.setHeaderText("Invalid Integer");
                        a.setContentText("Customer Need only accepts integers between 1 and 10.");
                        a.showAndWait();
                        userInput3.setText("");
                    }
                    if ((customerNeedAsInt < 0) || (knownPeopleWithProblemAsInt < 0) || (targetMarketSizeAsInt < 0)) {
                        noErrorsTracker++;
                        Alert a = new Alert(Alert.AlertType.ERROR);
                        a.setTitle("Error");
                        a.setHeaderText("At least one integer-based field has a negative number!");
                        a.setContentText("Only non-negative integers are valid inputs.");
                        a.showAndWait();

                        if (knownPeopleWithProblemAsInt < 0) {
                            userInput4.setText("");
                        }
                        if (customerNeedAsInt < 0) {
                            userInput3.setText("");
                        }
                        if (targetMarketSizeAsInt < 0) {
                            userInput5.setText("");
                        }
                    }

                    if (noErrorsTracker == 0) {
                        StartUpIdea newIdea = new StartUpIdea(problem, targetCustomer, customerNeedAsInt,
                                knownPeopleWithProblemAsInt, targetMarketSizeAsInt, competitors,
                                sustainableQuestionValue, feasableQuestionValue);
                        startupIdeas.add(newIdea);

                        if (startupIdeas.size() == 1) {
                            problem1.setText("1st Problem: " + ((startupIdeas.get(0)).getProblem()));
                        } else if (startupIdeas.size() == 2) {
                            problem1.setText("1st Problem: " + ((startupIdeas.get(0)).getProblem()));
                            problem2.setText("2nd Problem: " + ((startupIdeas.get(1)).getProblem()));
                        } else if (startupIdeas.size() == 3) {
                            problem1.setText("1st Problem: " + ((startupIdeas.get(0)).getProblem()));
                            problem2.setText("2nd Problem: " + ((startupIdeas.get(1)).getProblem()));
                            problem3.setText("3rd Problem: " + ((startupIdeas.get(2)).getProblem()));
                        } else if (startupIdeas.size() == 4) {
                            problem1.setText("1st Problem: " + ((startupIdeas.get(0)).getProblem()));
                            problem2.setText("2nd Problem: " + ((startupIdeas.get(1)).getProblem()));
                            problem3.setText("3rd Problem: " + ((startupIdeas.get(2)).getProblem()));
                            problem4.setText("4th Problem: " + ((startupIdeas.get(3)).getProblem()));
                        } else if (startupIdeas.size() == 5) {
                            problem1.setText("1st Problem: " + ((startupIdeas.get(0)).getProblem()));
                            problem2.setText("2nd Problem: " + ((startupIdeas.get(1)).getProblem()));
                            problem3.setText("3rd Problem: " + ((startupIdeas.get(2)).getProblem()));
                            problem4.setText("4th Problem: " + ((startupIdeas.get(3)).getProblem()));
                            problem5.setText("5th Problem: " + ((startupIdeas.get(4)).getProblem()));
                        } else if (startupIdeas.size() == 6) {
                            problem1.setText("1st Problem: " + ((startupIdeas.get(0)).getProblem()));
                            problem2.setText("2nd Problem: " + ((startupIdeas.get(1)).getProblem()));
                            problem3.setText("3rd Problem: " + ((startupIdeas.get(2)).getProblem()));
                            problem4.setText("4th Problem: " + ((startupIdeas.get(3)).getProblem()));
                            problem5.setText("5th Problem: " + ((startupIdeas.get(4)).getProblem()));
                            problem6.setText("6th Problem: " + ((startupIdeas.get(5)).getProblem()));
                        } else if (startupIdeas.size() == 7) {
                            problem1.setText("1st Problem: " + ((startupIdeas.get(0)).getProblem()));
                            problem2.setText("2nd Problem: " + ((startupIdeas.get(1)).getProblem()));
                            problem3.setText("3rd Problem: " + ((startupIdeas.get(2)).getProblem()));
                            problem4.setText("4th Problem: " + ((startupIdeas.get(3)).getProblem()));
                            problem5.setText("5th Problem: " + ((startupIdeas.get(4)).getProblem()));
                            problem6.setText("6th Problem: " + ((startupIdeas.get(5)).getProblem()));
                            problem7.setText("7th Problem: " + ((startupIdeas.get(6)).getProblem()));
                        }

                        userInput.setText("");
                        userInput2.setText("");
                        userInput3.setText("");
                        userInput4.setText("");
                        userInput5.setText("");
                        userInput6.setText("");
                    }

                } catch (Exception e) {
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setTitle("Error");
                    a.setHeaderText("Invalid Input");
                    a.setContentText("Please enter an integer");
                    a.showAndWait();
                }

            });

        Button sortingButton = new Button();
        sortingButton.setText("Sort my list of startup ideas from most potential to least potential");
        sortingButton.setOnAction(event -> {
                if (startupIdeas.size() > 1) {
                    Collections.sort(startupIdeas);
                }
            });

        Button deletingButton = new Button();
        deletingButton.setText("Delete list of ideas and file");
        deletingButton.setOnAction(event -> {
                Alert confirmationAlert = new Alert(AlertType.CONFIRMATION,
                       "Are you sure?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
                confirmationAlert.setTitle("Confirmation:");
                confirmationAlert.setHeaderText("Are you sure you want to delete you list and file of startup ideas?");
                confirmationAlert.setContentText("Please confirm below.");
                confirmationAlert.showAndWait();

                if ((confirmationAlert.getResult() == ButtonType.NO)
                    || (confirmationAlert.getResult() == ButtonType.CANCEL)) {
                    System.out.println("Deletion cancelled.");
                } else {

                    System.out.println("File and List have been wiped.");
                    ideasFile.delete();
                    startupIdeas.clear();
                    userInput.setText("");
                    userInput2.setText("");
                    userInput3.setText("");
                    userInput4.setText("");
                    userInput5.setText("");
                    userInput6.setText("");
                    problem1.setText("");
                    problem2.setText("");
                    problem3.setText("");
                    problem4.setText("");
                    problem5.setText("");
                    problem6.setText("");
                    problem7.setText("");
                }
            });

        Button savingButton = new Button();
        savingButton.setText("Save list of ideas to file");
        savingButton.setOnAction(event -> {
                System.out.println("Ideas have been saved to 'ideasFile.txt'");
                FileUtil.saveIdeasToFile(startupIdeas, ideasFile);
            });

        VBox input = new VBox();
        input.setAlignment(Pos.CENTER);
        input.getChildren().add(titleText);
        input.getChildren().add(gapSpacing);
        input.getChildren().add(problemInput);
        input.getChildren().add(userInput);

        input.getChildren().add(targetCustomerInput);
        input.getChildren().add(userInput2);

        input.getChildren().add(howMuchNeeded);
        input.getChildren().add(userInput3);

        input.getChildren().add(howManyNeed);
        input.getChildren().add(userInput4);

        input.getChildren().add(targetMarketSizeInput);
        input.getChildren().add(userInput5);

        input.getChildren().add(competitorsOrExistingSolutions);
        input.getChildren().add(userInput6);

        input.getChildren().add(sustQuest);
        input.getChildren().add(sustainableQuestion);

        input.getChildren().add(feasQuest);
        input.getChildren().add(feasableQuestion);

        input.setSpacing(1);
        input.getChildren().add(addToListButton);
        input.getChildren().add(sortingButton);
        input.getChildren().add(deletingButton);
        input.getChildren().add(savingButton);
        input.getChildren().add(listedProblems);

        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.getChildren().add(input);
        root.getChildren().add(problem1);
        root.getChildren().add(problem2);
        root.getChildren().add(problem3);
        root.getChildren().add(problem4);
        root.getChildren().add(problem5);
        root.getChildren().add(problem6);
        root.getChildren().add(problem7);

        Scene scene = new Scene(root, 1000, 650);
        stage.setTitle("Problem Ideation Form");
        stage.setScene(scene);
        stage.show();

    }
}
