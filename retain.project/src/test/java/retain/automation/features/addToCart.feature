#language: pt

Funcionalidade: Adicionar produto ao carrinho

  Contexto:
    Dado que eu acesse a pagina de teste
    Quando eu preencho campo de usuario com "standard_user"
    E preencho o campo de senha com "secret_sauce"
    E clico no botão de logar
    Então O login foi feito com sucesso


  Esquema do Cenário: adicionar um produto ao carrinho
    Dado que eu adiciono o <ordem> produto ao carrinho
    E clico no carrinho
    Entao o produto foi adicionada com sucesso
    Exemplos:
      | ordem      |
      | "primeiro" |
      | "segundo " |
      | "terceiro" |
      | "quarto"   |
      | "quinto"   |

  Esquema do Cenário: adicionar dois produto ao carrinho
    Dado que eu adiciono o <ordem> produto ao carrinho
    Dado que eu adiciono o <ordem2> produto ao carrinho
    E clico no carrinho
    Entao o produto foi adicionada com sucesso
    Exemplos:
      | ordem      | ordem2     |
      | "primeiro" | "segundo"  |
      | "segundo " | "terceiro" |
      | "terceiro" | "quarto"   |
      | "quarto"   | "quinto"   |
      | "quinto"   | "sexto"    |
