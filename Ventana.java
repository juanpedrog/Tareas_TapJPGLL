import javax.swing.*;
import java.awt.*;

public class Ventana{
	public Ventana(){
		construyeVentana();
	}
	public void construyeVentana(){
		//Declarando e inicializando variables
		JFrame ventana=new JFrame("Register Account");
		JLabel user=new JLabel("User");
		JLabel pass=new JLabel("Password");
		JLabel comments=new JLabel("Comments");
		JButton ok=new JButton("Ok");
		JButton cancel=new JButton("Cancel");
		JTextField usertext=new JTextField("");
		JTextField passtext=new JTextField("");
		JTextArea commentstext=new JTextArea("");

		//Asignando tamaño a los JTextFields
		usertext.setPreferredSize(new Dimension(200,24));
		passtext.setPreferredSize(new Dimension(200,24));

		//Asignando posicion de los objetos
		user.setBounds(0,0);

		//Asignando formato a la ventana
		ventana.setLayout(new FlowLayout());
		ventana.add(user);
		ventana.add(pass);
		ventana.add(comments);
		ventana.add(ok);
		ventana.add(cancel);
		ventana.add(usertext);
		ventana.add(passtext);
		ventana.add(commentstext);
		ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		ventana.pack();
		ventana.setVisible(true);
	}

	public static void main(String[] args){
		new Ventana();
	}
}
