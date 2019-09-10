
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class HomePageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    // These are for choice box
    
    @FXML private ComboBox Account;
    @FXML private ComboBox Support;
    @FXML private ChoiceBox Origin;
    @FXML private ChoiceBox Destination;
    @FXML private ChoiceBox Transport_Mode;
    
    //This id for Date selector
    
    @FXML private DatePicker Select_Date;
      
    public void HomeButtonPushed()
    {
 
    }
    public void BusButtonPushed()
    {
 
    }
    public void TrainButtonPushed()
    {
 
    }
    public void FlightButtonPushed()
    {
 
    }
    public void HolidayButtonPushed()
    {
 
    }
    public void MyTripButtonPushed()
    {
 
    }
    public void ProceedButtonPushed()
    {
 
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Account.getItems().addAll("Login","SignUp","Signout");
        Account.setPromptText("Account");
        Support.getItems().addAll("Contact Us","Refund");
        Support.setPromptText("Support");
        
    }    
    
}
