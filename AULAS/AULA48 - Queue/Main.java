import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
    
        Queue<String> ninjaQueue = new LinkedList<>();
        ninjaQueue.add("Naruto");
        ninjaQueue.add("Sasuke");
        ninjaQueue.add("Sakura");
        ninjaQueue.add("Kakashi");
        //MOSTRAR FILA
        System.out.println("Ninjas na fila: " + ninjaQueue);

        //TIRAR UM DA FILA
        ninjaQueue.poll();
        System.out.println("Ninjas na fila: " + ninjaQueue);

        //COMO VER QUEM É O PRIMEIRO DA LISTA
        System.out.println(ninjaQueue.size());

        //NÃO DA PRA DELETAR O CORPO SEM COMEÇAR PELA CABEÇA

        //VERIFICAR SE ESTÁ VAZIO
        if (ninjaQueue.isEmpty()) {
            System.out.println("A fila está vazia");
        }else {
            System.out.println("A fila contem ninjas");
        }

        ninjaQueue.remove();
        System.out.println("Ninjas na fila: " + ninjaQueue);
        ninjaQueue.poll();
        System.out.println("Ninjas na fila: " + ninjaQueue);
        ninjaQueue.remove();
        System.out.println("Ninjas na fila: " + ninjaQueue);
         if (ninjaQueue.isEmpty()) {
            System.out.println("A fila está vazia");
        }else {
            System.out.println("A fila contem ninjas");
        }
    }
}
