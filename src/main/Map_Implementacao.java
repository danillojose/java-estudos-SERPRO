package main;
import java.util.HashMap;
import java.util.Map;

public class Map_Implementacao {

    public static void main(String[] args) {

        Map<String, String> contas = new HashMap<>();
        contas.put("11111111111", "conta1");
        contas.put("22222222222", "conta2");
        contas.put("33333333333", "conta3");
        contas.put("44444444444", "conta4");
        contas.put("55555555555", "conta5");
        contas.put("44444444444", "conta6");    //apaga o conta4 (map não aceita valores repetidos)

        String cpf = "44444444444";
        if(contas.containsKey(cpf)){
            System.out.println(contas.get(cpf));
        }
        
        System.out.println("entrySet: " + contas.entrySet());
        System.out.println("keySet: " + contas.keySet());
        System.out.println("values: " + contas.values());

    }
}
