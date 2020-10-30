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
