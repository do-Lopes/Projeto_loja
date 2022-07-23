/* Leonardo Lopes Rodrigues Silva */
/* RA: 2266431 */

import javax.swing.JOptionPane;

public class GenException extends Exception{

	Leitor Ler = new Leitor();	

	public void GenEx(){
		System.out.println("\nOpcao invalida");

	}
	public Camisa corrGen(Camisa c){
		try{
		c.setGen(JOptionPane.showInputDialog(null, "Informe um público-alvo válido da camisa[Masculino, Feminino, Unissex]: ","Correção",0));
			}
		catch(GenException ge){
			ge.GenEx();
			ge.corrGen(c);
				}
			return c;
		
	}
	public Blusa corrGen(Blusa b){
		try{
		b.setGen(JOptionPane.showInputDialog(null, "\nInforme um público-alvo válido da blusa[Masculino, Feminino, Unissex]","Correção",0));
			}
		catch(GenException ge){
			ge.GenEx();
			ge.corrGen(b);
				}
			return b;
	}
	public Calca corrGen(Calca k){
		try{
		k.setGen(JOptionPane.showInputDialog(null, "\nInforme um público-alvo válido da calça[Masculino, Feminino, Unissex]","Correção",0));
			}
		catch(GenException ge){
			ge.GenEx();
			ge.corrGen(k);
				}
		return k;
	}
}
