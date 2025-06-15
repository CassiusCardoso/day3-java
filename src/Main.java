import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String, Set<String>> projetosPorFunc = new HashMap<>();
        projetosPorFunc.put("Projeto TI", Set.of("Pedro"));
        projetosPorFunc.put("Projeto TR", Set.of("João"));
        projetosPorFunc.put("Projeto XTO", Set.of("Maria"));
        projetosPorFunc.put("Projeto", Set.of("Antônio"));

        List<String> funcionarios = projetosPorFunc.values().stream().flatMap(Set::stream).collect(Collectors.toList());
        Map<String, Set<String>> projetos = projetosPorFunc.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue()));

        System.out.println(projetos);
    }
}