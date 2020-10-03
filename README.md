# Pratica do curso "Spring MVC: Crie um web app com Thymeleaf e Bootstrap" da Alura

## Aula 1
### Implementações
* Criação da versão inicial via Spring Initializr:
   *Parâmetros usados:
   * Spring version: 2.3.4
	  * Java: 8
	  * Project: Maven
	  * Packaging: JAR
      * Deps: 
         * Spring Boot DevTools
         * Spring Web
         * Thymeleaf
* Import do projeto no Eclipse;
* Primeira execução;
* Criação do primeiro Controller (HelloController.java) com set de uma valor a ser passado para renderização para o Thymeleaf;
* Criação da primeira View (hello.html) com renderização do parâmeto passado pelo Controller.

### Extras
   * End Point com parâmetro opcional, passado como PathVariable e passado para a View por setAttribute;
   * Tratamento do parâmetro passado para o Thymeleaf resolvendo-o para um valor default caso não tenha sido especificado via "Elvis Operator".

## Aula 2
### Implementações
* Criação da entidade **Pedido** do modelo para uso nesta aula;
* Criação da view **home** para visualização da entidade Pedido;
* Criação do controller **HomeController**, que em sua versão inicial criará uma instância de **Pedido** para mostrar na view;
* Injeção de **List<Pedido>** na view e loop nesta lista usando o Thymeleaf;
* Extração de atributos de cada pedido usando Thymeleaf;
* Formatação da página usando Bootstrap.
 
### Extras
* Atribuição dos atributos de valor e data de entrega na entidade criada no Controller.
* Verificação de que os atributos valor e data de entrega ficaram muito largos para serem mostrados na mesma linha em col-md. Classes alteradas para col-lg.
 