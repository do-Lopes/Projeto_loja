/* Leonardo Lopes Rodrigues Silva */
/* RA: 2266431 */

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerCalca{

		private Calca k1;

		private List<Calca> bdCal = new ArrayList<Calca>();

		private Leitor Ler = new Leitor();	

            public List<Calca> getBdCal(){
            return bdCal;
        }


	
	public Calca cadCal(Calca k1){
		if(consCalCod(k1)== null){
			bdCal.add(k1);
			return k1;
		}else{
			return null;
			}
	}



	public Calca consCalCod(Calca k1){
		for(int i = 0; i < bdCal.size(); i++){
			if(k1.getCod() == bdCal.get(i).getCod()){
				return bdCal.get(i);
			}
		}
		return null;
}




	public void impOneCal(Calca k1){
		System.out.println("\nInfos da Cal?a");
		System.out.println("\n O preco da cal?a e: R$"+k1.getPreco());
		System.out.println("\n A marca da cal?a e: "+k1.getMarca());		
		System.out.println("\n O material da cal?a e: "+k1.getMate());
		System.out.println("\n Publico-alvo da calca: "+k1.getGen());
		System.out.println("\n A cor da cal?a ?: "+k1.getCor());
		System.out.println("\n O tamanho da calca e: "+k1.getTaman());
		System.out.println("\n Presenca de bolso: "+k1.getBolso());
		System.out.println("\n Presenca de suporte para cinto: "+k1.getSuporte());
		System.out.println("\n O modelo de fechamento da cal?a e: "+k1.getFechamento());
		k1.getCusto(k1.getMate());
}	



public Calca removeCalCod(Calca k1){
            k1 = consCalCod(k1);
            if(k1 != null){
                bdCal.remove(k1);
            }
            return k1;
}



	public Calca AttCalCod(Calca k1){
		for(int i = 0; i < bdCal.size(); i++){
			if(k1.getCod() == bdCal.get(i).getCod()){
                            try{
				k1.setTaman(JOptionPane.showInputDialog(null, "Digite novamente o tamanho[PP / P / M / G / GG]","Atualização",0));
                            }
                            catch(TamanRoupException tre){
                                    tre.TamanRoup();
                                    k1 = tre.corrTamn(k1);
                            }

                            try{
                                    k1.setPreco(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite novamente o preço","Atualização",0)));
                            }
                            catch(NumbNuloException nne){
                                    nne.NumbNulo();
                                    k1 = nne.corrNumb(k1);
                            }
                            catch(NumberFormatException nfe){
                                FormatException x = new FormatException();
                                k1 = x.corrForm(k1);
                            }


                            try{
                                    k1.setMate(JOptionPane.showInputDialog(null, "Digite novamente o material[Poliester / Algodao / La / Lycra / Seda]","Atualização",0));
                            }
                            catch(MateRoupaException mre){
                                    mre.MateRoupa();
                                    k1 = mre.corrMat(k1);	
                            }


                            try{
                                    k1.setGen(JOptionPane.showInputDialog(null, "Digite novamente o público-alvo[Masculino / Feminino / Unissex]","Atualização",0));
                            }
                            catch(GenException ge){
                                    ge.GenEx();
                                    k1 = ge.corrGen(k1);
                            }

                            try{
                                    k1.setBolso(JOptionPane.showInputDialog(null, "Digite novamente a a calça apresenta Bolso [Sim / Não]","Atualização",0));
                            }
                            catch(VerdadException ece){
                                    ece.Verdad();
                                    k1 = ece.corrOpc(k1);
                            }


                            try{
                                    k1.setSuporte(JOptionPane.showInputDialog(null, "Digite novamente se a calça apresenta suporte de cinto[Sim / Nao]","Atualização",0));
                            }
                            catch(VerdadException ece){
                                    ece.Verdad();
                                    k1 = ece.corrOpc(k1);
                            }

                            try{
                                    k1.setFechamento(JOptionPane.showInputDialog(null, "Digite novamente o modelo de fechamento da calça [Ziper, Botao, Elastico]","Atualização",0));
                            }
                            catch(ModeloException mce){
                                    mce.Modelo();
                                    k1 = mce.corrMod(k1);
                            }

                            k1.setMarca(JOptionPane.showInputDialog(null, "Digite novamente a marca","Atualização",0));

                            k1.setCor(JOptionPane.showInputDialog(null, "Digite novamente a cor","Atualização",0));
                            bdCal.set(i, k1);
                            return k1;
			}
		}
                return null;
	}


	

	
	public void impAllBdCalc(){
		for(int i = 0; i < bdCal.size(); i++){		
		System.out.println("\nInfos da Calca");
		System.out.println("\n O preco da calca e: R$"+bdCal.get(i).getPreco());
		System.out.println("\n A marca da calca e: "+bdCal.get(i).getMarca());		
		System.out.println("\n O material da calca e: "+bdCal.get(i).getMate());
		System.out.println("\n Publico-alvo da calca: "+bdCal.get(i).getGen());
		System.out.println("\n A cor da calca e: "+bdCal.get(i).getCor());
		System.out.println("\n O tamanho da calca e: "+bdCal.get(i).getTaman());
		System.out.println("\n Presenca de bolso: "+bdCal.get(i).getBolso());
		System.out.println("\n Presenca de suporte para cinto: "+bdCal.get(i).getSuporte());
		System.out.println("\n O modelo de fechamento da calca e: "+bdCal.get(i).getFechamento());
		System.out.println("\n O codigo da blusa e: "+bdCal.get(i).getCod());

		}
	}
			
		
}