public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.insere(3);
        lista.insere(1);
        lista.insere(5);
        lista.insere(4);
        lista.insere(2);

        System.out.println(lista.imprime());

        lista.remove(3, false);
        System.out.println(lista.imprime());

        lista.remove(2, true);
        System.out.println(lista.imprime());
    }
}