package servicos;

import model.Usuario;
import utils.Criptografia;
import java.io.*;

public class ServicosUsuario {
    private static final String ARQUIVO = "usuarios.txt";

public static void cadastrar(String login, String senha) {
    String senhaCripto = Criptografia.criptografar(senha);
    Usuario usuario = new Usuario(login, senhaCripto);
    
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO, true))) {
    bw.write(usuario.toString());
        bw.newLine();
        System.out.println("Usuário cadastrado com sucesso!");
        } catch (IOException e) {
        System.out.println("Erro ao cadastrar usuário.");
        }
    }
public static void listarUsuarios() {
    try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO))) {
        String linha;
        while ((linha = br.readLine()) != null) System.out.println(linha);
    } catch (IOException e) {
        System.out.println("Erro ao listar usuários.");
    }
}
}
