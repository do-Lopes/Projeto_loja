/* Leonardo Lopes Rodrigues Silva */
/* RA: 2266431 */

public class Blusa extends Roupas implements custo{

private String gorro = "";
private String modelo = "";
private String estampa = "";

	public void Relator(){
	System.out.println("Informacoes da Blusa");
	}	


	public String getGorro(){
		return gorro;
		}

	public String getModelo(){
		return modelo;
		}

	public String getEstampa(){
		return estampa;
		}

	public void setGorro(String gorro) throws VerdadException{
		if(gorro.equalsIgnoreCase("SIM")||gorro.equalsIgnoreCase("NAO")){
		this.gorro = gorro;
		}else{
			throw new VerdadException();
			}
	}

	public void setModelo(String modelo) throws ModeloException{
		if(modelo.equalsIgnoreCase("Blazer")||modelo.equalsIgnoreCase("Canguru")||modelo.equalsIgnoreCase("Sobretudo")||modelo.equalsIgnoreCase("Corta vento")){
		this.modelo = modelo;
		}else{
			throw new ModeloException();
			}
	}

	public void setEstampa(String estampa)throws VerdadException{
		if(estampa.equalsIgnoreCase("SIM")||estampa.equalsIgnoreCase("NAO")){
		this.estampa = estampa;
		}else{
			throw new VerdadException();
			}
	}
	
@Override
	public int getCusto(String mate){
		if(mate.equalsIgnoreCase("Algodao")){
		int custo=70;
		return custo;
		}
		if(mate.equalsIgnoreCase("Seda")){
		int custo=80;
		return custo;
		}
		if(mate.equalsIgnoreCase("La")){
		int custo=65;
		return custo;
		}
		if(mate.equalsIgnoreCase("poliester")){
		int custo=20;
		return custo;
		}
		if(mate.equalsIgnoreCase("lycra")){
		int custo=65;
		return custo;
		}
                return 0;
	}
}
	
