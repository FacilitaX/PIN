package facilita;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class GestaoDasFormasDePagamento {
    
    private final JFrame telaGestaoDasFormasDePagamento;
    private final Color cor;
    
    public GestaoDasFormasDePagamento(){
        this.cor = new Color(0xfcfade);
        this.telaGestaoDasFormasDePagamento = new JFrame("Facilita - Gestão das Formas de Pagamento");
        this.telaGestaoDasFormasDePagamento.setSize(600, 500);
        this.telaGestaoDasFormasDePagamento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.telaGestaoDasFormasDePagamento.setLayout(null);
        this.telaGestaoDasFormasDePagamento.setLocationRelativeTo(null);
        this.telaGestaoDasFormasDePagamento.setVisible(true);
        this.telaGestaoDasFormasDePagamento.getContentPane().setBackground(cor);
    }
    
}
