package camadafila;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
public class Camadafila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
       Scanner sc = new Scanner(System.in);
       int opcao;
       do {
    	   System.out.println("Menu");
    	   System.out.println("1: Adicionar um novo cliente na fila");
    	   System.out.println("2: Listar todos os clientes na fila");
    	   System.out.println("3: Chamar (retirar) uma pessoa da fila");
    	   System.out.println("0: Finalizar o programa");
    	   opcao = Integer.parseInt(sc.nextLine());
    	   switch (opcao) {
    	   case 1:
    		   
    		   System.out.println("Digite o nome do cliente:");
               String nome = sc.nextLine().trim();
               fila.add(nome);
            
               System.out.println("Cliente " + nome + " adicionado na fila.");
               break;
           case 2: 
        	   
               if (fila.isEmpty()) {
                   System.out.println("A fila está vazia.");
               } else {
                   System.out.println("A fila tem " + fila.size() + " clientes.");
                   for (String cliente : fila) {
                       System.out.println(cliente);
                   }
               }
               break;
           case 3:
             
               if (fila.isEmpty()) {
                   System.out.println("A fila está vazia.");
               } else {
                   String chamado = fila.remove();
                   System.out.println("Cliente " + chamado + " chamado.");
               }
               break;
           case 0:
               System.out.println("Obrigado por usar o programa. Até mais!");
               break; 
           default:
               System.out.println("Opção inválida. Digite um número entre 0 e 3.");
       }
   } while (opcao != 0); 

 
   sc.close();
}

}

