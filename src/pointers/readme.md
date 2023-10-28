# Java Variaveis primitivas & HashMap Explicação

Neste README, exploramos o comportamento de variáveis primitivas e objetos em Java, particularmente focando no `HashMap`.

## 1. Variáveis Primitivas

```java
public class PointerExemple {
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = num1;

        num1 = 44;

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
```
**num1 = 44 & num2 = 11 - isso ocorre porque não estamos usando ponteiros**

**atribuição entre tipos primitivos, no java, é feita por valor e não por referência**



## 2. Ponteiros

```java
public class HashMaping {
    public static void main(String[] args) {
       HashMap<String, Integer> map1 = new HashMap<>();
       HashMap<String, Integer> map2 = new HashMap<>();

          map1.put("value", 11);
          map2 = map1;
          map1.put("value", 22);

            System.out.println(map1);
            System.out.println(map2);

    }

```
## 3. Garbage Collector

