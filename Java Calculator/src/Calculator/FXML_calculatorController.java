package Calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author peribot
 */
public class FXML_calculatorController implements Initializable {

     @FXML
    private Button txt0;

    @FXML
    private Button txt1;

    @FXML
    private Button txt2;

    @FXML
    private Button txt3;

    @FXML
    private Button txt4;

    @FXML
    private Button txt5;

    @FXML
    private Button txt6;

    @FXML
    private Button txt7;

    @FXML
    private Button txt8;

    @FXML
    private Button txt9;

    @FXML
    private TextField txtCalc;

    @FXML
    private Button txtClear;

    @FXML
    private Button txtClosedBraket;

    @FXML
    private Button txtDivision;

    @FXML
    private Button txtDot;

    @FXML
    private Button txtEqual;

    @FXML
    private Button txtMinus;

    @FXML
    private Button txtMult;

    @FXML
    private Button txtOpenBraket;

    @FXML
    private Button txtPlus;

    @FXML
    private Button txtPower;
    
    InfixToPostFix infixtopostfix = new InfixToPostFix();    
    PostfixEvaluation postfixCalc = new PostfixEvaluation();

    @FXML
    void handleButtonAction(ActionEvent event) {
        if(event.getSource() == txt0){
            txtCalc.setText(txtCalc.getText() + "0");
        }else if(event.getSource() == txt1){
            txtCalc.setText(txtCalc.getText() + "1");
        } else if(event.getSource() == txt2){
            txtCalc.setText(txtCalc.getText() + "2");
        } else if(event.getSource() == txt3){
            txtCalc.setText(txtCalc.getText() + "3");
        } else if(event.getSource() == txt4){
            txtCalc.setText(txtCalc.getText() + "4");
        } else if(event.getSource() == txt5){
            txtCalc.setText(txtCalc.getText() + "5");
        } else if(event.getSource() == txt6){
            txtCalc.setText(txtCalc.getText() + "6");
        } else if(event.getSource() == txt7){
            txtCalc.setText(txtCalc.getText() + "7");
        } else if(event.getSource() == txt8){
            txtCalc.setText(txtCalc.getText() + "8");
        } else if(event.getSource() == txt9){
            txtCalc.setText(txtCalc.getText() + "9");
        } else if(event.getSource() == txtOpenBraket){
            txtCalc.setText(txtCalc.getText() + "(");
        } else if(event.getSource() == txtClosedBraket){
            txtCalc.setText(txtCalc.getText() + ")");
        } else if(event.getSource() == txtPlus){
            txtCalc.setText(txtCalc.getText() + "+");
        } else if(event.getSource() == txtMinus){
            txtCalc.setText(txtCalc.getText() + "-");
        } else if(event.getSource() == txtMult){
            txtCalc.setText(txtCalc.getText() + "*");
        } else if(event.getSource() == txtDivision){
            txtCalc.setText(txtCalc.getText() + "/");
        } else if(event.getSource() == txtPower){
            txtCalc.setText(txtCalc.getText() + "^");
        } else if(event.getSource() == txtClear){
            txtCalc.setText("");
        }else if(event.getSource() == txtDot){
            txtCalc.setText(txtCalc.getText() + ".");
        }else if(event.getSource() == txtEqual){    
            txtCalc.setText(postfixCalc.evalPostfix(infixtopostfix.postfixConversion(txtCalc.getText())).toString());
        }

    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
