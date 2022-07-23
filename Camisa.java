/* Leonardo Lopes Rodrigues Silva */
/* RA: 2266431 */

public class Camisa extends Roupas implements custo{

private String estampa = "";
private String modelo = "";
private String gola = "";

	public void Relator(){
	System.out.println("Informacoes da Camisa");
	}
	

	public String getEstampa(){
		return estampa;
		}

	public String getModelo(){
		return modelo;
		}

	public String getGola(){
		return gola;
		}

	
	public void setEstampa(String estampa) throws VerdadException{
		if(estampa.equalsIgnoreCase("SIM")||estampa.equalsIgnoreCase("NAO")){
		this.estampa = estampa;
		}else{
			throw new VerdadException();
			}
	}

	public void setModelo(String modelo) throws ModeloException{
		if(modelo.equalsIgnoreCase("curta")||modelo.equalsIgnoreCase("longa")||modelo.equalsIgnoreCase("regata")){
		this.modelo = modelo;
		}else{
			throw new ModeloException();
			}
	}

	public void setGola(String gola) throws GolaCamiException{
		if(gola.equalsIgnoreCase("redonda")||gola.equalsIgnoreCase("V")||gola.equalsIgnoreCase("polo")||gola.equalsIgnoreCase("canoa")){
		this.gola = gola;
		}else{
			throw new GolaCamiException();
			}
	}

	
@Override
	public int getCusto(String mate){
		int custo=0;
		if(mate.equalsIgnoreCase("Algodao")){
		custo=70;
                return custo;
		
		}
		if(mate.equalsIgnoreCase("Seda")){
		custo=80;
                return custo;
		
		}
		if(mate.equalsIgnoreCase("La")){
		custo=65;
                return custo;
		
		}
		if(mate.equalsIgnoreCase("poliester")){
		custo=20;
                return custo;
		
		}
		if(mate.equalsIgnoreCase("lycra")){
		custo=65;
                return custo;
		
		}
                return 0;
	}


}
