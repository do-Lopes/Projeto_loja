/* Leonardo Lopes Rodrigues Silva */
/* RA: 2266431 */

import javax.swing.JOptionPane;

public class NumbNuloException extends Exception{

	Leitor Ler = new Leitor();

	public void NumbNulo(){
		System.out.println("\nO numero não pode ser menor ou igual a 0");

	}

	public Camisa corrNumb(Camisa c){
		try{
		c.setPreco(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um preço válido","Correção",0)));
			}
		catch(NumbNuloException nne){
			nne.NumbNulo();
			nne.corrNumb(c);
			}
                catch(NumberFormatException nfe){
			FormatException x = new FormatException();
			x.corrForm(c);
				}
		
			return c;
	}
	
	public Blusa corrNumb(Blusa b){
		try{
		b.setPreco(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um preço válido","Correção",0)));
			}
		catch(NumbNuloException nne){
			nne.NumbNulo();
			nne.corrNumb(b);
				}
                catch(NumberFormatException nfe){
			FormatException x = new FormatException();
			x.corrForm(b);
				}
			return b;
		}
	public Calca corrNumb(Calca k){
	try{
		k.setPreco(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um preço válido","Correção",0)));
			}
		catch(NumbNuloException nne){
			nne.NumbNulo();
			nne.corrNumb(k);
				}
        catch(NumberFormatException nfe){
			FormatException x = new FormatException();
			x.corrForm(k);
				}
			return k;

	}
}