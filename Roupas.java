/* Leonardo Lopes Rodrigues Silva */
/* RA: 2266431 */

abstract class Roupas{
	private int preco;
	private String marca = "";
	private String mate = "";
	private String gen = "";
	private String cor = "";
	private String taman = "";
	private int cod;

	public int getPreco(){
		return preco;
		}

	public String getTaman(){
		return taman;
		}
	
	public String getMarca(){
		return marca;
		}

	public String getMate(){
		return mate;
		}

	public String getGen(){
		return gen;
		}

	public String getCor(){
		return cor;
		}
	
	public int getCod(){
		return cod;
		}	

	public void setCod(int cod){
		this.cod=cod;
	}

	public void setPreco(int preco) throws NumbNuloException{
		if(preco>0){	
		this.preco = preco;
			}else{
				throw new NumbNuloException();
				}
                
		}
	
	public void setTaman(String taman) throws TamanRoupException{
		if(taman.equalsIgnoreCase("P")||taman.equalsIgnoreCase("PP")||taman.equalsIgnoreCase("M")||taman.equalsIgnoreCase("G")||taman.equalsIgnoreCase("GG")){		
		this.taman = taman;
			}else{
				throw new TamanRoupException();	
				}
		}
	

	public void setMarca(String marca){
		this.marca = marca;
		}

	public void setMate(String mate) throws MateRoupaException{
		if(mate.equalsIgnoreCase("Algodao")||mate.equalsIgnoreCase("Poliester")||mate.equalsIgnoreCase("La")||mate.equalsIgnoreCase("Seda")||mate.equalsIgnoreCase("lycra")){
		this.mate = mate;
		}else{
			throw new MateRoupaException();
			}
	}

	public void setGen(String gen) throws GenException{
		if(gen.equalsIgnoreCase("Masculino")||gen.equalsIgnoreCase("Feminino")||gen.equalsIgnoreCase("Unissex")){
		this.gen = gen;
		}else{
			throw new GenException();
			}
	}

	public void setCor(String cor){
		this.cor = cor;
		}

	public abstract void Relator();


}
