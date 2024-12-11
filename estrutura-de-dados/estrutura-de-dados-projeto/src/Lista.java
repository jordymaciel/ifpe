class Lista {
    private No ref;

    public Lista() {
        this.ref = null;
    }

    public void insere(int info) {
        No novoNo = new No(info);

        if (ref == null) {
            ref = novoNo;
            ref.prox = ref;
        } else {
            No atual = ref;
            No anterior = null;


            do {
                if (info <= atual.info) break;
                anterior = atual;
                atual = atual.prox;
            } while (atual != ref);

            if (anterior == null) {
                novoNo.prox = ref;

                No ultimo = ref;
                while (ultimo.prox != ref) ultimo = ultimo.prox;
                ultimo.prox = novoNo;
                ref = novoNo;
            } else {
                novoNo.prox = atual;
                anterior.prox = novoNo;
                if (atual == ref && info >= ref.info) ref = novoNo;
            }
        }
    }


    public String imprime() {
        if (ref == null) return "lista vazia";

        StringBuilder resultado = new StringBuilder();
        No atual = ref.prox;

        do {
            resultado.append(atual.info).append(" ");
            atual = atual.prox;
        } while (atual != ref.prox);

        return resultado.toString().trim();
    }

    public void remove(int info, boolean duplicados) {
        if (ref == null) return;

        No atual = ref.prox;
        No anterior = ref;
        boolean encontrado = false;

        do {
            if (atual.info == info) {
                encontrado = true;
                anterior.prox = atual.prox;
                if (atual == ref) ref = anterior;

                if (!duplicados) return;
                atual = anterior.prox;
            } else {
                anterior = atual;
                atual = atual.prox;
            }
        } while (atual != ref.prox && (!encontrado || duplicados));
    }
}