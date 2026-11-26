package Aulas;

import java.util.HashMap;
import java.util.Map;

public class EstudoHashMap {
    public static void main(String[] args) {
        HashMap <String, Integer> pessoas = new HashMap<>();

        pessoas.put("João", 25);
        pessoas.put("Maria", 30);
        pessoas.put("Pedro", 22);

        for (Map.Entry<String, Integer> pessoa : pessoas.entrySet()) {

            System.out.println( pessoa.getKey() + " - " + pessoa.getValue());

        }
    }
}
