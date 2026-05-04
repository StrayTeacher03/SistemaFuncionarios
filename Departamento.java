

public class Departamento {
    private String nomeDepartamento;
    private Funcionario[] funcionarios;
    int funcionariosAd;

    public Departamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
        this.funcionarios = new Funcionario[5];
        this.funcionariosAd = 0;
    }

    public void adicionarFuncionario(Funcionario func) {
        if (funcionarios.length == funcionariosAd) {
            System.out.println("Departamento lotado. Não é possível adicionar mais funcionários.");
        } else {
            funcionarios[funcionariosAd] =func;
            funcionariosAd++;
        }

    }

    public void listarFuncionarios() {
        for (Funcionario func : funcionarios) {
            if (func != null) {
                func.exibirDados();
                System.out.println("-----------------------------");
            }
        }
    }

    public double calcularFolhaSalarial() {
        double total = 0.0;

        for (Funcionario func : funcionarios) {
            if (func != null && func.isAtivo()) {
                total += func.getSalario();
            }
        }

        return total;
    }

}
