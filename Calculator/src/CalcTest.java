
import static org.junit.jupiter.api.Assertions.*;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testToDouble() {
		Display obj1 = new Display();
		double result;
		obj1.setText("5");
		result = obj1.toDouble(obj1.getText());
		assertEquals(5.0, result);
	}
	//Begin Display coverage
	//Begin Tests for enter
	
	@Test
	void testActionPerformedEnter() {
		Display obj1 = new Display();
		double result = 0.0;
		obj1.setText(null);
		ActionEvent event = new ActionEvent(obj1, 0, "Enter");
		obj1.actionPerformed(event);
		assertEquals(0.0, result);
	}

	@Test
	void testActionPerformedPlus() {
		Display obj1 = new Display();
		double result;
		obj1.setText("5");
		ActionEvent event = new ActionEvent(obj1, 0, "+");
		obj1.actionPerformed(event);
		obj1.setText("2");
		ActionEvent event2 = new ActionEvent(obj1, 1, "Enter");
		obj1.actionPerformed(event2);
		result = obj1.toDouble(obj1.getText());
		assertEquals(7.0, result);
	}

	@Test
	void testActionPerformedMinus() {
		Display obj1 = new Display();
		double result;
		obj1.setText("5");
		ActionEvent event = new ActionEvent(obj1, 0, "-");
		obj1.actionPerformed(event);
		obj1.setText("2");
		ActionEvent event2 = new ActionEvent(obj1, 1, "Enter");
		obj1.actionPerformed(event2);
		result = obj1.toDouble(obj1.getText());
		assertEquals(3.0, result);
	}
	
	@Test
	void testActionPerformedMultiply() {
		Display obj1 = new Display();
		double result;
		obj1.setText("5");
		ActionEvent event = new ActionEvent(obj1, 0, "X");
		obj1.actionPerformed(event);
		obj1.setText("2");
		ActionEvent event2 = new ActionEvent(obj1, 1, "Enter");
		obj1.actionPerformed(event2);
		result = obj1.toDouble(obj1.getText());
		assertEquals(10.0, result);
	}
	
	@Test
	void testActionPerformedDivide() {
		Display obj1 = new Display();
		double result;
		obj1.setText("5");
		ActionEvent event = new ActionEvent(obj1, 0, "/");
		obj1.actionPerformed(event);
		obj1.setText("2");
		ActionEvent event2 = new ActionEvent(obj1, 1, "Enter");
		obj1.actionPerformed(event2);
		result = obj1.toDouble(obj1.getText());
		assertEquals(2.5, result);
	}
	
	@Test
	void testActionPerformedExp() {
		Display obj1 = new Display();
		double result;
		obj1.setText("5");
		ActionEvent event = new ActionEvent(obj1, 0, "EXP");
		obj1.actionPerformed(event);
		obj1.setText("2");
		ActionEvent event2 = new ActionEvent(obj1, 1, "Enter");
		obj1.actionPerformed(event2);
		result = obj1.toDouble(obj1.getText());
		assertEquals(25.0, result);
	}
	//End tests for Enter

	//Begin trig tests
	@Test
	void testActionPerformedPi() {
		Display obj1 = new Display();
		double result;
		ActionEvent event = new ActionEvent(obj1, 0, "\u03C0");
		obj1.actionPerformed(event);
		result = obj1.toDouble(obj1.getText());
		assertEquals(Math.PI, result);
	}
	
	@Test
	void testActionPerformedCos() {
		Display obj1 = new Display();
		double result;
		obj1.setText("5");
		ActionEvent event = new ActionEvent(obj1, 0, "cos");
		obj1.actionPerformed(event);
		result = obj1.toDouble(obj1.getText());
		assertEquals(Math.cos(5), result);
	}
	
	@Test
	void testActionPerformedSin() {
		Display obj1 = new Display();
		double result;
		obj1.setText("5");
		ActionEvent event = new ActionEvent(obj1, 0, "sin");
		obj1.actionPerformed(event);
		result = obj1.toDouble(obj1.getText());
		assertEquals(Math.sin(5), result);
	}
	
	@Test
	void testActionPerformedTan() {
		Display obj1 = new Display();
		double result;
		obj1.setText("5");
		ActionEvent event = new ActionEvent(obj1, 0, "tan");
		obj1.actionPerformed(event);
		result = obj1.toDouble(obj1.getText());
		assertEquals(Math.tan(5), result);
	}
	
	//End trig tests
	
	//Begin misc tests
	@Test
	void testActionPerformedChangeSign() {
		Display obj1 = new Display();
		double result;
		obj1.setText("5");
		ActionEvent event = new ActionEvent(obj1, 0, "+/-");
		obj1.actionPerformed(event);
		result = obj1.toDouble(obj1.getText());
		assertEquals(-5.0, result);
	}
	
	@Test
	void testActionPerformedInverse() {
		Display obj1 = new Display();
		double result;
		obj1.setText("5");
		ActionEvent event = new ActionEvent(obj1, 0, "1/\u0078");
		obj1.actionPerformed(event);
		result = obj1.toDouble(obj1.getText());
		assertEquals(0.2, result);
	}

	
	@Test
	void testActionPerformedSqrt() {
		Display obj1 = new Display();
		double result;
		obj1.setText("25");
		ActionEvent event = new ActionEvent(obj1, 0, "\u221A");
		obj1.actionPerformed(event);
		result = obj1.toDouble(obj1.getText());
		assertEquals(5.0, result);
	}
	
	@Test
	void testActionPerformedLog() {
		Display obj1 = new Display();
		double result;
		obj1.setText("10");
		ActionEvent event = new ActionEvent(obj1, 0, "Log");
		obj1.actionPerformed(event);
		result = obj1.toDouble(obj1.getText());
		assertEquals(Math.log(10), result);
	}

	@Test
	void testActionPerformedBackSpace() {
		Display obj1 = new Display();
		double result;
		obj1.setText("50");
		ActionEvent event = new ActionEvent(obj1, 0, "\u232B");
		obj1.actionPerformed(event);
		result = obj1.toDouble(obj1.getText());
		assertEquals(5, result);
	}
	
	@Test
	void testActionPerformedBackSpaceEmptyString() {
		Display obj1 = new Display();
		String result = "";
		obj1.setText("");
		ActionEvent event = new ActionEvent(obj1, 0, "\u232B");
		obj1.actionPerformed(event);
		result = obj1.getText();
		assertEquals(" ", result);
	}
	
	@Test
	void testActionPerformedClear() {
		Display obj1 = new Display();
		String result;
		obj1.setText("5");
		ActionEvent event = new ActionEvent(obj1, 0, "Clear");
		obj1.actionPerformed(event);
		result = obj1.getText();
		assertEquals(" ", result);
	}
	
	@Test
	void testActionPerformedDecimal() {
		Display obj1 = new Display();
		String result;
		obj1.setText("");
		ActionEvent event = new ActionEvent(obj1, 0, ".");
		obj1.actionPerformed(event);
		result = obj1.getText();
		assertEquals(".", result);
	}
	
	@Test
	void testActionPerformedNumberInput() {
		Display obj1 = new Display();
		String result;
		obj1.setText("");
		ActionEvent event = new ActionEvent(obj1, 0, "5");
		obj1.actionPerformed(event);
		result = obj1.getText();
		assertEquals("5", result);
	}
	
	@Test
	void testActionPerformedFactorial() {
		Display obj1 = new Display();
		double result;
		obj1.setText("5");
		ActionEvent event = new ActionEvent(obj1, 0, "!");
		obj1.actionPerformed(event);
		result = obj1.toDouble(obj1.getText());
		assertEquals(120.0, result);
	}
	//end misc tests
	//end Display coverage
	//begin Button coverage
	@Test
	void testButton() {
		Buttons obj1 = new Buttons(null);
		obj1.addButton("Hello", Color.BLACK);
		obj1.setBorder(null);
	}
	//end Button coverage
	//begin Window coverage
	@Test
	void testWindow() {
		Window obj1 = new Window();
	}
	//end Window coverage
	//begin Calculator coverage
	@Test
	void testCalculator() {
		Calculator obj1 = new Calculator();
		Calculator.main(null);
	}
	//end Calculator coverage
}
