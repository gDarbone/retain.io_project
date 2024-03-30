#language: pt

Funcionalidade: Teste de Login

  Contexto:
    Dado que eu acesse a pagina de teste

  Esquema do Cenário: Usuario Correto
    Quando eu preencho campo de usuario com <login>
    E preencho o campo de senha com <password>
    E clico no botão de logar
    Então O login foi feito com sucesso
    Exemplos:
      | login                     | password       |
      | "standard_user"           | "secret_sauce" |
      | "problem_user"            | "secret_sauce" |
      | "performance_glitch_user" | "secret_sauce" |
      | "error_user"              | "secret_sauce" |
      | "visual_user"             | "secret_sauce" |

  Esquema do Cenário: Login sem sucesso
    Quando eu preencho campo de usuario com <login>
    E preencho o campo de senha com <password>
    E clico no botão de logar
    Então O usuario ou senha esta incorreto
    Exemplos:
      | login                     | password       |
      | "123"                     | "secret_sauce" |
      | "sdfjasdf"                | "secret_sauce" |
      | "standard_user"           | "123123123123" |
      | "problem_user"            | "123123123123" |
      | "performance_glitch_user" | "123123123123" |
      | "error_user"              | "123123123123" |
      | "visual_user"             | "123123123123" |

  Esquema do Cenário: Login com usuario bloqueado
    Quando eu preencho campo de usuario com <login>
    E preencho o campo de senha com <password>
    E clico no botão de logar
    Então O usuario esta bloqueado
    Exemplos:
      | login              | password       |
      | "locked_out_user"  | "secret_sauce" |
