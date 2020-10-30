# Padrão de Projeto Prototype

**Protoype** é uma padrão de projeto criacional que permite a clonagem de objetos, mesmo complexos, sem acoplamento á suas classes específicas.

Todas as classes de Protoypes devem ter uma interface comum que permita copiar objetos, mesmo que suas classes concretas sejam desconhecidas.

Objetos protótipos podem produzir cópias completas, pois objetos da mesma classe podem acessar os campos privados um do outro.

* Complexidade: ⭐
* Popularidade: ⭐⭐
* Ja possui interface pronta? : Sim

## Exemplo de uso

O padrão Protoype está disponível para uso no Java com a interface `Cloneable`

```java
//Exemplo
public interface Prototype extends Cloneable{
   //...
}
```

## Para que serve

Digamos que tenha um objeto e você deseja criar uma cópia exata dele.

O problema é que nem todos os objetos podem ser copiados porque alguns campos de objeto podem ser privados e não são visíveis fora do Objeto.

Outro problema é que se for fazer uma cópia de um objeto copiando as informações, sua classe se torna dependente da classe original do objeto

* O padrão prototype delega o processo de Clonagem para o Próprio objeto que está sendo clonado. O padrão declara uma interface comum para todos os objetos que suportam clonagem. Essa interface permite que você clone um objeto sem acoplar seu código á Classe daquele objeto, utilizando um Métodod chamado `clone();`

* A implementação do Métoo _clone()_ é parecida em todas as classes. O Método cria um objeto da classe atual e carrega todos os valores do objeto antigo para um novo, podendo até copiar valores privados de outros objetos da mesma classe.

* Um objeto que suporta clonagem é chamado de _Protótipo_.

* O padrão prototype de clonagem pode servir como alternativa ao uso de subclasses

## Diagrama de uso

<img src="image.png">
