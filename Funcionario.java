

public class Funcionario {
    private String nome, cpf, cargo;
    private double salario;
    private boolean ativo;
    
    public Funcionario(String nome, String cpf, String cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
        ativo = true;
    }

    public Funcionario() {
        nome = "Indefinido";
        cpf = "000.000.000-00";
        cargo = "Indefinido";
        salario = 0.0;
        ativo = false;
    }

    public void alterarDados(String nome, String cpf, String cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aplicarReajuste(double percentual) {
        salario += salario * (percentual / 100);
    }
    
    public void demitir() {
        ativo = false;
    }
    public void contratar() {
        ativo = true;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + "\nCPF: " + cpf + "\nCargo: " + cargo + "\nSalário: R$" + salario + "\nAtivo: " + ((ativo) ? "ATIVO" : "INATIVO"));
    }
    
    public boolean isAtivo() {
        return ativo;
    }

    public double getSalario() {
        return salario;
    }

}
