#language: pt

Funcionalidade: Remover produto ao carrinho

  Contexto:
    Dado que eu acesse a pagina de teste
    Quando eu preencho campo de usuario com "standard_user"
    E preencho o campo de senha com "secret_sauce"
    E clico no botão de logar
    Então O login foi feito com sucesso

  Esquema do Cenário: remover um produto do carrinho na main Page
    Dado que eu adiciono o <ordem> produto ao carrinho
    E clico em remover o <ordem> produto do carrinho
    E clico no carrinho
    Entao o produto foi removido com sucesso
    Exemplos:
      | ordem      |
      | "primeiro" |
      | "segundo " |
      | "terceiro" |
      | "quarto"   |
      | "quinto"   |

