import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {

 public static void main(String args[]) {

    ArrayList cores = new ArrayList();

    cores.add("Azul");
    cores.add("Verde");
    cores.add("Vermelho");
    cores.add("Rosa");
    cores.add("Amarelo");
    cores.add("Preto");
    
    // Usamos o iterator para mostrar o conteúdo do ArrayList
    System.out.print("Conteudo de cores:\n");
    Iterator iterator = cores.iterator();
    while(iterator.hasNext()) {
       Object element = iterator.next();
       System.out.print(element + "\n");
    }
    System.out.println();

    // Modificar objetos que estão sendo iterados usando ListIterator
    ListIterator listiterator = cores.listIterator();
    while(listiterator.hasNext()) {
       Object element = listiterator.next();
       listiterator.set(element + " Escuro");
    }
    
    // Imprimir objetos modificados
    System.out.print("\n\nCores modificadas:\n");
    iterator = cores.iterator();
    while(iterator.hasNext()) {
       Object element = iterator.next();
       System.out.print(element + "\n");
    }
    System.out.println();

    System.out.print("\n\nCores modificada de trás para frente:\n");
    while(listiterator.hasPrevious()) {
       Object element = listiterator.previous();
       System.out.print(element + "\n");
     }
     System.out.println();
  }
}