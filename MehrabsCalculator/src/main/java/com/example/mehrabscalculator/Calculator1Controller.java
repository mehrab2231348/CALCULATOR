package com.example.mehrabscalculator;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Calculator1Controller
{
    @javafx.fxml.FXML
    private TextField numberTwoTextField;
    @javafx.fxml.FXML
    private TextField numberOneTextField;
    @javafx.fxml.FXML
    private Label answerLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void divisionOnClick(ActionEvent actionEvent) {
        String numOne = numberOneTextField.getText();
        String numTwo = numberTwoTextField.getText();

        Float num1 = Float.parseFloat(numOne);
        Float num2 = Float.parseFloat(numTwo);

        if(num2==0){
            answerLabel.setText("ERROR MY LOVE");

        }
        else{
            float num3 = num1/num2;
            String numThree = Float.toString(num3);
            answerLabel.setText(numThree);
        }
    }

    @javafx.fxml.FXML
    public void addOnClick(ActionEvent actionEvent) {
        String numOne = numberOneTextField.getText();
        String numTwo = numberTwoTextField.getText();

        Float num1 = Float.parseFloat(numOne);
        Float num2 = Float.parseFloat(numTwo);

        float num3 = num1 + num2;
        String numThree = Float.toString(num3);
        answerLabel.setText(numThree);
    }

    @javafx.fxml.FXML
    public void multiplyOnClick(ActionEvent actionEvent) {
        String numOne = numberOneTextField.getText();
        String numTwo = numberTwoTextField.getText();

        Float num1 = Float.parseFloat(numOne);
        Float num2 = Float.parseFloat(numTwo);

        float num3 = num1 * num2;
        String numThree = Float.toString(num3);
        answerLabel.setText(numThree);
    }

    @javafx.fxml.FXML
    public void substractOnclick(ActionEvent actionEvent) {
        String numOne = numberOneTextField.getText();
        String numTwo = numberTwoTextField.getText();

        Float num1 = Float.parseFloat(numOne);
        Float num2 = Float.parseFloat(numTwo);

        float num3 = num1 - num2;
        String numThree = Float.toString(num3);
        answerLabel.setText(numThree);
    }

    @javafx.fxml.FXML
    public void clearOnClick(ActionEvent actionEvent) {
        numberOneTextField.clear();
        numberTwoTextField.clear();
        answerLabel.setText("  ");
    }
}