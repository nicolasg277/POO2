import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;

public class Calculaciones {
    private JTextField valorFi;
    private JTextField result;
    private JButton fibonacci;
    private JButton factorial;
    private JButton salirButton;
    private JButton limpiarButton;
    private JButton multiplos;
    private JTextArea Resultado;
    private JTextField valorM;
    private JTextField valorm2;
    private JTextField valorFactorial;
    private JPanel nico;
    class Fondo extends JPanel{
        protected Image imagen;
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/Imagenees/imagen.jpg")).getImage();
            g.drawImage(imagen,0,0,getWidth(), getHeight(),this);
            setOpaque(false);

            super.paint(g);

        }
    }
    public class Index extends javax.swing.JFrame{
        Fondo f = new Fondo();
        public Index(){
            this.setContentPane(f);
            
        }
    }
    public Calculaciones() {




        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });

        factorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                int n;
                n = Integer.parseInt(valorFactorial.getText());
                int a = 0, b = 1, c = 0, s = 1;
                for (int i = 2; i <= n; i++) {
                    c = a + b;
                    s += c;
                    a = b;
                    b = c;
                }
                result.setText(Integer.toString(c));}
                catch(NumberFormatException c){
                    result.setText("Solo puede ingresar números, LETRAS NO ADMITIMOS");
                }
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valorFi.setText("");
                valorM.setText("");
                valorm2.setText("");
                valorFactorial.setText("");
                Resultado.setText("");
                result.setText("");
            }
        });


        multiplos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                int m = Integer.parseInt(valorM.getText());
                int m1 = Integer.parseInt(valorm2.getText());
                String resultado = "";
                for (int i = 0; i < m1; i++ ) {
                    if (i % m == 0) {
                        resultado = resultado + i + "\n";
                    }
                }
                Resultado.append(String.valueOf("Resultado:\n "  + resultado));
                }
                catch(NumberFormatException c){
                    result.setText("Solo puede ingresar números, LETRAS NO ADMITIMOS");
                }
            }
        });
        fibonacci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int factoriall = 1;
                    Integer n = new Integer(valorFi.getText());

                    for(int i = n; i >= 1; i--){
                        factoriall = factoriall * i;
                    }
                    result.setText(" " + factoriall);
                }
                catch(NumberFormatException c){
                    result.setText("Solo puede ingresar números, LETRAS NO ADMITIMOS");
                }
            }
        });
    }

    public static void main(String[]args){
        JFrame frame = new JFrame("Programa");
        frame.setContentPane(new Calculaciones().nico);

        frame.pack();
        frame.setVisible(true);
    }
}
