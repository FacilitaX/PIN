package facilita;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;


public class GestaoDeProdutos {
    private final JFrame telaGestaoDeProdutos;
    private final Color cor;
    private JLabel listaDeProdutos;
    private JLabel nomeProduto;
    private JLabel codigoProduto;
    private JLabel fabricanteProduto;
    private JLabel fornecedorProduto;
    private JLabel quantidadeProduto;
    private JLabel dataLoteProduto;
    private JLabel departamentoProduto;
    private JTextField campoBusca;
    
    public GestaoDeProdutos(){
        this.cor = new Color(0xfcfade);
        this.telaGestaoDeProdutos = new JFrame("Facilita - Gestão de Cadastro de Produtos");
        this.telaGestaoDeProdutos.setSize(600, 500);
        this.telaGestaoDeProdutos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.telaGestaoDeProdutos.setLayout(null);
        this.telaGestaoDeProdutos.setLocationRelativeTo(null);
        this.telaGestaoDeProdutos.setVisible(true);
        this.telaGestaoDeProdutos.getContentPane().setBackground(cor);
        this.listaDeProdutos = new JLabel("LISTA DE PRODUTOS");
        this.nomeProduto = new JLabel("Nome");
        this.codigoProduto = new JLabel("Código");
        this.fabricanteProduto = new JLabel("Fabricante");
        this.fornecedorProduto = new JLabel("Fornecedor");
        this.quantidadeProduto = new JLabel("Quantidade");
        this.dataLoteProduto = new JLabel("Data do Lote");
        this.departamentoProduto = new JLabel("Departamento");
        this.campoBusca = new JTextField();
        
        addComponentes();
        configurarComponentes();
    }
    
    private void addComponentes(){
        this.telaGestaoDeProdutos.add(this.campoBusca);
        this.telaGestaoDeProdutos.add(this.listaDeProdutos);
    }
    
    private void configurarComponentes(){
        this.campoBusca.setBounds(10, 10, 280, 30);
        this.listaDeProdutos.setBounds(10, 40, 280, 30);
    }
    
    
    
}
