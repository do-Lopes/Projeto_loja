/* Leonardo Lopes Rodrigues Silva */
/* RA: 2266431 */

import javax.swing.JOptionPane;

public class MateRoupaException extends Exception{

	Leitor Ler = new Leitor();
	
	public void MateRoupa(){
		System.out.printf("\nDigite um material valido");
		}
	
	public Camisa corrMat(Camisa c){
		try{
		c.setMate(JOptionPane.showInputDialog(null, "Informe um material da camisa válido [Algodao, Poliester, Seda, La, Lycra]: ","Correção",0));
			}
		catch(MateRoupaException mre){
			mre.MateRoupa();
			mre.corrMat(c);
				}
		return c;

		}
	public Blusa corrMat(Blusa b){
		try{
		b.setMate(JOptionPane.showInputDialog(null, "\nInforme um material da blusa válido [Algodao, Poliester, Seda, La, Lycra]","Correção",0));
			}
		catch(MateRoupaException mre){
			mre.MateRoupa();
			mre.corrMat(b);
				}
		return b;	
	}
	public Calca corrMat(Calca k){
		try{
		k.setMate(JOptionPane.showInputDialog(null, "\nInforme um material da calca válido [Algodao, Poliester, Seda, La, Lycra]","Correção",0));
			}
		catch(MateRoupaException mre){
			mre.MateRoupa();
			mre.corrMat(k);
				}
		return k;
	}
}