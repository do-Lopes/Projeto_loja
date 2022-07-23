/* Leonardo Lopes Rodrigues Silva */
/* RA: 2266431 */

import java.util.List;
import java.util.ArrayList;

public class Menu{

		private Camisa c1;

		private List<Camisa> bdCam = new ArrayList<Camisa>();		

		private Blusa b1;

		private List<Blusa> bdBlu = new ArrayList<Blusa>();

		private Calca k1;

		private List<Calca> bdCal = new ArrayList<Calca>();

		private Leitor Ler = new Leitor();

		private GerCamisa cam = new GerCamisa();	

		private GerBlusa blu = new GerBlusa();

		private GerCalca cal = new GerCalca();

	public void MenuRoup(){
		boolean x = true;
		int y = 0;

		while(x){
			System.out.println("1) Cadastrar uma roupa");
			System.out.println("2) Listar Roupas");
			System.out.println("3) Localizar Roupa pelo codigo");
			System.out.println("4) Remover Roupa pelo codigo");
			System.out.println("5) Atualizar dados da Roupa");
			System.out.println("6) Sair do Sistema");
			try{
				y = Integer.parseInt(Ler.entDados("\nEscolha uma opcao"));
			}
			catch(NumberFormatException nfe){
				Ler.entDados("\nO valor deve ser um inteiro");
				continue;
			}
			
			switch(y){
				case 1:
					System.out.println("\n1) Cadastro de Roupa");
					String caso1 = Ler.entDados("\nQual tipo de roupa ser� cadastrada: [Camisa]/[Blusa]/[Calca]");
					if(caso1.equalsIgnoreCase("camisa")){
						c1 = new Camisa();
						c1 = cam.cadCam(c1);
						if(c1 != null){
							Ler.entDados("\nRoupa cadastrada");
						}else{
							Ler.entDados("\nO codigo da Roupa ja foi utilizado");
						}
					}
					if(caso1.equalsIgnoreCase("blusa")){
						b1 = new Blusa();
						b1 = blu.cadBlu(b1);
						if(b1 != null){
							Ler.entDados("\nRoupa cadastrada");
						}else{
							Ler.entDados("\nO codigo da Roupa ja foi utilizado");
						}
					}
					if(caso1.equalsIgnoreCase("calca")){
						k1 = new Calca();
						k1 = cal.cadCal(k1);
						if(k1 != null){
							Ler.entDados("\nRoupa cadastrada");
						}else{
							Ler.entDados("\nO codigo da Roupa ja foi utilizado");
						}
					}
					break;
				case 2:
					System.out.println("\n2) Listar Roupas");
					String caso2 = Ler.entDados("\nQual tipo de roupa ser� listada: [Camisa]/[Blusa]/[Calca]");
					if(caso2.equalsIgnoreCase("camisa")){
						cam.impAllBdCams();
					}
					if(caso2.equalsIgnoreCase("blusa")){
						blu.impAllBdBlus();
					}
					if(caso2.equalsIgnoreCase("calca")){
						cal.impAllBdCalc();
					}
					break;
				case 3:
					System.out.println("\n3)Consultar roupa pelo codigo");
					String caso3 = Ler.entDados("\nQue tipo de roupa sera consultada: [Camisa]/[Blusa]/[Calca]");
					if(caso3.equalsIgnoreCase("camisa")){
						c1 = new Camisa();
						c1.setCod(Integer.parseInt(Ler.entDados("\n Informe o codigo da camisa a ser consultada: ")));
						c1 = cam.consCamCod(c1);
					
						if(c1 != null){
							cam.impOneCam(c1);
						}else{
							Ler.entDados("\nNao existe essa camisa");
						}
					}
					if(caso3.equalsIgnoreCase("blusa")){
						b1 = new Blusa();
						b1.setCod(Integer.parseInt(Ler.entDados("\n Informe o codigo da blusa a ser consultada: ")));
						b1 = blu.consBluCod(b1);
					
						if(b1 != null){
							blu.impOneBlu(b1);
						}else{
							Ler.entDados("\nNao existe essa Blusa");
						}
					}
					if(caso3.equalsIgnoreCase("calca")){
						k1 = new Calca();
						k1.setCod(Integer.parseInt(Ler.entDados("\n Informe o codigo da calca a ser consultada: ")));
						k1 = cal.consCalCod(k1);
					
						if(k1 != null){
							cal.impOneCal(k1);
						}else{
							Ler.entDados("\nNao existe essa Calca");
						}
					}
					break;
				case 4:
					System.out.println("4) Remover Roupa pelo codigo");
					String caso4 = Ler.entDados("\nQual tipo de roupa sera removida: [Camisa]/[Blusa]/[Calca]");
					if(caso4.equalsIgnoreCase("camisa")){
						c1 = new Camisa();
						c1.setCod(Integer.parseInt(Ler.entDados("\n Informe o codigo da camisa a ser removida: ")));
						c1 = cam.consCamCod(c1);
					
						if(c1 != null){
							cam.removeCamCod(c1);
						}else{
							Ler.entDados("\nNao existe essa camisa");
						}
					}
					if(caso4.equalsIgnoreCase("blusa")){
						b1 = new Blusa();
						b1.setCod(Integer.parseInt(Ler.entDados("\n Informe o codigo da blusa a ser removida: ")));
						b1 = blu.consBluCod(b1);
					
						if(b1 != null){
							blu.removeBluCod(b1);
						}else{
							Ler.entDados("\nNao existe essa blusa");
						}
					}
					if(caso4.equalsIgnoreCase("calca")){
						k1 = new Calca();
						k1.setCod(Integer.parseInt(Ler.entDados("\n Informe o codigo da calca a ser removida: ")));
						k1 = cal.consCalCod(k1);
					
						if(k1 != null){
							cal.removeCalCod(k1);
						}else{
							Ler.entDados("\nNao existe essa calca");
						}
					}
					break;
				case 5:
					System.out.println("5) atualizar dados da Roupa pelo codigo");
					String caso5 = Ler.entDados("Qual tipo de roupa sera atualizada: [Camisa]/[Blusa]/[Calca]");
					if(caso5.equalsIgnoreCase("camisa")){
						c1 = new Camisa();
						c1.setCod(Integer.parseInt(Ler.entDados("\n Informe o codigo da camisa a ser atualizada: ")));
						c1 = cam.consCamCod(c1);
					
						if(c1 != null){
							cam.AttCamCod(c1);
						}else{
							Ler.entDados("\nNao existe essa roupa");
						}
					}
					if(caso5.equalsIgnoreCase("blusa")){
						b1 = new Blusa();
						b1.setCod(Integer.parseInt(Ler.entDados("\n Informe o codigo da blusa a ser atualizada: ")));
						b1 = blu.consBluCod(b1);
					
						if(b1 != null){
							blu.AttBluCod(b1);
						}else{
							Ler.entDados("\nNao existe essa blusa");
						}
					}
					if(caso5.equalsIgnoreCase("calca")){
						k1 = new Calca();
						k1.setCod(Integer.parseInt(Ler.entDados("\n Informe o codigo da calca a ser atualizada: ")));
						k1 = cal.consCalCod(k1);
					
						if(k1 != null){
							cal.AttCalCod(k1);
						}else{
							Ler.entDados("\nNao existe essa calca");
						}
					}
					break;
				case 6:
					String resp = Ler.entDados("\nDeseja realmente sair do sistema? [SIM][NAO]");
					if(resp.equalsIgnoreCase("Sim")){
						System.exit(0);
					}else{
						break;
					}
				default:
					Ler.entDados("\nOpcao invalida");
					break;
		}


	}
}

			
		
}
