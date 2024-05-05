package controller;

import java.util.ArrayList;
import java.util.List;
import model.Funcionario;
import model.Trabalhavel;

public class CadastroFuncionario {
    
    private static List<Funcionario> listaFuncionario = new ArrayList<>();
    
    public static void cadastrarFuncionario(Funcionario x){
        listaFuncionario.add(x);
    }

    public static boolean removerFuncionario(int matricula){

        for (int i = 0; i < listaFuncionario.size(); i++) {
            Funcionario funcionario = listaFuncionario.get(i);
            if (funcionario.getMatricula() == matricula) {
                listaFuncionario.remove(i); 
                return true; 
            }
        }
        return false;
    }

    public static boolean listaFuncionario() {
       if (listaFuncionario.size() != 0) {
            for (Funcionario temp : listaFuncionario) {
                System.out.println(temp);
            } return true;
       } else {
        return false;
    } 
} 

public static Funcionario buscarFuncionario(int matricula, String termoBusca) {
    for (Funcionario buscaFunc : listaFuncionario) {
        if (buscaFunc.getMatricula() == matricula || buscaFunc.getNome().toLowerCase().contains(termoBusca.toLowerCase())) {
            System.out.println(buscaFunc);

            if (buscaFunc instanceof Trabalhavel) {
                Trabalhavel trabalhavel = (Trabalhavel) buscaFunc;
                System.out.println("\nRealizando tarefas:");
                trabalhavel.trabalhar();
                trabalhavel.relatarProgresso();
            }

            return buscaFunc; 
        }
    }
    return null; 
}
    
}

