# Sistema de Controle de Despesas
## Descrição do Projeto
O Sistema de Controle de Despesas é um programa desenvolvido em Java com o objetivo de auxiliar o usuário a registrar, consultar e gerenciar suas despesas de forma simples e organizada.
	O sistema permite:
- Cadastrar despesas e pagamentos
- Listar despesas pagas e em aberto
- Gerenciar tipos de despesas
- Gerenciar usuários com senhas criptografadas
- Armazenar todos os dados em arquivos de texto
## Estrutura e Organização
O projeto está organizado em pacotes que separam as responsabilidades das classes.

## Conceitos de POO Aplicados

| Conceito | Aplicação |
|-----------|------------|
| **Encapsulamento** | Uso de atributos privados com getters e setters |
| **Herança** | `Alimentacao`, `Transporte` e `DespesaEventual` herdam de `Despesa` |
| **Polimorfismo** | As subclasses de `Despesa` personalizam comportamentos |
| **Abstração** | A classe `Despesa` define comportamentos comuns às despesas |
| **Interface (Pagável)** | Define contrato para despesas que podem ser pagas |
| **Métodos Estáticos** | Controle global de número de despesas cadastradas |
| **Criptografia** | Método para criptografar senhas de usuários antes de salvar |
| **Persistência** | Leitura e escrita de dados em arquivos `.txt` |

## Funcionalidades Implementadas

	Menu Principal
- Entrar Despesa
- Anotar Pagamento
- Listar Despesas (pagas/em aberto)
- Gerenciar Tipos de Despesa
- Gerenciar Usuários
- Sair

### Gerenciar Usuários
- Cadastrar novo usuário com login e senha criptografada
- Listar usuários cadastrados

### Entrar Despesa
- Descrição, valor, data e categoria (Alimentação, Transporte, etc.)

### Anotar Pagamento
- Marca despesa como paga e salva data do pagamento

## Armazenamento em Arquivos
Os dados são armazenados em arquivos `.txt`
usuarios.txt
despesas.txt
tipos_despesa.txt
