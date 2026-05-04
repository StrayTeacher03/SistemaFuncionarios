

public class TesteSistema {
    public static void main(String[] args) {
        Departamento dep = new Departamento("Tecnologia da Informação");
        Funcionario func1 = new Funcionario("Miguel", "999.999.999-99", "Supervisor de TI", 5000.00);
        Funcionario func2 = new Funcionario("Isaque", "000.000.000-00", "Desenvolvedor Frontend", 2500.00);
        Funcionario func3 = new Funcionario("Mateus", "123.456.789-67", "Faxineiro", 1621.00);
        Funcionario func4 = new Funcionario();


        func4.alterarDados("Keslley", "987.654.321-00", "Dono da empresa", 15000.00);

        dep.adicionarFuncionario(func1);
        dep.adicionarFuncionario(func2);
        dep.adicionarFuncionario(func3);
        dep.adicionarFuncionario(func4);

        func1.aplicarReajuste(15);

        func3.demitir();
        func4.contratar();

        dep.listarFuncionarios();

        System.out.println("O total da folha salarial dos funcionários ativos é: R$" + dep.calcularFolhaSalarial());

    }    
}
