package com.example.pair2;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class Mbox extends VBox {

    private TextField field, field2, field3, field4;
    private Label to, cc, bcc, sub, Messi;
    private TextArea field5;
    private Button send;
    private Font mf = new Font("Arial", 15);

    public Mbox() {

        setAlignment(Pos.TOP_CENTER);

        to = new Label("To: ");
        field = new TextField();
        field.setMinWidth(500);
        to.setFont(mf);
        field.setFont(mf);


        HBox F = new HBox(to, field);
        F.setSpacing(10);
        F.setAlignment(Pos.TOP_CENTER);

        cc = new Label("CC: ");
        cc.setFont(mf);
        field2 = new TextField();
        field2.setMinWidth(field.getMinWidth());

        field2.setFont(mf);

        HBox F2 = new HBox(cc, field2);
        F2.setSpacing(F.getSpacing());
        F2.setAlignment(Pos.TOP_CENTER);

        bcc = new Label("BCC: ");
        bcc.setFont(mf);
        field3 = new TextField();
        field3.setMinWidth(field.getMinWidth());
        field3.setFont(mf);

        HBox F3 = new HBox(bcc, field3);
        F3.setSpacing(F.getSpacing());
        F3.setAlignment(F2.getAlignment());

        sub = new Label("Subject: ");
        sub.setFont(mf);
        field4 = new TextField();
        field4.setMinWidth(field.getMinWidth());
        field4.setFont(mf);

        HBox F4 = new HBox(sub, field4);
        F4.setAlignment(F2.getAlignment());
        F4.setSpacing(F.getSpacing());

        Messi = new Label("Message: ");
        Messi.setFont(mf);
        field5 = new TextArea();
        field5.setMinWidth(field.getMinWidth());
        field5.setFont(mf);

        HBox F5 = new HBox(Messi, field5);
        F5.setAlignment(F2.getAlignment());
        F5.setSpacing(F.getSpacing());


        send = new Button("Send");
        send.setOnAction(this::TextCheck);
        send.setAlignment(Pos.TOP_CENTER);
        send.setFont(mf);

        setPadding(new Insets(10, 10, 10, 10));
        setSpacing(20);
        getChildren().addAll(F, F2, F3, F4, F5, send);
    }

    public void TextCheck(ActionEvent event) {

        if (event.getSource() == send) {
            System.out.println("To: " + field.getText());
            System.out.println("CC: " + field2.getText());
            System.out.println("BCC: " + field3.getText());
            System.out.println("Subject: " + field4.getText());
            System.out.println("Message: " + field5.getText());
        }


        field.setText("");
        field2.setText(field.getText());
        field3.setText(field.getText());
        field4.setText(field.getText());
        field5.setText(field.getText());
    }
}