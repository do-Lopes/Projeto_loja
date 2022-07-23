/* Leonardo Lopes Rodrigues Silva */
/* RA: 2266431 */

import javax.swing.JOptionPane;

public class GolaCamiException extends Exception{

	Leitor Ler = new Leitor();

	public void ModeloGola(){
		System.out.println("\nEscolha um modelo de gola valido");

	}
	public Camisa corrGola(Camisa c){
	try{
		c.setGola(JOptionPane.showInputDialog(null, "Escolha uma opção válida de gola da camisa[redonda, V, polo, canoa]:","Correção",0));
			}
		catch(GolaCamiException gce){
			gce.ModeloGola();
			gce.corrGola(c);
				}
		return c;
	}
}