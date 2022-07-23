/* Leonardo Lopes Rodrigues Silva */
/* RA: 2266431 */


import javax.swing.JOptionPane;

public class ModeloException extends Exception{

	Leitor Ler = new Leitor();	

	public void Modelo(){
		System.out.println("\nEscolha um modelo valido");

	}
	public Camisa corrMod(Camisa c){
	try{
		c.setModelo(JOptionPane.showInputDialog(null, "Escolha uma opção de manga da camisa válida [longa, curta, regata]: ","Correção",0));                                             
			}
		catch(ModeloException mce){
			mce.Modelo();
			mce.corrMod(c);
				}
		return c;

	}
	public Blusa corrMod(Blusa b){
		try{
		b.setModelo(JOptionPane.showInputDialog(null, "\nInforme o modelo da blusa válido [Sobretudo, Canguru, Blazer, Corta Vento]","Correção",0));
			}
		catch(ModeloException ece){
			ece.Modelo();
			ece.corrMod(b);
				}
		return b;	
	}
	public Calca corrMod(Calca k){
		try{
		k.setFechamento(JOptionPane.showInputDialog(null, "\nInforme o modelo de fechamento da calça válido [Ziper, Botão, elastico]","Correção",0));
			}
		catch(ModeloException me){
			me.Modelo();
			me.corrMod(k);
				}
		return k;
		
	}
}