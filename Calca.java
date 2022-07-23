/* Leonardo Lopes Rodrigues Silva */
/* RA: 2266431 */

public class Calca extends Roupas implements custo{

private String bolso = "";
private String suporte = "";
private String fechamento = "";

@Override
	public void Relator(){
	System.out.println("Informacoes da Cal�a");
	}
	

	public String getBolso(){
		return bolso;
	}

	public String getSuporte(){
		return suporte;
	}

	public String getFechamento(){
		return fechamento;
	}

	public void setBolso(String bolso) throws VerdadException{
		if(bolso.equalsIgnoreCase("SIM")||bolso.equalsIgnoreCase("NAO")){
		this.bolso = bolso;
		}else{
			throw new VerdadException();
			}
	}

	public void setSuporte(String suporte) throws VerdadException{
		if(suporte.equalsIgnoreCase("SIM")||suporte.equalsIgnoreCase("NAO")){
		this.suporte = suporte;
		}else{
			throw new VerdadException();
			}
	}

	public void setFechamento(String fechamento)throws ModeloException{
		if(fechamento.equalsIgnoreCase("Ziper")||fechamento.equalsIgnoreCase("botao")||fechamento.equalsIgnoreCase("elastico")){
		this.fechamento = fechamento;
		}else{
			throw new ModeloException();
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