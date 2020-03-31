package controller;
import java.util.ArrayList;
import java.util.List;
import model.*;
public class Controller {

	private List<Funcionarios> listaFuncionarios = new ArrayList<>();

    public void adicionar(Funcionarios func) {
        listaFuncionarios.add(func);
    }

    public String listarFuncionarios() {
        String saida = "";
        if (listaFuncionarios.isEmpty()) {
            return "Lista Vazia!";
        }

        for (Funcionarios func : listaFuncionarios) {
            saida += func.toString() + "\n";
        }

        return saida;
    }

    
    public String listarDependentes(String cpf) {
        String saida = "";

        if (listaFuncionarios.isEmpty()) {
            return "Lista Vazia!";
        }

        for (Funcionarios func  : listaFuncionarios) {
          
            if (func.getDependentes().getCpf().equals(cpf)) {
                saida += func.toString() + "\n";
            }
        }
        
        return saida;
    }

    public int calcularTotalDependentes(String cpf) {
        int totalDependentes = 0;
        if (!listaFuncionarios.isEmpty()) {

            for (Funcionarios func : listaFuncionarios) {
                
                if (func.getDependentes().getCpf().equals(cpf)) {
                    totalDependentes++;
                }
            }

            return totalDependentes;

        } else {
            return 0;
        }
    }
	
}
