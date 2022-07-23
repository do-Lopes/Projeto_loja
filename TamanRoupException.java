/* Leonardo Lopes Rodrigues Silva */
/* RA: 2266431 */

import javax.swing.JOptionPane;

public class TamanRoupException extends Exception{

	Leitor Ler = new Leitor();

	public void TamanRoup(){
		System.out.printf("\nDigite um tamanho valido");
		}
	public Camisa corrTamn(Camisa c){
	try{
		c.setTaman(JOptionPane.showInputDialog(null, "Informe um tamanho da camisa válido[PP, P, M, G, GG]: ","Correção",0));

			}
		catch(TamanRoupException tre){
			tre.TamanRoup();
			tre.corrTamn(c);
				}
		return c;
	}
	public Blusa corrTamn(Blusa b){
	try{
		b.setTaman(JOptionPane.showInputDialog(null, "Informe um tamanho da Blusa válido[PP, P, M, G, GG]: ","Correção",0));
			}
		catch(TamanRoupException tre){
			tre.TamanRoup();
			tre.corrTamn(b); 
				}
		return b;
	}
	public Calca corrTamn(Calca k){
	try{
		k.setTaman(JOptionPane.showInputDialog(null, "Informe um tamanho da calça válido[PP, P, M, G, GG]: ","Correção",0));
			}
		catch(TamanRoupException tre){
			tre.TamanRoup();
			tre.corrTamn(k);
				}
		return k;
	}
}
