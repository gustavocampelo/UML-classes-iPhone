# *Desafio de Modelagem UML das classes do iPhone*

**Este repositório contém uma implementação completa do desafio de modelagem de software baseado em algumas funcionalidades do celular iPhone. Usando programação orientada a objetos e UML, o projeto permite que o iPhone funcione como reprodutor de música, telefone e navegador da web. Além do código Java, há documentação, uma visão geral do design e instruções para explorar o código e o diagrama UML. Ao concluir este projeto, pude absorver conhecimentos sobre engenharia de software e construção de sistemas complexos.**

## *Diagrama UML*

![classes-iphone-uml](https://github.com/gustavocampelo/UML-classes-iPhone/assets/83740600/96226336-87dc-4ca2-9df4-481c3a961171)


### **iPhone **

A classe `iPhone` é a classe principal do sistema, representando o dispositivo como um todo. Ela implementa as interfaces `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`, permitindo que o iPhone desempenhe múltiplos papéis, incluindo reprodutor musical, aparelho telefônico e navegador na Internet.

### **AparelhoTelefonico** 📞

**A interface `AparelhoTelefonico` define métodos para realizar chamadas telefônicas e enviar mensagens, incluindo `ligar()`, `atender()` e `iniciarCorreioVoz()`. As classes que implementam essa interface podem funcionar como dispositivos telefônicos.**

### **NavegadorInternet** 🌐

**A interface `NavegadorInternet` define métodos para navegação na web, como `adicionarNovaAba()`, `exibirPagina()` e `atualizarPagina()`. As classes que implementam essa interface podem atuar como navegadores de Internet.**

### **ReprodutorMusical** ◁ II ▷

**A interface `ReprodutorMusical` define métodos para controlar a reprodução de música, como `selecionarMusica()`, `tocar()` e `pausar()`. As classes que implementam essa interface são capazes de reproduzir músicas.**

## *Como Executar*
1. Clone este repositório para o seu ambiente local.
2. Compile e execute o programa.
3. Observe a saída no console para ver as ações simuladas do iPhone.

**Este desafio foi codificado por [Gustavo Campelo](https://github.com/gustavocampelo).<br>**
**[O desafio original foi proposto por Gleyson Sampaio](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo).**
