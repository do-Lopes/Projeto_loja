/* Leonardo Lopes Rodrigues Silva */
/* RA: 2266431 */

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerBlusa{	

		private Blusa b1;

		private List<Blusa> bdBlu = new ArrayList<Blusa>();

		private Leitor Ler = new Leitor();	

        public List<Blusa> getBdBlu(){
            return bdBlu;
        }

	
	public Blusa cadBlu(Blusa b1){
		if(consBluCod(b1)== null){
			bdBlu.add(b1);
			return b1;
		}else{
			return null;
			}
	}


	
	public Blusa consBluCod(Blusa b1){
		for(int i = 0; i < bdBlu.size(); i++){
			if(b1.getCod() == bdBlu.get(i).getCod()){
				return bdBlu.get(i);
			}
		}
		return null;
}





	public void impOneBlu(Blusa b1){	
		System.out.println("\nInfos da Blusa");
		System.out.println("\n O preco da blusa e: R$"+b1.getPreco());
		System.out.println("\n A marca da blusa e:"+b1.getMarca());		
		System.out.println("\n O material da blusa e:"+b1.getMate());
		System.out.println("\n Publico-alvo da blusa:"+b1.getGen());
		System.out.println("\n A cor da blusa e:"+b1.getCor());
		System.out.println("\n O tamanho da blusa e:"+b1.getTaman());
		System.out.println("\n Presenca de Estampa:"+b1.getEstampa());
		System.out.println("\n Presenca de gorro:"+b1.getGorro());
		System.out.println("\n O modelo da blusa e:"+b1.getModelo());
		System.out.println("\n O codigo da blusa e: "+b1.getCod());
		b1.getCusto(b1.getMate());
}

	



public Blusa removeBluCod(Blusa b1){
         b1 = consBluCod(b1);
            if(b1 != null){
                bdBlu.remove(b1);
            }
            return b1;
}





	public Blusa AttBluCod(Blusa b1){
		for(int i = 0; i < bdBlu.size(); i++){
			if(b1.getCod() == bdBlu.get(i).getCod()){
                            try{
				b1.setTaman(JOptionPane.showInputDialog(null, "Digite novamente o tamanho","Atualização",0));
			}
			catch(TamanRoupException tre){
				tre.TamanRoup();
				b1 = tre.corrTamn(b1);
			}

			try{
				b1.setPreco(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite novamente o preço","Atualização",0)));
			}
			catch(NumbNuloException nne){
				nne.NumbNulo();
				b1 = nne.corrNumb(b1);
			}
			catch(NumberFormatException nfe){
                            FormatException x = new FormatException();
                            b1 = x.corrForm(b1);
			}
			
		
			try{
				b1.setMate(JOptionPane.showInputDialog(null, "Digite novamente o material","Atualização",0));
			}
			catch(MateRoupaException mre){
				mre.MateRoupa();
				b1 = mre.corrMat(b1);	
			}
			
		
			try{
				b1.setGen(JOptionPane.showInputDialog(null, "Digite novamente o público-alvo","Atualização",0));
			}
			catch(GenException ge){
				ge.GenEx();
				b1 = ge.corrGen(b1);
			}

			try{
				b1.setEstampa(JOptionPane.showInputDialog(null, "Digite novamente a estampa","Atualização",0));
			}
			catch(VerdadException ece){
				ece.Verdad();
				b1 = ece.corrOpc(b1);
			}


			try{
				b1.setModelo(JOptionPane.showInputDialog(null, "Digite novamente o modelo","Atualização",0));
			}
			catch(ModeloException mce){
				mce.Modelo();
				b1 = mce.corrMod(b1);	
			}

			try{
				b1.setGorro(JOptionPane.showInputDialog(null, "Digite novamente se a blusa apresenta gorro","Atualização",0));
			}
			catch(VerdadException ece){
				ece.Verdad();
				b1 = ece.corrOpc(b1);
			}

				b1.setMarca(JOptionPane.showInputDialog(null, "Digite novamente a marca","Atualização",0));
		
                                b1.setCor(JOptionPane.showInputDialog(null, "Digite novamente a cor","Atualização",0));
				bdBlu.set(i, b1);
                                return b1;
			}
		}
                return null;
	}




	
	public void impAllBdBlus(){
		for(int i = 0; i < bdBlu.size(); i++){	
		System.out.println("\nInfos da Blusa");
		System.out.println("\n O preco da blusa e: R$"+bdBlu.get(i).getPreco());
		System.out.println("\n A marca da blusa e:"+bdBlu.get(i).getMarca());		
		System.out.println("\n O material da blusa e:"+bdBlu.get(i).getMate());
		System.out.println("\n Publico-alvo da blusa:"+bdBlu.get(i).getGen());
		System.out.println("\n A cor da blusa e:"+bdBlu.get(i).getCor());
		System.out.println("\n O tamanho da blusa e:"+bdBlu.get(i).getTaman());
		System.out.println("\n Presenca de Estampa:"+bdBlu.get(i).getEstampa());
		System.out.println("\n Presenca de gorro:"+bdBlu.get(i).getGorro());
		System.out.println("\n O modelo da blusa e:"+bdBlu.get(i).getModelo());
		System.out.println("\n O codigo da blusa e: "+bdBlu.get(i).getCod());

		}
	}
	

			
		
}