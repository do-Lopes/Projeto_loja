/* Leonardo Lopes Rodrigues Silva */
/* RA: 2266431 */

import javax.swing.JOptionPane;

public class VerdadException extends Exception{

	Leitor Ler = new Leitor();	

	public void Verdad(){
		System.out.println("\nEscolha uma opção valida");

	}
	public Camisa corrOpc(Camisa c){
		try{
		c.setEstampa(JOptionPane.showInputDialog(null, "Escolha uma opção válida [SIM / NAO]","Correção",0));
			}
		catch(VerdadException ece){
			ece.Verdad();
			ece.corrOpc(c);
				}
		return c;
	}
	public Blusa corrOpc(Blusa b){
		try{
		b.setEstampa(JOptionPane.showInputDialog(null, "Escolha uma opção válida [Sim, Nao]","Correção",0));
			}
		catch(VerdadException ece){
			ece.Verdad();
			ece.corrOpc(b);
				}
		return b;		
	}
	public Calca corrOpc(Calca k){
		try{
		k.setSuporte(JOptionPane.showInputDialog(null, "Escolha uma opção válida [Sim, Nao]","Correção",0));
			}
		catch(VerdadException ece){
			ece.Verdad();
			ece.corrOpc(k);
				}
		return k;
	}
}