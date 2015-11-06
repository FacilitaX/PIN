package facilita;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Facilita {

	public static void main(String[] args) {
            
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } 
            catch (UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            catch (InstantiationException e) {
                e.printStackTrace();
             }
            catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            
            MensagemBoasVindas msg = new MensagemBoasVindas();
            TelaLogin telaLogin = new TelaLogin();
	}

}
