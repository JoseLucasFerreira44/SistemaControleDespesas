package servicos;

import model.Despesa;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ServicosDespesa {
    private static final String ARQUIVO = "despesas.txt";

    public static void salvar(Despesa d) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO, true))) {
            bw.write(d.toString());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar despesa.");
        }
    }
    public static List<String> listar() {
        List<String> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = br.readLine()) != null) lista.add(linha);
        } catch (IOException e) {
            System.out.println("Erro ao ler despesas.");
        }
        return lista;
    }
}