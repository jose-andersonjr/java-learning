package exemplos;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); // Não tem ordem específica no retorno dos dados
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.put("vc", "você2"); // Se inserir dois valores de mesma chave ele sobrescreve e fica com o último valor
        map.put("vc1", "você2");
        map.putIfAbsent("vc", "voce3"); // Ele só vai adicionar se o método ainda não existir ai dentro
        System.out.println(map);
        // map.keySet() Retorna uma vez todos os valores pois ao se basear no valor da chave só encontrará um elemento para cada chave
        // map.values() Permite duas chaves diferente com o mesmo valor
        for (String key: map.keySet()){ // .keySet() retorna um set das chaves
            System.out.println(key + " : " + map.get(key)); //map.get(key) retorna o valor associado a chave
        }

        System.out.println("--------------------");

        for (String value: map.values()) {
            System.out.println(value);
        }

        System.out.println("------------------------");
        // Acessando chave e valor no mesmo método
        for (Map.Entry<String, String> entry: map.entrySet()) { // Objetos que tem a chave e o valor
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
