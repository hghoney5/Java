package awt;

import java.awt.*;

public class Forms {

	Forms() {
		
		Frame frame = new Frame("Application Form");
		frame.setLayout(null);
		
		//Labels
		
		Label headingLabel = new Label("APPLICATION FORM");
		Label nameLabel = new Label("Name:");
		Label fathersNameLabel = new Label("Father's Name:");
		Label mothersNameLabel = new Label("Mother's Name:");
		Label addressLabel = new Label("Address:");
		Label genderLabel = new Label("Gender:");
		Label DOBLabel = new Label("Date Of Birth:");
		Label qualificationLabel = new Label("Qualification:");
		Label youHaveYourOwnLabel = new Label("You Have Your Own:");
		Label remarksLabel  = new Label("Remarks:");
		
		//Text Fields
		
		TextField nameTextField = new TextField(20);
		TextField fathersNameTextField = new TextField(20);
		TextField mothersNameTextField = new TextField(20);
		
		TextArea addressTextArea = new TextArea(5,20);
		
		//Checkbox Group
		
		CheckboxGroup genderGroup = new CheckboxGroup();
		Checkbox maleGenderGroup = new Checkbox("Male",true,genderGroup);
		Checkbox femaleGenderGroup = new Checkbox("Female",false,genderGroup);
		
		//Choice in DOB
		
		Choice dayChoice = new Choice();
		Choice monthChoice = new Choice();
		Choice yearChoice = new Choice();
		
		// -- for loops for adding data in DOB Choices
		
		//for loop for day
		for(int d = 1; d<=31; d++) {
			dayChoice.addItem(String.valueOf(d));
		}
		
		// for loop for month
		for(int m = 1; m<=12; m++) {
			monthChoice.addItem(String.valueOf(m));
		}
		
		// for loop for year
		for(int y = 1980; y<=2000; y++) {
			yearChoice.addItem(String.valueOf(y));
		}
		
		// LIST for Qualification
		List qualificationList = new List();
		qualificationList.add("Below Fifth");
		qualificationList.add("Matric");
		qualificationList.add("Senior Secondary");
		qualificationList.add("Graduate");
		
		// Checkboxes 
		
		Checkbox carCheckbox = new Checkbox("Car");
		Checkbox netBankingCheckbox = new Checkbox("Net Banking");
		Checkbox creditCardCheckbox = new Checkbox("Credit Card");
		Checkbox houseCheckbox = new Checkbox("House");
		
		// Text Area for remarks
		TextArea remarksTextArea = new TextArea(5,20);
		
		//Buttons
		Button saveButton = new Button("Save");
		Button resetButton = new Button("Reset");
		
		// SETTING FOR FRAME
		frame.setResizable(false);
		frame.setSize(600,700);
		frame.setVisible(true);
		Font heading = new Font("Arial", Font.BOLD, 22);
		
		
		// Appeareance settings
		headingLabel.setFont(heading);
		Color orange = new Color(236,60,9);
		headingLabel.setForeground(orange);
		Color blue = new Color(15,133,230);
		saveButton.setBackground(blue);
		saveButton.setForeground(Color.WHITE);
		
		// Setting positions
		
		int x = 100;
		int y = 120;
		int width = 155;
		int height = 20;
		int ySpacing = 30;
		int xSpacingFields = 300;
		
		headingLabel.setBounds(170, 40, 250,50);
		
		nameLabel.setBounds(x, y, width, height);
		nameTextField.setBounds(xSpacingFields, y, width, height);
		
		fathersNameLabel.setBounds(x, y+ySpacing, width, height);
		fathersNameTextField.setBounds(xSpacingFields, y+ySpacing, width, height);
		
		mothersNameLabel.setBounds(x, y+(2*ySpacing), width, height);
		mothersNameTextField.setBounds(xSpacingFields, y+(2*ySpacing), width, height);
		
		addressLabel.setBounds(x, y+(3*ySpacing), width, height);
		addressTextArea.setBounds(xSpacingFields, y+(3*ySpacing), width, height+50);
		
		genderLabel.setBounds(x, y+(6*ySpacing), width, height);
		maleGenderGroup.setBounds(xSpacingFields, y+(6*ySpacing), width-90, height);
		femaleGenderGroup.setBounds(xSpacingFields+70, y+(6*ySpacing), width-90, height);
		
		DOBLabel.setBounds(x, y+(7*ySpacing), width, height);
		dayChoice.setBounds(xSpacingFields, y+(7*ySpacing), width-110, height);
		monthChoice.setBounds(xSpacingFields+50, y+(7*ySpacing), width-110, height);
		yearChoice.setBounds(xSpacingFields+100, y+(7*ySpacing), width-100, height);
		
		qualificationLabel.setBounds(x, y+(8*ySpacing), width, height);
		qualificationList.setBounds(xSpacingFields, y+(8*ySpacing), width, height+30);
		
		youHaveYourOwnLabel.setBounds(x, y+(10*ySpacing), width, height);
		carCheckbox.setBounds(xSpacingFields, y+(10*ySpacing), width, height);
		netBankingCheckbox.setBounds(xSpacingFields, y+(11*ySpacing), width, height);
		creditCardCheckbox.setBounds(xSpacingFields, y+(12*ySpacing), width, height);
		houseCheckbox.setBounds(xSpacingFields, y+(13*ySpacing), width, height);
		
		remarksLabel.setBounds(x, y+(14*ySpacing), width, height);
		remarksTextArea.setBounds(xSpacingFields, y+(14*ySpacing), width, height+50);
		
		saveButton.setBounds(xSpacingFields, y+(17*ySpacing), width-100, height);
		resetButton.setBounds(xSpacingFields+70, y+(17*ySpacing), width-100, height);
		
		
		// Adding to Frame
		
		frame.add(headingLabel);
		
		frame.add(nameLabel);
		frame.add(nameTextField);
		
		frame.add(fathersNameLabel);
		frame.add(fathersNameTextField);
		
		frame.add(mothersNameLabel);
		frame.add(mothersNameTextField);
		
		frame.add(addressLabel);
		frame.add(addressTextArea);
		
		frame.add(genderLabel);
		frame.add(maleGenderGroup);
		frame.add(femaleGenderGroup);
		
		frame.add(DOBLabel);
		frame.add(dayChoice);
		frame.add(monthChoice);
		frame.add(yearChoice);
		
		frame.add(qualificationLabel);
		frame.add(qualificationList);
		
		frame.add(youHaveYourOwnLabel);
		frame.add(carCheckbox);
		frame.add(netBankingCheckbox);
		frame.add(creditCardCheckbox);
		frame.add(houseCheckbox);
		
		frame.add(remarksLabel);
		frame.add(remarksTextArea);
		
		frame.add(saveButton);
		frame.add(resetButton);
		
	}
	
	public static void main(String[] args)
	{
		Forms obj = new Forms();
	}
}
