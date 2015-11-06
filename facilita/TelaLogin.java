package facilita;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class TelaLogin implements ActionListener{
    private final JFrame telinhaLogin;
    private final JButton btnLogar;
    private final JLabel lblDescricao;
    private final JLabel lblCnpj;
    private final JLabel lblSenha;
    private final JTextField tfdCnpj;
    private final JPasswordField psdSenha;
    private final Color bgColorTelinhaLogin;
    
    public TelaLogin(){
        this.bgColorTelinhaLogin = new Color(0xfcfade);
        this.telinhaLogin = new JFrame("Facilita - Fazer Login");
        this.telinhaLogin.setSize(600, 500);
        this.telinhaLogin.setLayout(null);
        this.telinhaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.telinhaLogin.setVisible(true);
        this.telinhaLogin.setLocationRelativeTo(null);
        this.telinhaLogin.getContentPane().setBackground(this.bgColorTelinhaLogin);
        this.lblDescricao = new JLabel("Para acessar o sistema de cadastro basta se logar usando seu cnpj e senha");
        this.lblCnpj = new JLabel("CNPJ");
        this.tfdCnpj = new JTextField();
        this.lblSenha = new JLabel("Senha");
        this.psdSenha = new JPasswordField();
        this.btnLogar = new JButton("Logar");
        
        addComponentes();
        configurarComponentes();
        addEventos();
    }
    
    public void validarLogin(String cnpj, String senha){
        if(this.tfdCnpj.getText().equals(cnpj) && this.psdSenha.getText().equals(senha)){
            JOptionPane.showMessageDialog(null, "logado com sucesso");
            InterfacesDeGestao telaInterfaceGestao = new InterfacesDeGestao(Boolean.TRUE);
            this.telinhaLogin.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "CNPJ ou senha invalido!");
        }
    }
   
    private void addComponentes(){
        this.telinhaLogin.add(this.lblDescricao);
        this.telinhaLogin.add(this.lblCnpj);
        this.telinhaLogin.add(this.tfdCnpj);
        this.telinhaLogin.add(this.lblSenha);
        this.telinhaLogin.add(this.psdSenha);
        this.telinhaLogin.add(this.btnLogar);
    }
    private void configurarComponentes(){
        this.lblDescricao.setBounds(70, 10, 500, 30);
        this.lblCnpj.setBounds(100, 80, 100, 20);
        this.tfdCnpj.setBounds(100, 100, 400, 40);
        this.lblSenha.setBounds(100, 150, 100, 20);
        this.psdSenha.setBounds(100, 170, 400, 40);
        this.btnLogar.setBounds(100, 220, 100, 40);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if(o == this.btnLogar){
            this.validarLogin("123456", "123");
        }
    }
    
    private void addEventos(){
        this.btnLogar.addActionListener(this);
    }
    
}
