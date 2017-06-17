package calculator;

import java.awt.*;
import java.awt.event.*;

public class Calc2 extends Frame implements ActionListener {
	
	double storageValue = 0;
	String lastOperator = "";
	String newOperator = "";
	String recentString = "";
	String plusMinus = "+";
	Boolean ansLabel = false;
	// Text Fields
//	TextField inputText = new TextField();
	
	// Labels
	Label recentsLabel = new Label("");
	Label inputText = new Label("0");
	
	// Buttons 
	
	Button btnEquals = new Button("=");
	Button btnAdd = new Button("+");
	Button btnSubtract = new Button("-");
	Button btnMultiply = new Button("x");
	Button btnDivide = new Button("/");
	Button btnDecimal = new Button(".");
	Button btnPlusMinus = new Button("±");
	Button btnClear = new Button("CE");
	Button btnClearAll = new Button("C");
	Button btnBackspace = new Button("<");
	
	// Array
//		String[] buttons = {"btn0","btn1","btn2","btn3","btn4","btn5","btn6","btn7","btn8","btn9","btnDecimal","btnPlusMinus"};
	Button [] button = new Button[10];
	
	Calc2() {
		
		
		super("MyCalculator");
		Panel upperPanel = new Panel();
		upperPanel.setLayout(null);
		Panel gridPanel = new Panel();
		gridPanel.setLayout(new GridLayout(5,4));
		
		// Add to upper Panel Grid
		upperPanel.add(recentsLabel);
		upperPanel.add(inputText);
		
		// Add Fonts
		Font fontBold = new Font("Arial",Font.BOLD,18);
		Font font = new Font("Arial",Font.PLAIN,16);
		Font textBoxFont = new Font("Arial", Font.PLAIN, 20);
		inputText.setFont(textBoxFont);
		
		
		// Adding fonts to buttons
		btnPlusMinus.setFont(fontBold);
		btnDecimal.setFont(fontBold);
		
		btnClear.setFont(font);
		btnClearAll.setFont(font);
		btnAdd.setFont(font);
		btnSubtract.setFont(font);
		btnMultiply.setFont(font);
		btnDivide.setFont(font);
		btnEquals.setFont(font);
		btnBackspace.setFont(font);
		
		// Adding Colur to Buttons
		Color lightGrey = new Color(250,250,250);
		Color darkGrey = new Color(200,200,200);
		
		for(int i = 0; i < button.length; i++){
            button[i] = new Button(""+i);
            button[i].setFont(fontBold);
            button[i].setBackground(lightGrey);
            button[i].addActionListener(this);
           
        }
	
		// Adding Action Listner
		
		btnEquals.addActionListener(this);
		btnAdd.addActionListener(this);
		btnSubtract.addActionListener(this);
		btnMultiply.addActionListener(this);
		btnDivide.addActionListener(this);
		btnClear.addActionListener(this);
		btnClearAll.addActionListener(this);
		btnBackspace.addActionListener(this);
		btnDecimal.addActionListener(this);
		btnPlusMinus.addActionListener(this);
		
		// Add Buttons to Grid Panel
		gridPanel.add(btnClearAll);
		gridPanel.add(btnClear);
		gridPanel.add(btnBackspace);
		gridPanel.add(btnDivide);
		gridPanel.add(button[7]);
		gridPanel.add(button[8]);
		gridPanel.add(button[9]);
		gridPanel.add(btnMultiply);
		gridPanel.add(button[4]);
		gridPanel.add(button[5]);
		gridPanel.add(button[6]);
		gridPanel.add(btnSubtract);
		gridPanel.add(button[1]);
		gridPanel.add(button[2]);
		gridPanel.add(button[3]);
		gridPanel.add(btnAdd);
		gridPanel.add(btnPlusMinus);
		gridPanel.add(button[0]);
		gridPanel.add(btnDecimal);
		gridPanel.add(btnEquals);
		
		// Setting Positions
		gridPanel.setBounds(0, 105, 250, 200);
		upperPanel.setBounds(5, 5, 250, 100);
		recentsLabel.setBounds(0, 30, 230, 30);
		inputText.setBounds(0, 60, 230, 40);
//		inputText.setBackground(lightGrey);
//		recentsLabel.setBackground(darkGrey);
		recentsLabel.setAlignment(Label.RIGHT);
		inputText.setAlignment(Label.RIGHT);
		
		// Setting Colours
		btnEquals.setBackground(Color.GRAY);
		btnEquals.setForeground(Color.WHITE);
		btnPlusMinus.setBackground(lightGrey);
		btnDecimal.setBackground(lightGrey);
		
		// Add to frame
		add(gridPanel);
		add(upperPanel);
		
		setResizable(false);
		setLayout(null);
		setSize(250,308);
		setVisible(true);
	}
	
