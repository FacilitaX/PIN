package facilita;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class InterfacesDeGestao implements ActionListener{
	
    private final JFrame telinhaInterfacesDeGestao;
    private final Color cor;
    private final JLabel lblDesricaoTopo;
    private final JButton btnCadastrarProduto;
    private final JButton btnFormasDePagamento;

    public InterfacesDeGestao(Boolean visibilidadeDaTela) {
        this.telinhaInterfacesDeGestao = new JFrame("Selecionar Opção");
        this.cor = new Color(0xfcfade);
        this.lblDesricaoTopo = new JLabel("Selecione uma das opções abaixo para realizar a operação desejada");
        this.btnCadastrarProduto = new JButton("Cadastrar Produtos");
        this.btnFormasDePagamento = new JButton("Formas de Pagamento");
        this.telinhaInterfacesDeGestao.setLayout(null);
        this.telinhaInterfacesDeGestao.setSize(600, 500);
        this.telinhaInterfacesDeGestao.setLocationRelativeTo(null);
        this.telinhaInterfacesDeGestao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.telinhaInterfacesDeGestao.getContentPane().setBackground(cor);
        this.telinhaInterfacesDeGestao.setVisible(visibilidadeDaTela);
        
        addComponentes();
        configurarComponentes();
        addEventos();
    }
    
    private void addComponentes(){
        this.telinhaInterfacesDeGestao.add(this.lblDesricaoTopo);
        this.telinhaInterfacesDeGestao.add(this.btnCadastrarProduto);
        this.telinhaInterfacesDeGestao.add(this.btnFormasDePagamento);        
    }
    
    private void configurarComponentes(){
        this.lblDesricaoTopo.setBounds(80, 10, 500, 30);
        this.btnCadastrarProduto.setBounds(40, 80, 500, 100);
        this.btnFormasDePagamento.setBounds(40, 230, 500, 100);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if(o == this.btnCadastrarProduto){
            GestaoDeProdutos telinhaGestaoProdutos = new GestaoDeProdutos();
            this.telinhaInterfacesDeGestao.setVisible(false);
        }if(o == this.btnFormasDePagamento){
            GestaoDasFormasDePagamento telinhaGestaoDasFormasDePagamento = new GestaoDasFormasDePagamento();
            this.telinhaInterfacesDeGestao.setVisible(false);
        }
    }
    
    private void addEventos(){
        this.btnCadastrarProduto.addActionListener(this);
        this.btnFormasDePagamento.addActionListener(this);
    }
    
}
