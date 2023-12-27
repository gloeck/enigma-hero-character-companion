package race;

import java.util.ArrayList;

public class ObjetoGenerico<T, U, V, W, X> {
    private T argumento1;
    private U argumento2;
    private V argumento3;
    private W argumento4;
    private X argumento5;

    public ObjetoGenerico(T argumento1, U argumento2, V argumento3, W argumento4, X argumento5) {
        this.argumento1 = argumento1;
        this.argumento2 = argumento2;
        this.argumento3 = argumento3;
        this.argumento4 = argumento4;
        this.argumento5 = argumento5;
    }

    // Métodos getters e setters, se necessário

    public void exibirInformacoes() {
        System.out.println("Argumento 1: " + argumento1);
        System.out.println("Argumento 2: " + argumento2);
        System.out.println("Argumento 3: " + argumento3);
        System.out.println("Argumento 4: " + argumento4);
        System.out.println("Argumento 5: " + argumento5);
    }

    public static void main(String[] args) {
        Integer arg1 = 42;
        String arg2 = "Texto";
        String arg3 = "Outro Texto";
        ArrayList<String> arg4 = new ArrayList<>();
        arg4.add("Elemento1");
        arg4.add("Elemento2");

        ArrayList<String> arg5 = new ArrayList<>();
        arg5.add("Item1");
        arg5.add("Item2");

        ObjetoGenerico<Integer, String, String, ArrayList<String>, ArrayList<String>> objeto =
                new ObjetoGenerico<>(arg1, arg2, arg3, arg4, arg5);

        objeto.exibirInformacoes();
    }
}
