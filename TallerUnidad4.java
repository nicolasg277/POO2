import javax.swing.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;

public class Taller3  {
    private JTabbedPane tabbedPane1;
    private JPanel nico;
    private JPanel nico1;
    private JButton comprarButton;
    private JTextField dolar;
    private JTextField valorDolar;
    private JTextField result1;
    private JTextField result2;
    private JTextField cantidadDisponible;
    private JLabel nuevo;
    private JButton borrarDato;
    private JTabbedPane tabbedPane2;
    private JTabbedPane tabbedPane3;
    private JTextField pesoColEuro;
    private JTextField cantidadDisponibleEuro;
    private JTextField valorEuro;
    private JButton venderEuro;
    private JButton borrarEuro;
    private JTextField resultEuro;
    private JTextField resultEuro2;
    private JTextField pesoColLibra;
    private JTextField cantidadLibra;
    private JTextField valorLibra;
    private JTextField resultLibra;
    private JTextField resultLibra2;
    private JButton borrarLibra;
    private JButton venderLibra;
    private JPanel nico2;


    int resultado ;



    public Taller3() {
        //DOLAR---------------------------------------------------------------------------------------------------
        //comprar
        comprarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int cantidad = Integer.parseInt(cantidadDisponible.getText());
                int result = Integer.parseInt(dolar.getText());
                int precioDolar = Integer.parseInt(valorDolar.getText());


                result1.setText("Ha comprado $" + dolar.getText()+ " dolares");
                result2.setText("valor de dolar a pesos colombianos. Son $" + result * precioDolar + " pesos");
                resultado = cantidad + result;
                cantidadDisponible.setText("Su nueva cantidad son $" + resultado + " dolares");

            }
        });

        //Vender
        dolar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    int cantidad = Integer.parseInt(cantidadDisponible.getText());
                    int result = Integer.parseInt(dolar.getText());
                    int precioDolar = Integer.parseInt(valorDolar.getText());


                    result2.setText("valor de dolar a pesos colombianos $" + result * precioDolar + " pesos colombianos");
                    if (result <= cantidad) {
                        result1.setText("Vendimos $" + dolar.getText() + " dolares");
                        resultado = cantidad - result;
                        cantidadDisponible.setText("Su nueva cantidad son $" + resultado + " dolares");
                    } else {
                        result1.setText("No se cuenta con la cantidad suficiente para la venta");
                    }
                }
            }
        });
        //borrar
        borrarDato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dolar.setText("");
                valorDolar.setText("");
                result1.setText("");
                result2.setText("");
                cantidadDisponible.setText("");
            }
        });

        //Euro------------------------------------------------------------------------------------------------------

        //borrar
        borrarEuro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pesoColEuro.setText("");
                valorEuro.setText("");
                resultEuro.setText("");
                resultEuro2.setText("");
                cantidadDisponibleEuro.setText("");
            }
        });
        //vender
        venderEuro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cantidad = Integer.parseInt(cantidadDisponibleEuro.getText());
                int result = Integer.parseInt(valorEuro.getText());
                int precioEuro = Integer.parseInt(pesoColEuro.getText());


                resultEuro2.setText("valor de euro a pesos colombianos $" + result * precioEuro + " pesos colombianos");
                if (result <= cantidad) {
                    resultEuro.setText("Vendimos $" + valorEuro.getText() + " euros");
                    resultado = cantidad - result;
                    cantidadDisponibleEuro.setText("Su nueva cantidad son $" + resultado + " euros");
                } else {
                    resultEuro.setText("No se cuenta con la cantidad suficiente para la venta");
                }

            }
        });
        //comprar
        valorEuro.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    int cantidadEuro = Integer.parseInt(cantidadDisponibleEuro.getText());
                    int result = Integer.parseInt(valorEuro.getText());
                    int precioEuro = Integer.parseInt(pesoColEuro.getText());

                    resultEuro.setText("Ha comprado $" + valorEuro.getText() + " euros");
                    resultEuro2.setText("valor de euro a pesos colombianos $" + result * precioEuro + " pesos");
                    resultado = cantidadEuro + result;
                    cantidadDisponibleEuro.setText("Su nueva cantidad son $" + resultado + " euros");
                }
            }
        });


        // Libra-----------------------------------------------------------------------------------------------------
        //comprar
        valorLibra.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    int libra = Integer.parseInt(cantidadLibra.getText());
                    int resultLibras = Integer.parseInt(valorLibra.getText());
                    int pesoCol = Integer.parseInt(pesoColLibra.getText());

                    resultLibra.setText("Ha comprado $"+ valorLibra.getText() + " libras esterlinas");
                    resultLibra2.setText("Valor de libra esterlina a pesos colombianos.  Son $" + resultLibras * pesoCol + " pesos");
                    resultado = libra + resultLibras;
                    cantidadLibra.setText("Su nueva cantidad son $" + resultado + " libras esterlinas");
                }
            }
        });
        //borrar
        borrarLibra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pesoColLibra.setText("");
                cantidadLibra.setText("");
                valorLibra.setText("");
                resultLibra.setText("");
                resultLibra2.setText("");

            }
        });
        //vender
        venderLibra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cantidad = Integer.parseInt(cantidadLibra.getText());
                int result = Integer.parseInt(valorLibra.getText());
                int precioEuro = Integer.parseInt(pesoColLibra.getText());


                resultLibra2.setText("valor de libra esterlina a pesos colombianos. Son $" + result * precioEuro + " pesos colombianos");
                if (result <= cantidad) {
                    resultLibra.setText("Vendimos $" + valorLibra.getText() + " libra esterlina");
                    resultado = cantidad - result;
                    cantidadLibra.setText("Su nueva cantidad son $" + resultado + " libra esterlina");
                } else {
                    resultLibra.setText("No se cuenta con la cantidad suficiente para la venta");
                }

            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Casa de cambios");
        frame.setContentPane(new Taller3().nico);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}