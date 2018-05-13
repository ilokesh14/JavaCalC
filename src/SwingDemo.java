import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class SwingDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textf;
	private double firstno ;
	private double secondno ;
	private double result ;
	private String operator ;
	private boolean isdot = true ;
	private String answer ;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingDemo frame = new SwingDemo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public SwingDemo() {
		setType(Type.UTILITY);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 400);
		contentPane = new JPanel();
		setResizable(false);
		setLocation(500, 200);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.BLACK);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(Color.WHITE);
		btn1.setBounds(9, 142, 50, 50);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(Color.WHITE);
		btn2.setBounds(64, 142, 50, 50);
		contentPane.add(btn2);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(9, 197, 50, 50);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(64, 197, 50, 50);
		contentPane.add(btn5);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(119, 142, 50, 50);
		contentPane.add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(Color.WHITE);
		btn6.setBounds(119, 197, 50, 50);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(Color.WHITE);
		btn7.setBounds(9, 252, 50, 50);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(Color.WHITE);
		btn8.setBounds(64, 252, 50, 50);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(Color.WHITE);
		btn9.setBounds(119, 252, 50, 50);
		contentPane.add(btn9);
		
		textf = new JTextField();
		textf.setHorizontalAlignment(SwingConstants.RIGHT);
		textf.setFont(new Font("Dialog", Font.PLAIN, 20));
		textf.setBounds(10, 65, 320, 65);
		contentPane.add(textf);
		textf.setColumns(10);
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(Color.WHITE);
		btn0.setBounds(173, 252, 50, 50);
		contentPane.add(btn0);
		
		JButton btnplus = new JButton("+");
		btnplus.setBackground(Color.WHITE);
		btnplus.setBounds(173, 197, 50, 50);
		contentPane.add(btnplus);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textf.getText().isEmpty()) {	
					isdot = false;
					secondno = Double.parseDouble(textf.getText()) ;
					if(operator == "+") {
						result = firstno + secondno ;
						 answer = String.format("%.2f",result) ;
						 textf.setText(answer);
					}
					
					else if(operator ==  "-") {
						result = firstno - secondno ;
						 answer = String.format("%.2f",result) ;
						 textf.setText(answer);
					}
					
					else if(operator ==  "x") {
						result = firstno * secondno ;
						 answer = String.format("%.2f",result) ;
						 textf.setText(answer);
					}
					
					else if(operator ==  "/") {
						result = firstno / secondno ;
						 answer = String.format("%.2f",result) ;
						 textf.setText(answer);
					}	
					else if(operator ==  "%") {
						result = firstno % secondno ;
						 answer = String.format("%.2f",result) ;
						 textf.setText(answer);
					}	
				}
			}
		});
		btnequal.setBackground(Color.WHITE);
		btnequal.setBounds(283, 252, 50, 50);
		contentPane.add(btnequal);
		
		JButton btnminus = new JButton("-");
		btnminus.setBackground(Color.WHITE);
		btnminus.setBounds(173, 143, 50, 50);
		contentPane.add(btnminus);
		
		JButton btnproduct = new JButton("x");
		btnproduct.setBackground(Color.WHITE);
		btnproduct.setBounds(228, 142, 50, 50);
		contentPane.add(btnproduct);
		
		JButton btndivide = new JButton("/");
		btndivide.setBackground(Color.WHITE);
		btndivide.setBounds(228, 197, 50, 50);
		contentPane.add(btndivide);
		
		JButton btnmodulus = new JButton("%");
		btnmodulus.setBackground(Color.WHITE);
		btnmodulus.setBounds(228, 252, 50, 50);
		contentPane.add(btnmodulus);
		
		JButton btndot = new JButton(".");
		btndot.setFont(new Font("Dialog", Font.BOLD, 12));
		btndot.setBackground(Color.WHITE);
		btndot.setBounds(283, 142, 50, 50);
		contentPane.add(btndot);
		
		JButton btnclear = new JButton("C");
		btnclear.setBackground(Color.WHITE);
		btnclear.setBounds(283, 197, 50, 50);
		contentPane.add(btnclear);
		
		JButton btnbackspace = new JButton("<-");
		btnbackspace.setBackground(Color.WHITE);
		btnbackspace.setBounds(10, 308, 323, 50);
		contentPane.add(btnbackspace);
		
		btn1.addActionListener(e->this.show1()) ;
		btn2.addActionListener(e->this.show2()) ;
		btn3.addActionListener(e->this.show3()) ;
		btn4.addActionListener(e->this.show4()) ;
		btn5.addActionListener(e->this.show5()) ;
		btn6.addActionListener(e->this.show6()) ;
		btn7.addActionListener(e->this.show7()) ;
		btn8.addActionListener(e->this.show8()) ;
		btn9.addActionListener(e->this.show9()) ;
		btn0.addActionListener(e->this.show0()) ;
		
		btnplus.addActionListener(e->this.showPlus()) ;
		btnminus.addActionListener(e->this.showMinus()) ;
		btndivide.addActionListener(e->this.showDivide()) ;
		btnmodulus.addActionListener(e->this.showModulus()) ;
		btnclear.addActionListener(e->this.showClear()) ;
		btndot.addActionListener(e->this.showDot()) ;
		btnproduct.addActionListener(e->this.showProduct()) ;
		
		btnbackspace.addActionListener(e->this.showBackSpace()) ;
		
		}
	
	public void show1() {
		String newText = textf.getText()+"1" ;
		textf.setText(newText);
	}
	public void show2() {
		String newText = textf.getText()+"2" ;
		textf.setText(newText);
	}
	public void show3() {
		String newText = textf.getText()+"3" ;
		textf.setText(newText);
	}
	public void show4() {
		String newText = textf.getText()+"4" ;
		textf.setText(newText);
	}
	public void show5() {
		String newText = textf.getText()+"5" ;
		textf.setText(newText);
	}
	public void show6() {
		String newText = textf.getText()+"6" ;
		textf.setText(newText);
	}
	public void show7() {
		String newText = textf.getText()+"7" ;
		textf.setText(newText);
	}
	public void show8() {
		String newText = textf.getText()+"8" ;
		textf.setText(newText);
	}
	public void show9() {
		String newText = textf.getText()+"9" ;
		textf.setText(newText);
	}
	public void show0() {
		String newText = textf.getText()+"0" ;
		textf.setText(newText);
	}
	public void showDot() {
		if(!textf.getText().isEmpty()) {
		if(isdot) {
		String newText = textf.getText()+"." ;
		textf.setText(newText);
		isdot = false ;
		}
		
		}
	}
	
	public void showPlus() {
		if(!textf.getText().isEmpty()) {
//		String newText = textf.getText()+"+" ;
		firstno = Double.parseDouble(textf.getText()) ;
		textf.setText(null);
		operator = "+" ;
		isdot= true ;
		}
	}
	
	public void showMinus() {
		if(!textf.getText().isEmpty()) {
//		String newText = textf.getText()+"-" ;
		firstno = Double.parseDouble(textf.getText()) ;
		textf.setText(null);
		operator = "-" ;
		isdot= true ;
		}
	}
	
	public void showProduct() {
		if(!textf.getText().isEmpty()) {
//		String newText = textf.getText()+"x" ;
		firstno = Double.parseDouble(textf.getText()) ;
		textf.setText(null);
		operator = "x" ;
		isdot= true ;
		}
	}
	
	public void showModulus() {
		if(!textf.getText().isEmpty()) {
//		String newText = textf.getText()+"%" ;
		firstno = Double.parseDouble(textf.getText()) ;
		textf.setText(null);
		operator = "%" ;
		isdot= true ;
		}
	}
	
	public void showDivide() {
		if(!textf.getText().isEmpty()) {
//		String newText = textf.getText()+"/" ;
		firstno = Double.parseDouble(textf.getText()) ;
		textf.setText(null);
		operator = "/" ;
		isdot= true ;
		}
	}
	
	public void showClear() {
		if(!textf.getText().isEmpty()) {
//		String newText = null ;
		firstno = Double.parseDouble(textf.getText()) ;
		textf.setText(null);
		operator = "c" ;
		isdot= true ;
		}
	}
	
	public void showBackSpace() {
		if(!textf.getText().isEmpty()) {
		String backSpace = null ;
		StringBuilder stringBuilder = new StringBuilder(textf.getText()) ;
		stringBuilder.deleteCharAt(textf.getText().length()-1) ;
		backSpace = stringBuilder.toString() ;
		textf.setText(backSpace);
		isdot= true ;
		}
	}
}
