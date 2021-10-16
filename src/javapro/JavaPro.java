package javapro;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class JavaPro extends Application {

    Label l1 = new Label("Passenger's Name: ");
    TextField t1 = new TextField();
    Label l2 = new Label("Phone Number: ");
    TextField t2 = new TextField();
    Label l3 = new Label("Journey Date: ");
    TextField t3 = new TextField();
    Label l4 = new Label("Destination");
    ChoiceBox c1 = new ChoiceBox();
    Label l5 = new Label("arrival Time");
    ChoiceBox c2 = new ChoiceBox();
    Label l6 = new Label("Seat Number");
    ChoiceBox c3 = new ChoiceBox();
    Label l7 = new Label("Counter Name");
    ChoiceBox c4 = new ChoiceBox();
    Label l8 = new Label("Bus number");
    ChoiceBox c5 = new ChoiceBox();
    Button b1 = new Button("Click To Pay");
    Button b2 = new Button("Back");
    Button b3 = new Button("Reserve");
    Button b4 = new Button("Show Seat Position");
    Button b5 = new Button("Clear");
    ChoiceBox c6 = new ChoiceBox();
    Text a2 = new Text();
    Text a1 = new Text();
    Scene scene;
    GridPane gp;

    @Override
    public void start(Stage primaryStage) {

//        Scene sc = new Scene(gp, 800, 600);
//        primaryStage.setScene(sc);
//        primaryStage.show();
        EventHandler<ActionEvent> h = new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent eh) {

                if (eh.getSource() == b1) {

                    try {
                        String pn = String.valueOf(t1.getText());
                        String ppn = String.valueOf(t2.getText());
                        String jd = String.valueOf(t3.getText());
                        String des = String.valueOf(c1.getValue());
                        String at = String.valueOf(c2.getValue());
                        String cn = String.valueOf(c4.getValue());
                        String bn = String.valueOf(c5.getValue());
                        String sn = String.valueOf(c3.getValue());
                        String fee = String.valueOf(a2.getText());
                        if (pn.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Enter Person Name");
                        } else if (ppn.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Enter Person Contact");
                        } else if (jd.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Enter Journy Date");
                        } else if (c1.getValue() == null) {
                            JOptionPane.showMessageDialog(null, "Select Destination");
                        } else if (c2.getValue() == null) {
                            JOptionPane.showMessageDialog(null, "Select Arrival Time");
                        } else if (c4.getValue() == null) {
                            JOptionPane.showMessageDialog(null, "select Counter");
                        } else if (c5.getValue() == null) {
                            JOptionPane.showMessageDialog(null, "Select Bus No");
                        } else if (c3.getValue() == null) {
                            JOptionPane.showMessageDialog(null, "Select Seat");
                        } else {

                            if (c1.getValue() == "Dhaka-Chapai Nawab gang") {

                                a1.setText("Dhaka-Chapai Nawab gang");
                                a2.setText("600TK");

                            }
                            if (c1.getValue() == "Dhaka-Lalmonirhat") {
                                a1.setText("Dhaka-Lalmonirhat");
                                a2.setText("320TK");
                            }
                            if (c1.getValue() == "Dhaka-Cox Bazar") {
                                a1.setText("Dhaka-Cox Bazar");
                                a2.setText("750TK");
                            }
                            if (c1.getValue() == "Dhaka-Sylhet") {
                                a1.setText("Dhaka-Sylhet");
                                a2.setText("560TK");
                            }
                            gp = new GridPane();
                            gp.addRow(1, a1);
                            gp.addRow(2, a2, c6);
                            gp.addRow(3, b2, b3);

                            gp.setPadding(new Insets(10, 10, 10, 10));
                            gp.setHgap(10);
                            gp.setVgap(10);
                            gp.setAlignment(Pos.CENTER);
                            Scene sc = new Scene(gp, 800, 600);
                            primaryStage.setScene(sc);
                            primaryStage.show();

                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
                if (eh.getSource() == b3) {

                    Label z1 = new Label("Passanger's Name :          ");
                    Label z2 = new Label("Passanger's Phone Number :  ");
                    Label z3 = new Label("Journey Date :              ");
                    Label z4 = new Label("Destination :               ");
                    Label z5 = new Label("Arrival Time :              ");
                    Label z6 = new Label("Counter Name :            ");
                    Label z7 = new Label("Bus Number :                ");
                    Label z8 = new Label("Seat Number :               ");
                    Label z9 = new Label("Ticket Reserved Successfully. Here Is Your Copy... ");
                    Label z10 = new Label("" + t1.getText());
                    Label z11 = new Label("" + t2.getText());
                    Label z12 = new Label("" + t3.getText());
                    Label z13 = new Label("" + (String) c1.getValue());
                    Label z14 = new Label("" + (String) c2.getValue());
                    Label z15 = new Label("" + (String) c4.getValue());
                    Label z16 = new Label("" + (String) c5.getValue());
                    Label z17 = new Label("" + (String) c3.getValue());

                    String pn = String.valueOf(t1.getText());
                    String ppn = String.valueOf(t2.getText());
                    String jd = String.valueOf(t3.getText());
                    String des = String.valueOf(c1.getValue());
                    String at = String.valueOf(c2.getValue());
                    String cn = String.valueOf(c4.getValue());
                    String bn = String.valueOf(c5.getValue());
                    String sn = String.valueOf(c3.getValue());
                    String fee = String.valueOf(a2.getText());

                    if (c6.getValue() == null) {
                        JOptionPane.showMessageDialog(null, "Select Payment Method ");
                    } else {
                        gp = new GridPane();
                        gp.setPadding(new Insets(10, 10, 10, 10));
                        gp.setHgap(10);
                        gp.setVgap(10);
                        gp.setAlignment(Pos.CENTER);
                        Scene sc = new Scene(gp, 800, 600);
                        primaryStage.setScene(sc);
                        primaryStage.show();
                        SaveTicket obj = new SaveTicket();
                        try {
                            obj.ticket(pn, ppn, jd, des, at, cn, bn, sn, fee);
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, ex);
                        }
                        if (c6.getValue() == "BKash") {

                            if (c1.getValue() == "Dhaka-Chapai Nawab gang") {
                                Label x1 = new Label("Payment of 600TK Through BKash Succed....");
                                gp.addRow(1, x1);
                            } else if (c1.getValue() == "Dhaka-Lalmonirhat") {
                                Label x2 = new Label("Payment of 320TK Through BKash Succed....");
                                gp.addRow(1, x2);
                            } else if (c1.getValue() == "Dhaka-Cox Bazar") {
                                Label x3 = new Label("Payment of 750TK Through BKash Succed....");
                                gp.addRow(1, x3);
                            } else if (c1.getValue() == "Dhaka-Sylhet") {
                                Label x4 = new Label("Payment of 560TK Through BKash Succed....");
                                gp.addRow(1, x4);
                            }
                        } else {

                            if (c1.getValue() == "Dhaka-Chapai Nawab gang") {
                                Label x1 = new Label("Payment of 600TK Through DBBL Succed....");
                                gp.addRow(1, x1);
                            } else if (c1.getValue() == "Dhaka-Lalmonirhat") {
                                Label x2 = new Label("Payment of 320TK Through DBBL Succed....");
                                gp.addRow(1, x2);
                            } else if (c1.getValue() == "Dhaka-Cox Bazar") {
                                Label x3 = new Label("Payment of 750TK Through DBBL Succed....");
                                gp.addRow(1, x3);
                            } else if (c1.getValue() == "Dhaka-Sylhet") {
                                Label x4 = new Label("Payment of 560TK Through DBBL Succed....");
                                gp.addRow(1, x4);
                            }
                        }
                    }

                    gp.addRow(2, z9);
                    gp.addRow(3, z1, z10);
                    gp.addRow(4, z2, z11);
                    gp.addRow(5, z3, z12);
                    gp.addRow(6, z4, z13);
                    gp.addRow(7, z5, z14);
                    gp.addRow(8, z6, z15);
                    gp.addRow(9, z7, z16);
                    gp.addRow(10, z8, z17);

                    gp.addRow(11, b4);

                }
                if (eh.getSource() == b4) {

                    gp = new GridPane();
                    gp.setPadding(new Insets(10, 10, 10, 10));
                    gp.setHgap(10);
                    gp.setVgap(10);
                    gp.setAlignment(Pos.CENTER);
                    Scene sc = new Scene(gp, 800, 600);
                    primaryStage.setScene(sc);
                    primaryStage.show();

                    Button b11 = new Button();
                    if (c3.getValue() == "A--1") {
                        b11.setText(t1.getText());
                    } else {
                        b11.setText("A--1");
                    }

                    Button b12 = new Button();
                    if (c3.getValue() == "A--2") {
                        b12.setText(t1.getText());
                    } else {
                        b12.setText("A--2");
                    }

                    Button b13 = new Button();
                    if (c3.getValue() == "A--3") {
                        b13.setText(t1.getText());
                    } else {
                        b13.setText("A--3");
                    }

                    Button b14 = new Button();

                    if (c3.getValue() == "A--4") {
                        b14.setText(t1.getText());
                    } else {
                        b14.setText("A--4");
                    }

                    Button b15 = new Button();

                    if (c3.getValue() == "A--5") {
                        b15.setText(t1.getText());
                    } else {
                        b15.setText("A--5");
                    }

                    Button b16 = new Button();
                    if (c3.getValue() == "A--6") {
                        b16.setText(t1.getText());
                    } else {
                        b16.setText("A--6");
                    }

                    Button b17 = new Button();
                    if (c3.getValue() == "A--7") {
                        b17.setText(t1.getText());
                    } else {
                        b17.setText("A--7");
                    }

                    Button b18 = new Button();
                    if (c3.getValue() == "A--8") {
                        b18.setText(t1.getText());
                    } else {
                        b18.setText("A--8");
                    }

                    Button b19 = new Button();
                    if (c3.getValue() == "A--9") {
                        b19.setText(t1.getText());
                    } else {
                        b19.setText("A--9");
                    }

                    Button b20 = new Button();
                    if (c3.getValue() == "B--1") {
                        b20.setText(t1.getText());
                    } else {
                        b20.setText("B--1");
                    }

                    Button b21 = new Button();
                    if (c3.getValue() == "B--2") {
                        b21.setText(t1.getText());
                    } else {
                        b21.setText("B--2");
                    }

                    Button b22 = new Button();

                    if (c3.getValue() == "B--3") {
                        b22.setText(t1.getText());
                    } else {
                        b22.setText("B--3");
                    }

                    Button b23 = new Button();
                    if (c3.getValue() == "B--4") {
                        b23.setText(t1.getText());
                    } else {
                        b23.setText("B--4");
                    }

                    Button b24 = new Button();
                    if (c3.getValue() == "B--5") {
                        b24.setText(t1.getText());
                    } else {
                        b24.setText("B--5");
                    }

                    Button b25 = new Button();
                    if (c3.getValue() == "B--6") {
                        b25.setText(t1.getText());
                    } else {
                        b25.setText("B--6");
                    }

                    Button b26 = new Button();
                    if (c3.getValue() == "B--7") {
                        b26.setText(t1.getText());
                    } else {
                        b26.setText("B--7");
                    }

                    Button b27 = new Button();
                    if (c3.getValue() == "B--8") {
                        b27.setText(t1.getText());
                    } else {
                        b27.setText("B--8");
                    }

                    Button b28 = new Button();
                    if (c3.getValue() == "B--9") {
                        b28.setText(t1.getText());
                    } else {
                        b28.setText("B--9");
                    }

                    Button b29 = new Button();
                    if (c3.getValue() == "C--1") {
                        b29.setText(t1.getText());
                    } else {
                        b29.setText("C--1");
                    }

                    Button b30 = new Button();
                    if (c3.getValue() == "C--2") {
                        b30.setText(t1.getText());
                    } else {
                        b30.setText("C--2");
                    }

                    Button b31 = new Button();

                    if (c3.getValue() == "C--3") {
                        b31.setText(t1.getText());
                    } else {
                        b31.setText("C--3");
                    }

                    Button b32 = new Button();
                    if (c3.getValue() == "C--4") {
                        b32.setText(t1.getText());
                    } else {
                        b32.setText("C--4");
                    }

                    Button b33 = new Button();
                    if (c3.getValue() == "C--5") {
                        b33.setText(t1.getText());
                    } else {
                        b33.setText("C--5");
                    }

                    Button b34 = new Button();
                    if (c3.getValue() == "C--6") {
                        b34.setText(t1.getText());
                    } else {
                        b34.setText("C--6");
                    }

                    Button b35 = new Button();
                    if (c3.getValue() == "C--7") {
                        b35.setText(t1.getText());
                    } else {
                        b35.setText("C--7");
                    }

                    Button b36 = new Button();
                    if (c3.getValue() == "C--8") {
                        b36.setText(t1.getText());
                    } else {
                        b36.setText("C--8");
                    }

                    Button b37 = new Button();
                    if (c3.getValue() == "C--9") {
                        b37.setText(t1.getText());
                    } else {
                        b37.setText("C--9");
                    }

                    Button b38 = new Button();
                    if (c3.getValue() == "D--1") {
                        b38.setText(t1.getText());
                    } else {
                        b38.setText("D--1");
                    }

                    Button b39 = new Button();
                    if (c3.getValue() == "D--2") {
                        b39.setText(t1.getText());
                    } else {
                        b39.setText("D--2");
                    }

                    Button b40 = new Button();
                    if (c3.getValue() == "D--3") {
                        b40.setText(t1.getText());
                    } else {
                        b40.setText("D--3");
                    }

                    Button b41 = new Button();
                    if (c3.getValue() == "D--4") {
                        b41.setText(t1.getText());
                    } else {
                        b41.setText("D--4");
                    }

                    Button b42 = new Button();
                    if (c3.getValue() == "D--5") {
                        b42.setText(t1.getText());
                    } else {
                        b42.setText("D--5");
                    }

                    Button b43 = new Button();
                    if (c3.getValue() == "D--6") {
                        b43.setText(t1.getText());
                    } else {
                        b43.setText("D--6");
                    }

                    Button b44 = new Button();
                    if (c3.getValue() == "D--7") {
                        b44.setText(t1.getText());
                    } else {
                        b44.setText("D--7");
                    }

                    Button b45 = new Button();
                    if (c3.getValue() == "D--8") {
                        b45.setText(t1.getText());
                    } else {
                        b45.setText("D--8");
                    }

                    Button b46 = new Button();
                    if (c3.getValue() == "D--9") {
                        b46.setText(t1.getText());
                    } else {
                        b46.setText("D--9");
                    }
                    gp.addColumn(1, b11, b12, b13, b14, b15, b16, b17, b18, b19);
                    gp.addColumn(2, b20, b21, b22, b23, b24, b25, b26, b27, b28);
                    gp.addColumn(4, b29, b30, b31, b32, b33, b34, b35, b36, b37);
                    gp.addColumn(5, b38, b39, b40, b41, b42, b43, b44, b45, b46);
                    gp.addRow(10, b2);

                }
                if (eh.getSource() == b2) {
                    primaryStage.setScene(scene);
                    primaryStage.show();

                }

            }

        };
        EventHandler<ActionEvent> clr = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                c1.getSelectionModel().clearSelection();
                c2.getSelectionModel().clearSelection();
                c3.getSelectionModel().clearSelection();
                c4.getSelectionModel().clearSelection();
                c5.getSelectionModel().clearSelection();

            }

        };
        b1.setOnAction(h);
        b2.setOnAction(h);
        b3.setOnAction(h);
        b4.setOnAction(h);
        b5.setOnAction(clr);

        t3.setPromptText("Day / Month / Year...");
        c1.getItems().addAll("Dhaka-Chapai Nawab gang", "Dhaka-Lalmonirhat", "Dhaka-Cox Bazar", "Dhaka-Sylhet");
        c2.getItems().addAll("04:40 am", "05:40 am", "06:40 am", "07:40 am", "08:40 am", "09:40 am", "10:40 am", "01:10 pm", "03:10 pm", "05:20 pm", "08:30 pm");
        c3.getItems().addAll("A--1", "A--2", "A--3", "A--4", "A--5", "A--6", "A--7", "A--8", "A--9",
                "B--1", "B--2", "B--3", "B--4", "B--5", "B--6", "B--7", "B--8", "B--9", "C--1", "C--2", "C--3", "C--4", "C--5", "C--6", "C--7", "C--8", "C--9",
                "D--1", "D--2", "D--3", "D--4", "D--5", "D--6", "D--7", "D--8", "D--9");
        c4.getItems().addAll("Abdullahpur", "Azompur", "Tongi", "BNS", "Airport", "Mohakhali", "Badda");
        c5.getItems().addAll("00", "01", "02", "03", "04", "05", "06", "07", "08", "09");
        c6.getItems().addAll("Bkash", "DBBL");
        GridPane gp = new GridPane();
        gp.setPadding(new Insets(10, 10, 10, 10));
        gp.setHgap(10);
        gp.setVgap(10);
        gp.addRow(1, l1, t1);
        gp.addRow(2, l2, t2);
        gp.addRow(3, l3, t3);
        gp.addRow(4, l4, c1);
        gp.addRow(5, l5, c2);
        gp.addRow(6, l6, c3);
        gp.addRow(7, l7, c4);
        gp.addRow(8, l8, c5);
        gp.addRow(9, b1, b5);
        scene = new Scene(gp, 600, 500);
        gp.setAlignment(Pos.CENTER);
        primaryStage.setTitle("Bus Ticket Reservation System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
