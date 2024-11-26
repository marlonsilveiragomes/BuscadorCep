import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite um número de CEP para consulta:");
        var cep = leitura.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradeorDeArquivo gerador = new GeradeorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Finalizando a aplicação");
        }


    }
}
