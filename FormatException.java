
import javax.swing.JOptionPane;

public class FormatException{

	Leitor Ler = new Leitor();

	int x;

	public void FormEX(){
		System.out.println("\nDigite um numero inteiro");
	}
        
        
	public Camisa corrForm(Camisa c){
		try{
		c.setPreco(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um preço válido","Correção",0)));
			}
		catch(NumberFormatException nfe){
			FormatException x = new FormatException();
			x.corrForm(c);
				}
		catch(NumbNuloException nne){
			nne.NumbNulo();
			nne.corrNumb(c);
			}
		
			return c;
	}
        
        public Blusa corrForm(Blusa b){
		try{
		b.setPreco(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um preço válido","Correção",0)));
			}
		catch(NumberFormatException nfe){
			FormatException x = new FormatException();
			x.corrForm(b);
				}
		catch(NumbNuloException nne){
			nne.NumbNulo();
			nne.corrNumb(b);
			}
		
			return b;
	}
 
        public Calca corrForm(Calca k){
		try{
		k.setPreco(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um preço válido","Correção",0)));
			}
		catch(NumberFormatException nfe){
			FormatException x = new FormatException();
			x.corrForm(k);
				}
		catch(NumbNuloException nne){
			nne.NumbNulo();
			nne.corrNumb(k);
			}
		
			return k;
	}
}