	public void setInputText(String a) 
	{
		String getInputValue = inputText.getText();
		if(ansLabel)
		{
			inputText.setText("");
			inputText.setText(a);
			ansLabel = false;
		}
		else {
			if(getInputValue == "0")
			{
				inputText.setText(a);
			}
			else {
				inputText.setText(getInputValue+a);
			}
		}
		//lastOperator = null;
	}
	
	public void performOperation(String opr)
	{
		String recent = recentsLabel.getText();
		String inputValue = inputText.getText();
		switch(opr)
		{
			case "+":
				storageValue += Double.valueOf(inputValue);
				recentString = recent + inputValue+" " + newOperator;
				recentsLabel.setText(recentString);
				inputText.setText(String.valueOf(storageValue));
				ansLabel = true;
				break;
			case "-":
				if(storageValue == 0)
				{
					storageValue = Double.valueOf(inputValue);
				}
				else{
					storageValue -= Double.valueOf(inputValue);
				}
				recentString = recent + inputValue+" " + newOperator;
				recentsLabel.setText(recentString);
				inputText.setText(String.valueOf(storageValue));
				ansLabel = true;
				break;
			case "/":
				if(storageValue == 0)
				{
					storageValue = Double.valueOf(inputValue);
				}
				else{
					storageValue /= Double.valueOf(inputValue);
				}
				recentString = recent + inputValue+" " + newOperator;
				recentsLabel.setText(recentString);
				inputText.setText(String.valueOf(storageValue));
				ansLabel = true;
				break;
			case "*":
				if(storageValue == 0)
				{
					storageValue = 1;
				}
				storageValue *= Double.valueOf(inputValue);
				recentString = recent + inputValue+" " + newOperator;
				recentsLabel.setText(recentString);
				inputText.setText(String.valueOf(storageValue));
				ansLabel = true;
				break;
		}
	}
	
	public void checkLastOperatorInRecents(char opr)
	{
		String recent = recentsLabel.getText();
		String inputValue = inputText.getText();
		char[] ch=recentString.toCharArray();  
		int lastOpr = ch.length-1;
		if(opr != ch[lastOpr])
		{
			ch[lastOpr] = opr;
			recentString = String.valueOf(ch);
			recentsLabel.setText(recentString);
//			performOperation(String.valueOf(lastOperator));

		}
//		else
//		{
//			performOperation(String.valueOf(opr));
//		}
	}
	
	public void plusMinusOperation()
	{
		String inputValue = inputText.getText();
		char[] ch=inputValue.toCharArray();
		if(ch[0] == '-') {
			inputText.setText(String.valueOf(Math.abs(Double.valueOf(inputValue))));
		}
		else if(plusMinus == "-")
		{
			
		}
		else if(plusMinus == "+")
		{
			inputText.setText("-"+inputValue);
		}
	}
	
