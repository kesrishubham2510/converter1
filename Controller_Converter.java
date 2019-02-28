package sample;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import java.util.List;
import java.util.ArrayList;

import java.net.URL;
import java.util.InputMismatchException;
import java.util.ResourceBundle;
//add options to read from text and display in the app itself..
// All converters have been completed
//edit the exception handling data part
//add display to show the result.
public class Controller_Converter implements Initializable {

	public boolean c1=true;
	public boolean c2=false;
	public boolean c3=false;
	public boolean c4=false;
	public boolean c5=false;
	public boolean c6=false;
	public boolean c7=false;
	public boolean c8=false;
	public boolean c9=false;
	public boolean c10=false;
	public boolean c11=false;
	public boolean c12=false;
	public boolean c13=false;
	public boolean c14=false;
	public boolean c15=false;
	public boolean c16=false;
	public boolean c17=false;
	public boolean c18=false;
	public boolean c19=false;
	public boolean c20=false;
	public boolean c21=false;


//b1 and c1 are true becoz for default values we can also do calculations

	public boolean b1 = true;
	public boolean b2 = false;
	public boolean b3 = false;
	public boolean b4 = false;
	public boolean b5 = false;
	public boolean b6 = false;
	public boolean b7 = false;
	public boolean b8 = false;
	public boolean b9 = false;
	public boolean b10 = false;
	public boolean b11 = false;
	public boolean b12 = false;
	public boolean b13 = false;
	public boolean b14 = false;
	public boolean b15=false;
	public boolean b16 = false;
	public boolean b17=false;
	public boolean b18 = false;
	public boolean b19=false;
	public boolean b20 = false;
	public boolean b21=false;
	public boolean m = false;
	public boolean a = false;
	public boolean v = false;
	public boolean l = false;
	public boolean b = false;

ObservableList list= FXCollections.observableArrayList();
	@FXML
	public ChoiceBox<String> choose;
	@FXML
	public ChoiceBox<String> from;
	public ChoiceBox<String> to;

	@FXML
	public TextField Input;

	@FXML
	public Button convert;
	public Button changeField;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		//adding the componenets for choose drop down box
		choose.getItems().add("Mass"); //boolean m;
		choose.getItems().add("Length");//boolean l;
		choose.getItems().add("Temperature");//boolean b;
		choose.getItems().add("Area");//boolean a;
		choose.getItems().add("Volume");//boolean v;

