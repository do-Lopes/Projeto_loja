/* Leonardo Lopes Rodrigues Silva */
/* RA: 2266431 */

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerCamisa{

		private Camisa c1;

		private List<Camisa> bdCam = new ArrayList<Camisa>();		

		private Leitor Ler = new Leitor();	
                
                
        public List<Camisa> getBdCam(){
            return bdCam;
        }     


	
	public Camisa cadCam(Camisa c1){
			if(consCamCod(c1)== null){
				bdCam.add(c1);
				return c1;
			}else{
			return null;
			}
	}

	






	public Camisa consCamCod(Camisa c1){
		for(int i = 0; i < bdCam.size(); i++){
			if(c1.getCod() == bdCam.get(i).getCod()){
				return bdCam.get(i);
			}
		}
		return null;
}
	


	public void impOneCam(Camisa c1){
		System.out.println("\nInfos da Camisa");
		System.out.println("\n O pre?o da camisa ?: R$"+c1.getPreco());
		System.out.println("\n A marca da camisa ?: "+c1.getMarca());		
		System.out.println("\n O material da camisa ?: "+c1.getMate());
		System.out.println("\n Publico-alvo da camisa: "+c1.getGen());
		System.out.println("\n A cor da camisa ?: "+c1.getCor());
		System.out.println("\n O tamanho da camisa ?: "+c1.getTaman());
		System.out.println("\n Apresenta Estampa: "+c1.getEstampa());
		System.out.println("\n O modelo da camisa ?: "+c1.getModelo());
		System.out.println("\n O modelo de gola da camisa ?: "+c1.getGola());
		System.out.println("\n O codigo da camisa ?: "+c1.getCod());
		c1.getCusto(c1.getMate());		
}



	

	public Camisa removeCamCod(Camisa c1){
            c1 = consCamCod(c1);
            if(c1 != null){
                bdCam.remove(c1);
            }
            return c1;
        }



	public Camisa AttCamCod(Camisa c1){
		for(int i = 0; i < bdCam.size(); i++){
			if(c1.getCod() == bdCam.get(i).getCod()){
                            try{
				c1.setTaman(JOptionPane.showInputDialog(null, "Digite novamente o tamanho","Atualização",0));
			}
			catch(TamanRoupException tre){
				tre.TamanRoup();
				c1 = tre.corrTamn(c1);
			}

			try{
				c1.setPreco(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite novamente o preço","Atualização",0)));
			}
			catch(NumbNuloException nne){
				nne.NumbNulo();
				c1 = nne.corrNumb(c1);
			}
			catch(NumberFormatException nfe){
				FormatException x = new FormatException();
				c1 = x.corrForm(c1);
                        }
		
			try{
				c1.setMate(JOptionPane.showInputDialog(null, "Digite novamente o material","Atualização",0));
			}
			catch(MateRoupaException mre){
				mre.MateRoupa();
				c1 = mre.corrMat(c1);	
			}
			
		
			try{
				c1.setGen(JOptionPane.showInputDialog(null, "Digite novamente o público-alvo","Atualização",0));
			}
			catch(GenException ge){
				ge.GenEx();
				c1 = ge.corrGen(c1);
			}

			try{
				c1.setEstampa(JOptionPane.showInputDialog(null, "Digite novamente a estampa","Atualização",0));
			}
			catch(VerdadException ece){
				ece.Verdad();
				c1 = ece.corrOpc(c1);
			}


			try{
				c1.setModelo(JOptionPane.showInputDialog(null, "Digite novamente o modelo","Atualização",0));
			}
			catch(ModeloException mce){
				mce.Modelo();
				c1 = mce.corrMod(c1);	
			}

			try{
				c1.setGola(JOptionPane.showInputDialog(null, "Digite novamente o tipo de gola","Atualização",0));
			}
			catch(GolaCamiException gce){
				gce.ModeloGola();
				c1 = gce.corrGola(c1);
			}

				c1.setMarca(JOptionPane.showInputDialog(null, "Digite novamente a marca","Atualização",0));
		
                                c1.setCor(JOptionPane.showInputDialog(null, "Digite novamente a cor","Atualização",0));
				bdCam.set(i, c1);
                                return c1;
			}
		}
                return null;
	}
        


	public void impAllBdCams(){
		for(int i = 0; i < bdCam.size(); i++){
			System.out.println("\nInfos da Camisa");
			System.out.println("\n O preco da camisa e: R$"+bdCam.get(i).getPreco());
			System.out.println("\n A marca da camisa e: "+bdCam.get(i).getMarca());		
			System.out.println("\n O material da camisa e: "+bdCam.get(i).getMate());
			System.out.println("\n Publico-alvo da camisa: "+bdCam.get(i).getGen());
			System.out.println("\n A cor da camisa e: "+bdCam.get(i).getCor());
			System.out.println("\n O tamanho da camisa e: "+bdCam.get(i).getTaman());
			System.out.println("\n Apresenta Estampa: "+bdCam.get(i).getEstampa());
			System.out.println("\n O modelo da camisa e: "+bdCam.get(i).getModelo());
			System.out.println("\n O modelo de gola da camisa e: "+bdCam.get(i).getGola());
			System.out.println("\n O codigo da camisa e: "+bdCam.get(i).getCod());
             
			
		}
	}
	
	
	
	
	
	
			
		
}