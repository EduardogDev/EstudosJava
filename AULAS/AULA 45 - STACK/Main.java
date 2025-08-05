import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Main {
    public static void main(String[] args) {


        //Array
        //São estaticos e tem referencia de memoria
        String[] ninjaArray = new String[5];
        ninjaArray[0] = "Naruto";
        ninjaArray[1] = "Sasuke";
        ninjaArray[2] = "Sakura";
        ninjaArray[3] = "Kakashi";
        ninjaArray[4] = "Hinata";

        //Listas são dinamicas e tamanho aumenta e dimunui conforme necessário
        List<String> ninjaList = new ArrayList<>();
        ninjaList.add("Naruto");
        ninjaList.add("Sasuke");
        ninjaList.add("Sakura");
        ninjaList.add("Kakashi");
        ninjaList.add("Hinata");
        //Stack
        //O ultimo elemento adicionado é o primeiro a ser removido (LIFO - Last In First Out)
        //Stack é uma classe que implementa a interface List
        //Stack é uma estrutura de dados que permite adicionar e remover elementos de forma semelhante a uma pilha
        Stack<String> ninjStack = new Stack<>();
        ninjStack.push("Naruto");// Adiciona "Naruto" ao topo da pilha
        ninjStack.push("Sasuke");// Adiciona "Sasuke" ao topo da pilha
        ninjStack.push("Sakura");// Adiciona "Sakura" ao topo da pilha
        ninjStack.push("Kakashi");// Adiciona "Kakashi" ao topo da pilha
        ninjStack.push("Hinata");// Adiciona "Hinata" ao topo da pilha
        ninjStack.push("Rock Lee");// Adiciona "Rock Lee" ao topo da pilha
        ninjStack.push("Tenten");// Adiciona "Tenten" ao topo da pilha

        ninjStack.pop(); // Remove "Hinata"
        System.out.println("Topo da pilha: " + ninjStack.peek()); // Mostra "Kakashi"
        System.out.println("Tamanho da pilha: " + ninjStack.size());

        // Exibindo os elementos do Array
        System.out.println("Array de Ninjas: " + Arrays.toString(ninjaArray));
        // Exibindo os elementos da Lista
        System.out.println("Lista de Ninjas: " + ninjaList);
        // Exibindo os elementos da Pilha
        System.out.println("Pilha de Ninjas: " + ninjStack);
        
    }
}