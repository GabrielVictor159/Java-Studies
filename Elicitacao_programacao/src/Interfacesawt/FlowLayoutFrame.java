package Interfacesawt;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class FlowLayoutFrame extends JFrame {
public FlowLayoutFrame() {
super("Exemplo FlowLayout");
FlowLayout layout = new FlowLayout();
Container container = getContentPane();
setLayout(layout);
JButton botaoEsquerdo = new JButton("Esquerda");
add(botaoEsquerdo);
JButton botaoCentral = new JButton("Centro");
add(botaoCentral);
JButton botaoDireito = new JButton("Direita");
add(botaoDireito);
setVisible(true);
setSize(600, 75);
}
public static void main(String[] args) {
FlowLayoutFrame frame = new FlowLayoutFrame();
}
}