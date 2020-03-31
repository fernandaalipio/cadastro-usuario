package main;



import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
     boolean invalido;
     
     do {
    	 invalido=true;
    	 try {
    		 
    		 int resp;
    		 resp=1;
    		 
    		 
    		 int opcao = Integer.parseInt(JOptionPane.showInputDialog("======Menu de Opções=====\n"
                     + "1- Cadastrar Funcionário\n"
                     + "2- Listar Funcionários \n"
                     + "3- Alterar atributos de um funcionário\n"
                     + "4- Deletar Funcionário\n"
                     + "5- Sair \n"
                     + "Escolha sua opção:"));
             
             switch (opcao) {
             
             case 1:
            	 do {
            		 JOptionPane.showMessageDialog(null, "========== Cadastro ==========");
            		 
            		 resp = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar mais um funcionário?\n"
                             + "1- Sim\n"
                             + "2- Não"));
                 } while (resp == 1);
                 break;
             case 2:
                 
            	 JOptionPane.showMessageDialog(null, "========== Listando ==========");
                 
                 
                 break;
             case 3:
            	 JOptionPane.showMessageDialog(null, "============ Altere os atributos ==========");
            
               
                 break;
             case 4:
            	 JOptionPane.showMessageDialog(null, "============ Deletar ============");
              
                 
                 break;
             case 5:
            	 
                 System.exit(0);
                 
                 break;
             
             default:
            	 
                 JOptionPane.showMessageDialog(null, "Opção não encontrada");
                 
                  }
             
         } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null, "Apenas números!!!!!!!!", "ERRO", JOptionPane.ERROR_MESSAGE);
     }
    	 
 } while (invalido = !false);
            
     
     
	}
    	     
}
     
	


