
# SistemaControleDespesas
Sistema simples de controle de despesas em Java

## Estratégia de Construção do Sistema


- Abstração: cada elemento (Usuário, Despesa, Tipo de Despesa) foi modelado como uma classe independente.
- Encapsulamento: os atributos das classes são privados e acessados por métodos públicos.
- Herança: as diferentes categorias de despesa (Alimentação, Transporte, Eventual) herdam da classe abstrata `Despesa`.
- Polimorfismo: o sistema trata diferentes tipos de despesa através da mesma referência da classe `Despesa`.
- Interface: a interface `Pagavel` define o contrato para o método `pagar()`.
- Persistência: os dados são gravados e lidos de arquivos `.txt`.
- Criptografia: as senhas dos usuários são armazenadas com **hash SHA-256**.


## Funcionalidades Principais

### 1. Menu Principal
- Entrar despesa  
- Anotar pagamento  
- Listar despesas  
- Gerenciar tipos de despesa  
- Gerenciar usuários  
- Sair
### 2. Entrar Despesa
Permite registrar uma nova despesa com:
- Descrição  
- Valor  
- Data de vencimento  
- Categoria (Alimentação, Transporte, Eventual)

### 3. Anotar Pagamento
Permite marcar uma despesa como paga.

### 4. Listar Despesas
Lista despesas pagas ou pendentes com filtros por categoria.

### 5. Gerenciar Usuários
Permite cadastrar e listar usuários.
As senhas são criptografadas antes de serem salvas.

## Estrutura de Classes

| Classe | Tipo | Descrição |

| **Main** | Principal | Gerencia o menu e controla o fluxo geral do sistema |

| **Despesa** | Abstrata | Define os atributos e métodos base de uma despesa |

| **Alimentacao**, **Transporte**, **DespesaEventual** | Concretas | Especializações de `Despesa` que sobrescrevem o método `exibirDetalhes()` |

| **Usuario** | Concreta | Representa o usuário do sistema, com login e senha criptografada |

| **TipoDespesa** | Concreta | Permite criar e gerenciar categorias personalizadas |

| **Pagavel** | Interface | Define o contrato para o método `pagar()` |

| **DespesaService** | Classe de serviço | Salva e lê despesas de arquivos de texto |

| **UsuarioService** | Classe de serviço | Cadastra e lista usuários |

| **Criptografia** | Utilitária | Responsável por criptografar senhas (SHA-256) |

## Documentação das Classes
### Classe `Despesa`
Representa uma despesa genérica.
**Atributos:**
- `descricao` (String)
- `valor` (double)
- `dataVencimento` (String)
- `categoria` (String)
- `paga` (boolean)

**Métodos principais:**
- `pagar(double valor, String dataPagamento)`
- `exibirDetalhes()`
- `toString()`

## Classe `Usuario`
Representa um usuário do sistema.
**Atributos:**
- `login` (String)
- `senhaCriptografada` (String)

**Métodos principais:**
- `getLogin()`
- `getSenhaCriptografada()`
- `toString()`