	public void addOperation(String opr) {
		String recent = recentsLabel.getText();
		String inputValue = inputText.getText();
		if(recentString == "")
		{
			recentString = String.valueOf(inputValue+" "+opr);
			lastOperator = opr;
		}
		
		if(!ansLabel)
		{
			newOperator = opr;
			performOperation(lastOperator);
			lastOperator = opr;
		}
		else
		{
			lastOperator = opr;
			switch(opr)
			{
				case "":
					break;
				case "+":
					checkLastOperatorInRecents('+');
					break;
				case "-":
					checkLastOperatorInRecents('-');
					break;
				case "/":
					checkLastOperatorInRecents('/');
					break;
				case "*":
					checkLastOperatorInRecents('*');
					break;
			}
		}
		
	}
	
	public void clearAll() {
		storageValue= 0;
		recentString = "";
		recentsLabel.setText("");
	}
	
	public void backspace()
	{
		String inputValue = inputText.getText();
		if(inputValue.length() == 1)
		{
			inputText.setText("0");
		}
		else {
			
			String changedInputValue = inputValue.substring(0, inputValue.length()-1);
			inputText.setText(changedInputValue);
		}
	}
	
	public void setDecimal() {
		String inputValue = inputText.getText();
//		if(inputValue.length() == 0)
//		{
//			setInputText("0.");
//		}
//		else {
			char[] ch=inputValue.toCharArray();
			boolean hasDecimal = false;
			for(int i=0; i<inputValue.length(); i++)
			{
				if(ch[i] == '.')
				{
					hasDecimal = true;
				}
			}
			if(!hasDecimal)
			{
				inputText.setText(inputValue+".");
			}
//		}
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getSource() == button[0])
		{
			setInputText("0");
		} 
		else if(ae.getSource() == button[1])
		{
			setInputText("1");
		}
		else if(ae.getSource() == button[2])
		{
			setInputText("2");
		}
		else if(ae.getSource() == button[3])
		{
			setInputText("3");
		}
		else if(ae.getSource() == button[4])
		{
			setInputText("4");
		}
		else if(ae.getSource() == button[5])
		{
			setInputText("5");
		}
		else if(ae.getSource() == button[6])
		{
			setInputText("6");
		}
		else if(ae.getSource() == button[7])
		{
			setInputText("7");
		}
		else if(ae.getSource() == button[8])
		{
			setInputText("8");
		}
		else if(ae.getSource() == button[9])
		{
			setInputText("9");
		}
		else if(ae.getSource() == btnDecimal)
		{
			if(!ansLabel)
			{
				setDecimal();
			} else {
				setInputText("0.");
			}
		}
		else if(ae.getSource() == btnClear)
		{
			inputText.setText("0");
		}
		else if(ae.getSource() == btnClearAll)
		{
			inputText.setText("0");
			clearAll();
		}
		else if(ae.getSource() == btnAdd)
		{
			addOperation("+");
		}
		else if(ae.getSource() == btnSubtract)
		{
			addOperation("-");
		}
		else if(ae.getSource() == btnMultiply)
		{
			addOperation("*");
		}
		else if(ae.getSource() == btnDivide)
		{
			addOperation("/");
		}
		else if(ae.getSource() == btnPlusMinus)
		{
			plusMinusOperation();
		}
		else if(ae.getSource() == btnBackspace)
		{
			if(!ansLabel)
			{
				backspace();
			}
		}
		else if(ae.getSource() == btnEquals)
		{
			double inputValue = Double.valueOf(inputText.getText());
			switch(lastOperator)
			{
			case "+":
				storageValue += inputValue;
				inputText.setText(String.valueOf(storageValue));
				clearAll();
				ansLabel = true;
				break;
			case "-":
				storageValue -= inputValue;
				inputText.setText(String.valueOf(storageValue));
				clearAll();
				ansLabel = true;
				break;
			case "/":
				storageValue /= inputValue;
				inputText.setText(String.valueOf(storageValue));
				clearAll();
				ansLabel = true;
				break;
			case "*":
				storageValue *= inputValue;
				inputText.setText(String.valueOf(storageValue));
				clearAll();
				ansLabel = true;
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Calc2 obj = new Calc2();
	}
	
}
