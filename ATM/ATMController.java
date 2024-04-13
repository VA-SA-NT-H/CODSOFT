package com.mycompany.atm_machine;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ATMController {

    @FXML
    private TextField amountField;

    @FXML
    private Label messageLabel;
    
    private StringBuilder userInput = new StringBuilder();

    private ATM atm = new ATM(new BankAccount(1000));

    @FXML
    public void withdraw() {
        try {
            double amount = Double.parseDouble(amountField.getText());
            atm.withdraw(amount);
            messageLabel.setText("Withdrawal successful");
        } catch (NumberFormatException e) {
            messageLabel.setText("Invalid amount");
        } catch (InsufficientFundsException e) {
            messageLabel.setText("Insufficient funds");
        }
    }

    @FXML
    public void deposit() {
        try {
            double amount = Double.parseDouble(amountField.getText());
            atm.deposit(amount);
            messageLabel.setText("Deposit successful");
        } catch (NumberFormatException e) {
            messageLabel.setText("Invalid amount");
        }
    }

    @FXML
    public void checkBalance() {
        double balance = atm.checkBalance();
        messageLabel.setText("Current balance: ₹" + balance);
    }
    @FXML
    public void buttonClicked(javafx.event.ActionEvent actionEvent) {
        String buttonValue = ((Button) actionEvent.getSource()).getText();
        userInput.append(buttonValue); // Append button value to user input
        amountField.setText(userInput.toString()); // Update text field with user input
    }

    // Clear button click handler
    @FXML
    public void clear() {
        userInput.setLength(0); // Clear user input
        amountField.clear(); // Clear text field
    }

    // Delete button click handler
    @FXML
    public void delete() {
        if (userInput.length() > 0) {
            userInput.deleteCharAt(userInput.length() - 1); // Delete last character from user input
            amountField.setText(userInput.toString()); // Update text field with modified user input
        }
    }

}