		choose.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (newValue.equals("Mass")) {
					m=true;l=false;b=false;a=false;v=false;massConverter();}
				else if (newValue.equals("Length"))
				{m=false;l=true;b=false;a=false;v=false;LengthConverter();}
				else if (newValue.equals("Temperature"))
				{m=false;l=true;b=true;a=false;v=false;temperatureConverter();}
				else if (newValue.equals("Area"))
				{m=false;l=true;b=false;a=true;v=false;areaConverter();}
				else if (newValue.equals("Volume"))
				{m=false;l=true;b=false;a=false;v=true;VolumeConverter();}
			}
		});


	}

	private void LengthConverter() {

		from.getItems().add("Kilo meter");
		from.getItems().add("Meter");
		from.getItems().add("Decimeter");
		from.getItems().add("Centimeter");
		from.getItems().add("Millimeter");
		from.getItems().add("Micrometer");
		from.getItems().add("Nanometer");
		from.getItems().add("Picometer");
		from.getItems().add("Nautical mile");
		from.getItems().add("Mile");
		from.getItems().add("Yard");
		from.getItems().add("Foot");
		from.getItems().add("Inch");

		from.setValue("Kilo meter");

		to.getItems().add("Kilo meter");
		to.getItems().add("Meter");
		to.getItems().add("Decimeter");
		to.getItems().add("Centimeter");
		to.getItems().add("Millimeter");
		to.getItems().add("Micrometer");
		to.getItems().add("Nanometer");
		to.getItems().add("Picometer");
		to.getItems().add("Nautical mile");
		to.getItems().add("Mile");
		to.getItems().add("Yard");
		to.getItems().add("Foot");
		to.getItems().add("Inch");

		to.setValue("Kilo meter");
        from.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
	        @Override
	        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
		        if(newValue.equals("Kilo meter"))
		        {
			      b1 =true;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;b12=false;b13=false;
	        }
		        else if(newValue.equals("Meter")){
			        b1 =false;b2=true;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;b12=false;b13=false;

		        }
		        else if(newValue.equals("Decimeter"))
		        {
			        b1 =false;b2=false;b3=true;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;b12=false;b13=false;

		        }
		        else if(newValue.equals("Centimeter"))
		        {
			        b1 =false;b2=false;b3=false;b4=true;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;b12=false;b13=false;

		        }
		        else if(newValue.equals("Millimeter"))
		        {
			        b1 =false;b2=false;b3=false;b4=false;b5=true;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;b12=false;b13=false;

		        }
		        else if(newValue.equals("Micrometer"))
		        {
			        b1 =false;b2=false;b3=false;b4=false;b5=false;b6=true;b7=false;b8=false;b9=false;b10=false;b11=false;b12=false;b13=false;

		        }
     		        else if(newValue.equals("Nanometer"))
		        {
			        b1 =false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=true;b8=false;b9=false;b10=false;b11=false;b12=false;b13=false;

		        }
		        else if(newValue.equals("Picometer"))
		        {b1 =false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=true;b9=false;b10=false;b11=false;b12=false;b13=false;

		        }
		        else if(newValue.equals("Nautical mile"))
		        {
			        b1 =false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=true;b10=false;b11=false;b12=false;b13=false;

		        }
		        else if(newValue.equals("Mile"))
		        {
			        b1 =false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=true;b11=false;b12=false;b13=false;

		        }
else if(newValue.equals("Yard"))
		        {
			        b1 =false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=true;b12=false;b13=false;

		        }
		        else if(newValue.equals("Foot"))
		        {
			        b1 =false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;b12=true;b13=false;

		        }
		        else if(newValue.equals("Inch"))
		        {
			        b1 =false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;b12=false;b13=true;

		        }

	        }
        });

        to.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
	        @Override
	        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
		        if(newValue.equals("Kilo meter"))
		        {
		        	c1=true;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;c12=false;c13=false;
		        }
		        else if(newValue.equals("Meter")){
			        c1=false;c2=true;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;c12=false;c13=false;
		        }
		        else if(newValue.equals("Decimeter"))
		        {
			        c1=false;c2=false;c3=true;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;c12=false;c13=false;
		        }
		        else if(newValue.equals("Centimeter"))
		        {
			        c1=false;c2=false;c3=false;c4=true;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;c12=false;c13=false;
		        }
		        else if(newValue.equals("Millimeter"))
		        {
			        c1=false;c2=false;c3=false;c4=false;c5=true;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;c12=false;c13=false;
		        }
		        else if(newValue.equals("Micrometer"))
		        {
			        c1=false;c2=false;c3=false;c4=false;c5=false;c6=true;c7=false;c8=false;c9=false;c10=false;c11=false;c12=false;c13=false;
		        }
		        else if(newValue.equals("Nanometer"))
		        {
			        c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=true;c8=false;c9=false;c10=false;c11=false;c12=false;c13=false;
		        }
		        else if(newValue.equals("Picometer"))
		        {
		        	c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=true;c9=false;c10=false;c11=false;c12=false;c13=false;
		        }
		        else if(newValue.equals("Nautical mile"))
		        {
			        c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=true;c10=false;c11=false;c12=false;c13=false;
		        }
		        else if(newValue.equals("Mile"))
		        {
			        c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=true;c11=false;c12=false;c13=false;
		        }
		        else if(newValue.equals("Yard"))
		        {
			        c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=true;c12=false;c13=false;
		        }
		        else if(newValue.equals("Foot"))
		        {
			        c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;c12=true;c13=false;
		        }
		        else if(newValue.equals("Inch"))
		        {
			        c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;c12=false;c13=true;
		        }

	        }
        });

        convert.setOnAction(new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
		        Convert1();
	        }
        });
	}

	private void VolumeConverter() {
		from.getItems().add("cubic m");
		from.getItems().add("cubic dm");
		from.getItems().add("cubic cm");
		from.getItems().add("cubic mm");
		from.getItems().add("hl");
		from.getItems().add("l");
		from.getItems().add("dl");
		from.getItems().add("cl");
		from.getItems().add("ml");
		from.getItems().add("cubic ft");
		from.getItems().add("cubic inch");
		from.getItems().add("cubic yard");
		from.getItems().add("Acre-foot af");
		from.setValue("cubic m");

		to.getItems().add("cubic m");
		to.getItems().add("cubic dm");
		to.getItems().add("cubic cm");
		to.getItems().add("cubic mm");
		to.getItems().add("hl");
		to.getItems().add("l");
		to.getItems().add("dl");
		to.getItems().add("cl");
		to.getItems().add("ml");
		to.getItems().add("cubic ft");
		to.getItems().add("cubic inch");
		to.getItems().add("cubic yard");
		to.getItems().add("Acre-foot af");
		to.setValue("cubic m");

		from.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if(newValue.equals("cubic m"))
				{
					b1=true;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;b12=false;b13=false;
				}
				else if(newValue.equals("cubic dm"))
				{
					b1=false;b2=true;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;b12=false;b13=false;
				}
				else if(newValue.equals("cubic cm"))
				{
					b1=false;b2=false;b3=true;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;b12=false;b13=false;
				}else if(newValue.equals("cubic mm"))
				{
					b1=false;b2=false;b3=false;b4=true;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;b12=false;b13=false;
				}else if(newValue.equals("hl"))
				{
					b1=false;b2=false;b3=false;b4=false;b5=true;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;b12=false;b13=false;
				}else if(newValue.equals("l"))
				{
					b1=false;b2=false;b3=false;b4=false;b5=false;b6=true;b7=false;b8=false;b9=false;b10=false;b11=false;b12=false;b13=false;
				}else if(newValue.equals("dl"))
				{
					b1=false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=true;b8=false;b9=false;b10=false;b11=false;b12=false;b13=false;
				}else if(newValue.equals("cl"))
				{
					b1=false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=true;b9=false;b10=false;b11=false;b12=false;b13=false;
				}else if(newValue.equals("ml"))
				{
					b1=false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=true;b10=false;b11=false;b12=false;b13=false;
				}else if(newValue.equals("cubic ft"))
				{
					b1=false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=true;b11=false;b12=false;b13=false;
				}else if(newValue.equals("cubic inch"))
				{
					b1=false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=true;b12=false;b13=false;
				}else if(newValue.equals("cubic yard"))
				{
					b1=false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;b12=true;b13=false;
				}
				else if(newValue.equals("Acre-foot af"))
				{
					b1=false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;b12=false;b13=true;
				}
			}
		});

		to.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if(newValue.equals("cubic m"))
				{
					c1=true;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;c12=false;c13=false;
				}
				else if(newValue.equals("cubic dm"))
				{
					c1=false;c2=true;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;c12=false;c13=false;
				}
				else if(newValue.equals("cubic cm"))
				{
					c1=false;c2=false;c3=true;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;c12=false;c13=false;
				}else if(newValue.equals("cubic mm"))
				{
					c1=false;c2=false;c3=false;c4=true;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;c12=false;c13=false;
				}else if(newValue.equals("hl"))
				{
					c1=false;c2=false;c3=false;c4=false;c5=true;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;c12=false;c13=false;
				}else if(newValue.equals("l"))
				{
					c1=false;c2=false;c3=false;c4=false;c5=false;c6=true;c7=false;c8=false;c9=false;c10=false;c11=false;c12=false;c13=false;
				}else if(newValue.equals("dl"))
				{
					c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=true;c8=false;c9=false;c10=false;c11=false;c12=false;c13=false;
				}else if(newValue.equals("cl"))
				{
					c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=true;c9=false;c10=false;c11=false;c12=false;c13=false;
				}else if(newValue.equals("ml"))
				{
					c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=true;c10=false;c11=false;c12=false;c13=false;
				}else if(newValue.equals("cubic ft"))
				{
					c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=true;c11=false;c12=false;c13=false;
				}else if(newValue.equals("cubic inch"))
				{
					c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=true;c12=false;c13=false;
			}else if(newValue.equals("cubic yard"))
				{c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;c12=true;c13=false;
				}
				else if(newValue.equals("Acre-foot af"))
				{
					c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;c12=false;c13=true;
				}

			}
		});
		convert.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Convert1();
			}
		});
	}

	private void areaConverter() {
		from.getItems().add("square km");
		from.getItems().add("Hectare");
		from.getItems().add("Are");
		from.getItems().add("square m");
		from.getItems().add("square decimeter");
		from.getItems().add("square centimeter");
		from.getItems().add("square millimeter");
		from.getItems().add("square micron");
		from.getItems().add("Acre");
		from.getItems().add("square mile");
		from.getItems().add("square yard");
		from.getItems().add("square foot");
		from.getItems().add("square inch");
		from.setValue("square km");

		to.getItems().add("square km");
		to.getItems().add("Hectare");
		to.getItems().add("Are");
		to.getItems().add("square m");
		to.getItems().add("square decimeter");
		to.getItems().add("square centimeter");
		to.getItems().add("square millimeter");
		to.getItems().add("square micron");
		to.getItems().add("Acre");
		to.getItems().add("square mile");
		to.getItems().add("square yard");
		to.getItems().add("square foot");
		to.getItems().add("square inch");
		to.setValue("square km");

		from.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

				if(newValue.equals("square km"))
				{
					b1=true;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;b12=false;b13=false;
				}
			    else if(newValue.equals("Hectare"))
				{
					b1=false;b2=true;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;b12=false;b13=false;

				}
				else if(newValue.equals("Are"))
				{
					b1=false;b2=false;b3=true;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;b12=false;b13=false;

				}
				else if(newValue.equals("square m"))
				{
					b1=false;b2=false;b3=false;b4=true;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;b12=false;b13=false;

				}
				else if(newValue.equals("square decimeter"))
				{
					b1=false;b2=false;b3=false;b4=false;b5=true;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;b12=false;b13=false;

				}
				else if(newValue.equals("square centimeter"))
				{
					b1=false;b2=false;b3=false;b4=false;b5=false;b6=true;b7=false;b8=false;b9=false;b10=false;b11=false;b12=false;b13=false;

				}
				else if(newValue.equals("square millimeter"))
				{
					b1=false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=true;b8=false;b9=false;b10=false;b11=false;b12=false;b13=false;

				}
				else if(newValue.equals("square micron"))
				{
					b1=false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=true;b9=false;b10=false;b11=false;b12=false;b13=false;

				}
				else if(newValue.equals("Acre"))
				{
					b1=false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=true;b10=false;b11=false;b12=false;b13=false;

				}else if(newValue.equals("square mile"))
				{
					b1=false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=true;b11=false;b12=false;b13=false;

				}else if(newValue.equals("square yard"))
				{
					b1=false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=true;b12=false;b13=false;

				}
				else if(newValue.equals("square foot"))
				{
					b1=false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;b12=true;b13=false;

				}
				else if(newValue.equals("square inch"))
				{
					b1=false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;b12=false;b13=true;

				}

			}
		});

		to.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if(newValue.equals("square km"))
				{
					c1=true;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;c12=false;c13=false;
				}
				else if(newValue.equals("Hectare"))
				{
					c1=false;c2=true;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;c12=false;c13=false;
				}
				else if(newValue.equals("Are"))
				{
					c1=false;c2=false;c3=true;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;c12=false;c13=false;
				}
				else if(newValue.equals("square m"))
				{
					c1=false;c2=false;c3=false;c4=true;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;c12=false;c13=false;
				}
				else if(newValue.equals("square decimeter"))
				{
					c1=false;c2=false;c3=false;c4=false;c5=true;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;c12=false;c13=false;
				}
				else if(newValue.equals("square centimeter"))
				{
					c1=false;c2=false;c3=false;c4=false;c5=false;c6=true;c7=false;c8=false;c9=false;c10=false;c11=false;c12=false;c13=false;
				}
				else if(newValue.equals("square millimeter"))
				{
					c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=true;c8=false;c9=false;c10=false;c11=false;c12=false;c13=false;
				}
				else if(newValue.equals("square micron"))
				{
					c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=true;c9=false;c10=false;c11=false;c12=false;c13=false;
				}
				else if(newValue.equals("Acre"))
				{
					c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=true;c10=false;c11=false;c12=false;c13=false;
				}else if(newValue.equals("square mile"))
				{
					c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=true;c11=false;c12=false;c13=false;
				}else if(newValue.equals("square yard"))
				{
					c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=true;c12=false;c13=false;
				}
				else if(newValue.equals("square foot"))
				{
					c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;c12=true;c13=false;
				}
				else if(newValue.equals("square inch"))
				{
					c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;c12=false;c13=true;
				}

			}

		});

		convert.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("fvdf");
				Convert1();
			}
		});


	}

	private void temperatureConverter()
	{from.getItems().add("Celcius");
		from.getItems().add("Fahrenheit");
		from.getItems().add("Kelvin");
		from.setValue("Celcius");

		to.getItems().add("Celcius");
		to.getItems().add("Fahrenheit");
		to.getItems().add("Kelvin");
		to.setValue("Celcius");

		from.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (newValue.equals("Celcius")) {
					{b1 = true;b2=false;b3=false;}
				} else if (newValue.equals("Fahrenheit")) {
					{b2 = true;b1=false;b3=false;}
				} else if (newValue.equals("Kelvin")) {
					{b1 = false;b2=false;b3=true;}
				}
			}
		});
		to.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (newValue.equals("Celcius")) {
					{c1 = true;c2=false;c3=false;}
				} else if (newValue.equals("Fahrenheit")) {
					{c2 = true;c1 =false;c3=false;}
				} else if (newValue.equals("Kelvin")) {
					{c1 = false;c2=false;c3=true;}
				}
			}
		});

		convert.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("sdfsd");
				Convert1();
			}
		});


	}
	private void massConverter()
	{
		from.getItems().add("Kg");
		from.getItems().add("Tonne");
		from.getItems().add("Grams");
		from.getItems().add("Milligrams");
		from.getItems().add("Micrograms");
		from.getItems().add("Quintal");
		from.getItems().add("Pound");
		from.getItems().add("Ounce");
		from.getItems().add("Carat");
		from.getItems().add("Grain");
		from.getItems().add("Long ton");

		from.setValue("Kg");
		to.getItems().add("Kg");
		to.getItems().add("Tonne");
		to.getItems().add("Grams");
		to.getItems().add("Milligrams");
		to.getItems().add("Micrograms");
		to.getItems().add("Quintal");
		to.getItems().add("Pound");
		to.getItems().add("Ounce");
		to.getItems().add("Carat");
		to.getItems().add("Grain");
		to.getItems().add("Long ton");
		to.setValue("Kg");

		from.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (newValue.equals("Kg")) {
					b1 = true;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;
					System.out.println(b1);
				}else if(newValue.equals("Tonne"))
				{
					b1 = false;b2=true;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;
				}
				else if (newValue.equals("Grams")) {
					b1 = false;b2=false;b3=true;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;}
				else if (newValue.equals("Milligrams")) {
					b1 = false;b2=false;b3=false;b4=true;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;
				} else if (newValue.equals("Micrograms")) {
					b1 = false;b2=false;b3=false;b4=true;b5=true;b6=false;b7=false;b8=false;b9=false;b10=false;b11=false;
				} else if (newValue.equals("Quintal")) {
					b1 = false;b2=false;b3=false;b4=false;b5=false;b6=true;b7=false;b8=false;b9=false;b10=false;b11=false;}
				else if (newValue.equals("Pound")) {
					b1 = false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=true;b8=false;b9=false;b10=false;b11=false;}
				else if (newValue.equals("Ounce")) {
					b1 = false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=true;b9=false;b10=false;b11=false;
				} else if (newValue.equals("Carat")) {
					b1 = false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=true;b10=false;b11=false;
				} else if (newValue.equals("Grain")) {
					b1 = false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=true;b11=false;
				} else if (newValue.equals("Long ton")) {
					b1 = false;b2=false;b3=false;b4=false;b5=false;b6=false;b7=false;b8=false;b9=false;b10=false;b11=true;
				}
			}
		});

		to.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

				if(newValue.equals("Kg"))
				{
					c1=true;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;
				}
				else if(newValue.equals("Tonne"))
				{
					c1=false;c2=true;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;}
				else if (newValue.equals("Grams")) {
					c1=false;c2=false;c3=true;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;
				}
				else if (newValue.equals("Milligrams")) {
					c1=false;c2=false;c3=false;c4=true;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;}
				else if (newValue.equals("Micrograms")) {
					c1=false;c2=false;c3=false;c4=false;c5=true;c6=false;c7=false;c8=false;c9=false;c10=false;c11=false;
				} else if (newValue.equals("Quintal")) {
					c1=false;c2=false;c3=false;c4=false;c5=false;c6=true;c7=false;c8=false;c9=false;c10=false;c11=false;
				} else if (newValue.equals("Pound")) {
					c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=true;c8=false;c9=false;c10=false;c11=false;
				} else if (newValue.equals("Ounce")) {
					c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=true;c9=false;c10=false;c11=false;
				} else if (newValue.equals("Carat")) {
					c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=true;c10=false;c11=false;
				} else if (newValue.equals("Grain")) {
					c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=true;c11=false;
				} else if (newValue.equals("Long ton")) {
					c1=false;c2=false;c3=false;c4=false;c5=false;c6=false;c7=false;c8=false;c9=false;c10=false;c11=true;
				}

			}
		});

		convert.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Convert1();
			}
		});
	}

	public void Convert1() {
		String Unit = "", result="";

		if(b) //temperature
		{
			System.out.println(8678);
			//tempCon();
			//first i will convert every reading to celcius
			String tempS = Input.getText();
			try {
				Double temp = Double.parseDouble(tempS);
			double intermmediate = 0, finalTemp = 0;
			//System.out.println(b1 + " " + b2 + " " + b3 + " " + c1 + " " + c2 + " " + c3);

				if (b1) {   //System.out.println(intermmediate);
					intermmediate = temp;    //b1 is true when celcius is choosen;
					//System.out.println(intermmediate);
				} else if (b2) {   //System.out.println(intermmediate);
					intermmediate = (temp - 32);   //b2 is true when fahrenheit is choosen;
					intermmediate = (intermmediate * 5) / 9;
					//System.out.println(intermmediate);
				} else if (b3) {
					//System.out.println(intermmediate);
					intermmediate = temp - 273.15;   //b3 is true when kelvin is choosen;
					//  System.out.println(intermmediate);
				}

				if (c1) {
					// System.out.println(finalTemp);
					finalTemp = intermmediate;
					Unit = "C";//c1 is true when we choose to convert in celcius
					//System.out.println(finalTemp);
				} else if (c2) {

					//System.out.println(finalTemp);
					finalTemp = (intermmediate * 1.8) + 32;  //c2 is true when we choose to convert in fahrenheit
					Unit = "F";
					// System.out.println(finalTemp);
				} else if (c3) {
					//System.out.println(finalTemp);
					finalTemp = (intermmediate) + 273.15;  //c3 is true when we choose to convert in Kelvin
					Unit = "K";
					//System.out.println(finalTemp);
				}
				result = finalTemp + Unit;
				System.out.println(result);
				Alert le=new Alert(Alert.AlertType.CONFIRMATION);
				le.setTitle("Result!!");
				le.setContentText(result);
				le.show();

			}catch (Exception ex){error();}
		}
		else if(m) //for mass conversion
		{
			String massS=Input.getText();
			try {
				double mass = Double.parseDouble(massS);
				double intermmediate = 0, finalmass = 0;
				//System.out.println(massS);
				//System.out.println(b1+" "+b2+" "+b3+" "+b4+" "+b5+" "+b6+" "+b7+" "+b8+" "+b9+" "+b10+" "+b11);
				//System.out.println(c1+" "+c2+" "+c3+" "+c4+" "+c5+" "+c6+" "+c7+" "+c8+" "+c9+" "+c10+" "+c11);
				//first i will convert every mass into Kg;

				if (mass < 0) {
					warning1();
				} else {
					if (b1)   //b1 is true for kg choosen
					{
						intermmediate = mass;
						System.out.println(intermmediate);
					} else if (b2)   //b2 is true for Tonne choosen
					{
						intermmediate = 1000 * mass;
						System.out.println(intermmediate);
					} else if (b3)   //b3 is true for Grams choosen
					{
						intermmediate = mass / Math.pow(10, 3);
						System.out.println(intermmediate);
					} else if (b4)   //b4 is true for milligrams choosen
					{
						intermmediate = mass / Math.pow(10, 6);
						System.out.println(intermmediate);
					} else if (b5)   //b5 is true for  micrograms choosen
					{
						intermmediate = mass / Math.pow(10, 9);
						System.out.println(intermmediate);
					} else if (b6)   //b6 is true for Quintal choosen
					{
						intermmediate = 100 * mass;
						System.out.println(intermmediate);
					} else if (b7)   //b7 is true for Pound choosen
					{
						intermmediate = (0.45359237) * mass;
						System.out.println(intermmediate);
					} else if (b8)   //b8 is true for ounce choosen
					{
						intermmediate = (0.0283495231) * mass;
						System.out.println(intermmediate);
					} else if (b9)   //b9 is true for Carat choosen
					{
						intermmediate = (0.0002) * mass;
						System.out.println(intermmediate);
					} else if (b10)   //b10 is true for Grain choosen
					{
						intermmediate = (6.47981) * mass;
						intermmediate = intermmediate / Math.pow(10, 5);
						System.out.println(intermmediate);
					} else if (b11)   //b is true for Long ton choosen
					{
						intermmediate = (1016.04691) * mass;
						System.out.println(intermmediate);
					}

					if (c1)   //c is true for  Kg choosen
					{
						finalmass = intermmediate;
						Unit = "Kg";
						System.out.println(finalmass);
					} else if (c2)   //c is true for  Tonne choosen
					{
						finalmass = (0.001) * intermmediate;
						Unit = "t";
						System.out.println(finalmass);
					} else if (c3)   //c is true for Grmas choosen
					{
						finalmass = (1000) * intermmediate;
						Unit = "g";
						System.out.println(finalmass);
					} else if (c4)   //c is true for Milligrams choosen
					{
						finalmass = Math.pow(10, 6) * intermmediate;
						Unit = "mg";
						System.out.println(finalmass);
					} else if (c5)   //c is true for micrograms choosen
					{
						finalmass = Math.pow(10, 9) * intermmediate;
						Unit = "micro-gram";
						System.out.println(finalmass);
					} else if (c6)   //c is true for quintal choosen
					{
						finalmass = (0.01) * intermmediate;
						Unit = "q";
						System.out.println(finalmass);
					} else if (c7)   //c is true for pound choosen
					{
						finalmass = (2.20462262) * intermmediate;
						Unit = "lb";
						System.out.println(finalmass);
					} else if (c8)   //c is true for Ounce choosen
					{
						finalmass = (35.2739619) * intermmediate;
						Unit = "oz";
						System.out.println(finalmass);
					} else if (c9)   //c is true for carat choosen
					{
						finalmass = (5000) * intermmediate;
						Unit = "ct";
						System.out.println(finalmass);
					} else if (c10)   //c is true for grain choosen
					{
						finalmass = (15432.3584) * intermmediate;
						Unit = "gr";
						System.out.println(finalmass);
					} else if (c11)   //c is true for  long ton choosen
					{
						finalmass = (0.000984206528) * intermmediate;
						Unit = "l.t";
						System.out.println(finalmass);
					}

					result = finalmass + Unit;
					Alert le=new Alert(Alert.AlertType.CONFIRMATION);
					le.setTitle("Result!!");
					le.setContentText(result);
					le.show();

				}
			}
		catch (Exception e){error();};
		}

		else if(a) {
			String areaS = Input.getText();
			try {double area = Double.parseDouble(areaS);
			double intermmediate = 0, finalArea = 0;
			//System.out.println(b1+" "+b2+" "+b3+" "+b4+" "+b5+" "+b6+" "+b7+" "+b8+" "+b9+" "+b10+" "+b11);
			//System.out.println(c1+" "+c2+" "+c3+" "+c4+" "+c5+" "+c6+" "+c7+" "+c8+" "+c9+" "+c10+" "+c11);
				if (area < 0) {
					warning2();
				} else {
					if (b1)  //choosen for sq km
					{
						intermmediate = area;
					} else if (b2)  //true for hectare
					{
						intermmediate = area / Math.pow(10, 2);
					} else if (b3)  //true for  Are
					{
						intermmediate = area / Math.pow(10, 4);
					} else if (b4)  //true for metre sq
					{
						intermmediate = area / Math.pow(10, 6);
					} else if (b5)  //true for decimeter sq
					{
						intermmediate = area / Math.pow(10, 8);
					} else if (b6)  //true for centimeter sq
					{
						intermmediate = area / Math.pow(10, 10);
					} else if (b7)  //true for millimeter sq
					{
						intermmediate = area / Math.pow(10, 12);
					} else if (b8)  //true for micron sq
					{
						intermmediate = area / Math.pow(10, 18);

					} else if (b9)  //true for Acre
					{
						intermmediate = (0.0040468) * area;
					} else if (b10)  //true for mile sq
					{
						intermmediate = (2.58998811) * area;
					} else if (b11)  //true for yard sq
					{
						intermmediate = area / Math.pow(10, 7);
						intermmediate = intermmediate * (8.3612736);

					} else if (b12)  //true for foot sq
					{
						intermmediate = area / Math.pow(10, 8);
						intermmediate = intermmediate * (9.290304);

					} else if (b13)  //true for inch sq
					{
						intermmediate = area / Math.pow(10, 10);
						intermmediate = intermmediate * (6.4516);
					}

					if (c1)  //true for sq. km
					{
						finalArea = intermmediate;
						Unit = "sq Km";
					} else if (c2)  //true for Hectrae
					{
						finalArea = (100) * intermmediate;
						Unit = "ha";
					} else if (c3)  //true for Are
					{
						finalArea = (Math.pow(10, 4)) * intermmediate;
						Unit = "a";
					} else if (c4)  //true for m^2
					{
						finalArea = (Math.pow(10, 6)) * intermmediate;
						Unit = "sq m";
					} else if (c5)  //true for dm^2
					{
						finalArea = (Math.pow(10, 8)) * intermmediate;
						Unit = "sq dm";
					} else if (c6)  //true for cm^2
					{
						finalArea = (Math.pow(10, 10)) * intermmediate;
						Unit = "sq cm";
					} else if (c7)  //true for mm
					{
						finalArea = (Math.pow(10, 12)) * intermmediate;
						Unit = "sq mm";
					} else if (c8)  //true for micron sq
					{
						finalArea = (Math.pow(10, 18)) * intermmediate;
						Unit = "sq micron";
					} else if (c9)  //true for Acre
					{
						finalArea = (247.105407) * intermmediate;
						Unit = "ac";
					} else if (c10)  //true for
					{
						finalArea = (0.386102159) * intermmediate;
						Unit = "sq mile";
					} else if (c11)  //true for
					{
						finalArea = (1195990.05) * intermmediate;
						Unit = "sq yd";
					} else if (c12)  //true for feet
					{
						finalArea = (10763910.4) * intermmediate;
						Unit = "sq ft";
					} else if (c13)  //true for inch
					{
						finalArea = (Math.pow(10, 9)) * intermmediate;
						finalArea = finalArea * (1.55);
						Unit = "sq in";
					}
					result = finalArea + " " + Unit;
					Alert le=new Alert(Alert.AlertType.CONFIRMATION);
					le.setTitle("Result!!");
					le.setContentText(result);
					le.show();
				}
			}catch (Exception e){error();}
		}
       else if(v)
		{  //converting into cubic metre;
			String volumeS=Input.getText();
			try {double vol=Double.parseDouble(volumeS);
			double intermmediate=0,finalVol=0;
          		if(vol<0)
            {
            	warning3();
            }
            else {
	            if (b1) //true for meter cb metre
	            {
		            intermmediate = vol;
	            } else if (b2)// true for cb dm
	            {
		            intermmediate = (0.001) * vol;
	            } else if (b3)// true for cb cm
	            {
		            intermmediate = vol / Math.pow(10, 6);
	            } else if (b4)// true for cb mm
	            {
		            intermmediate = vol / Math.pow(10, 9);
	            } else if (b5)// true for hl
	            {
		            intermmediate = vol / Math.pow(10, 1);
	            } else if (b6)// true for l
	            {
		            intermmediate = vol / Math.pow(10, 3);
	            } else if (b7)// true for dl
	            {
		            intermmediate = vol / Math.pow(10, 4);
	            } else if (b8)// true for cl
	            {
		            intermmediate = vol / Math.pow(10, 5);
	            } else if (b9)// true for ml
	            {
		            intermmediate = vol / Math.pow(10, 6);
	            } else if (b10)// true for cb foot
	            {
		            intermmediate = (0.0283168466) * vol;
	            } else if (b11)// true for cb in
	            {
		            intermmediate = (1.6387064) * vol;
		            intermmediate = intermmediate / Math.pow(10, 5);
	            } else if (b12)// true for cb yard
	            {
		            intermmediate = (0.764554858) * vol;
	            } else if (b13)// true for cb Acre-foot
	            {
		            intermmediate = (1234) * vol;
	            }

	            if (c1)  //true for cb m

	            {
		            finalVol = (1) * intermmediate;
		            Unit = "cb m";
	            } else if (c2)  //true for cb dm
	            {
		            finalVol = (Math.pow(10, 3)) * intermmediate;
		            Unit = "cb dm";
	            } else if (c3)  //true for cb cm
	            {
		            finalVol = (Math.pow(10, 6)) * intermmediate;
		            Unit = "cb m";
	            } else if (c4)  //true for cb mm
	            {
		            finalVol = (Math.pow(10, 9)) * intermmediate;
		            Unit = "cb mm";
	            } else if (c5)  //true for  hl
	            {
		            finalVol = (10) * intermmediate;
		            Unit = "hl";
	            } else if (c6)  //true for l
	            {
		            finalVol = (Math.pow(10, 3)) * intermmediate;
		            Unit = "l";
	            } else if (c7)  //true for dl
	            {
		            finalVol = (Math.pow(10, 4)) * intermmediate;
		            Unit = "dl";
	            } else if (c8)  //true for cl
	            {
		            finalVol = (Math.pow(10, 5)) * intermmediate;
		            Unit = "cl";
	            } else if (c9)  //true for ml
	            {
		            finalVol = (Math.pow(10, 6)) * intermmediate;
		            Unit = "ml";
	            } else if (c10)  //true for cb ft
	            {
		            finalVol = (35.3146667) * intermmediate;
		            Unit = "cb ft";
	            } else if (c11)  //true for cb in
	            {
		            finalVol = (61023.7441) * intermmediate;
		            Unit = "cb in";
	            } else if (c12)  //true for cb yd
	            {
		            finalVol = (1.30795062) * intermmediate;
		            Unit = "cb yd";
	            } else if (c13)  //true for cb af
	            {
		            finalVol = (0.000810372771) * intermmediate;
		            Unit = "cb af";
	            }
	            result = finalVol + " " + Unit;
		            Alert le=new Alert(Alert.AlertType.CONFIRMATION);
		            le.setTitle("Result!!");
		            le.setContentText(result);
		            le.show();

	            }
		}catch(Exception e){error();}
		}

       else if(l) {  //intermmediate into kilo metre;
			String lengthS = Input.getText();
			try {double length = Double.parseDouble(lengthS);
			double intermmediate = 0;
			double finalLength = 0;

			if (length < 0) {
					warning4();
				}
			else{
				if (b1) //true for kilometre
				{
					intermmediate = (1) * length;
				}
				if (b2) //true for metre
				{
					intermmediate = length / (Math.pow(10, 3));
				}
				if (b3) //true for decimetre
				{
					intermmediate = length / (Math.pow(10, 4));
				}
				if (b4) //true for centimetre
				{
					intermmediate = length / (Math.pow(10, 5));
				}
				if (b5) //true for mm
				{
					intermmediate = length / (Math.pow(10, 6));
				}
				if (b6) //true for micro metre
				{
					intermmediate = length / (Math.pow(10, 9));
				}
				if (b7) //true for nano mtre
				{
					intermmediate = length / (Math.pow(10, 12));
				}
				if (b8) //true for pico metre
				{
					intermmediate = length / (Math.pow(10, 15));
				}
				if (b9) //true nautiacal mile
				{
					intermmediate = (1.852) * length;
				}
				if (b10) //true for mile
				{
					intermmediate = (1.609344) * length;
				}
				if (b11) //true for yard
				{
					intermmediate = (0.0009144) * length;
				}
				if (b12) //true for foot
				{
					intermmediate = (0.0003048) * length;
				}
				if (b13) //true for inch
				{
					intermmediate = (2.54) * length;
					intermmediate = intermmediate / (Math.pow(10, 5));
				}

				if (c1) //true for
				{
					finalLength = (1) * intermmediate;
					Unit = "km";
				} else if (c2) //true for
				{
					finalLength = (Math.pow(10, 3)) * intermmediate;
					Unit = "m";
				} else if (c3) //true for
				{
					finalLength = (Math.pow(10, 4)) * intermmediate;
					Unit = "dm";
				} else if (c4) //true for
				{
					finalLength = (Math.pow(10, 5)) * intermmediate;
					Unit = "cm";
				} else if (c5) //true for
				{
					finalLength = (Math.pow(10, 6)) * intermmediate;
					Unit = "mm";
				} else if (c6) //true for
				{
					finalLength = (Math.pow(10, 9)) * intermmediate;
					Unit = "micro-metre";
				} else if (c7) //true for
				{
					finalLength = (Math.pow(10, 12)) * intermmediate;
					Unit = "nm";
				} else if (c8) //true for
				{
					finalLength = (Math.pow(10, 15)) * intermmediate;
					Unit = "pm";
				} else if (c9) //true for
				{
					finalLength = (0.539956803) * intermmediate;
					Unit = "nmi";
				} else if (c10) //true for
				{
					finalLength = (0.6213711) * intermmediate;
					Unit = "mi";
				} else if (c11) //true for
				{
					finalLength = (1093.6133) * intermmediate;
					Unit = "yd";
				} else if (c12) //true for
				{
					finalLength = (3280.8399) * intermmediate;
					Unit = "ft";
				} else if (c13) //true for
				{
					finalLength = (39370.0787) * intermmediate;
					Unit = "in";
				}
				result = finalLength + " " + Unit;
				Alert le=new Alert(Alert.AlertType.CONFIRMATION);
				le.setTitle("Result!!");
				le.setContentText(result);
				le.show();

			}
			}catch (Exception e){error();}
		}

       changeField.setOnAction(new EventHandler<ActionEvent>() {
	       @Override
	       public void handle(ActionEvent event) {
		       from.clipProperty();
		       to.clipProperty();
	       }
       });

	}



	private void warning4() {
		Alert wa=new Alert(Alert.AlertType.ERROR);
		wa.setTitle("Error");
		wa.setContentText("Length can not be negative...Please check your Input and try again!!");
		wa.showAndWait();

	}

	private void warning3() {
		Alert wa=new Alert(Alert.AlertType.ERROR);
		wa.setTitle("Error");
		wa.setContentText("Volume can not be negative...Please check your Input and try again!!");
		wa.showAndWait();

	}



	private void warning2() {

		Alert wa1=new Alert(Alert.AlertType.ERROR);
		wa1.setTitle("Error");
		wa1.setContentText("Area can not be negative...Please check your Input and try again!!");
		wa1.showAndWait();
	}

	private void warning1() {

		Alert wa=new Alert(Alert.AlertType.ERROR);
		wa.setTitle("Error");
		wa.setContentText("Mass can not be negative...Please check your Input and try again!!");
		wa.showAndWait();
	}

	private void error() {
	   System.out.println(56);
	   Alert a1=new Alert(Alert.AlertType.WARNING);
	   a1.setTitle("Error");
	   a1.setContentText("The value u have entered for choosen fielsd is not valid..Please re-check your Input and try again ");
	   a1.show();
	}
}

