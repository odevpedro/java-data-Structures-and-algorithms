# Notação Big O




A notação Big O é uma maneira fundamental de comparar a eficiência de diferentes implementações de código. Permite-nos representar a complexidade do tempo de execução de algoritmos de maneira matemática, independentemente das especificidades da máquina ou do ambiente de execução.

Considere que temos dois conjuntos de código que realizam a mesma tarefa, mas com implementações distintas:


**Qual dos dois é mais eficiente? E como determinar isso?**

## Complexidade de Tempo (Time Complexity)

A complexidade de tempo nos permite mensurar a eficiência de um código através do número de operações realizadas, e não especificamente pelo tempo real de execução. Isso é importante porque o tempo real pode variar dependendo do hardware ou outras condições externas.

Por exemplo, ao iterar sobre o array `[1,2,3,4,5,6,7]`:

- Se buscarmos pelo número `1`, a execução será rápida, pois ele é o primeiro elemento.
- Por outro lado, se buscarmos pelo número `7`, a execução será mais lenta, pois precisamos passar por todos os elementos anteriores.

## Complexidade de Espaço (Space Complexity)

Enquanto a complexidade de tempo foca no número de operações, a complexidade de espaço se concentra na quantidade de memória usada. Um código que é extremamente rápido pode, às vezes, usar uma quantidade excessiva de memória, tornando-o menos ideal em certos cenários.

## Notação O(n)

A notação `O(n)` é uma das notações Big O mais comuns. Indica que a complexidade do tempo de execução do algoritmo cresce **linearmente** com o tamanho da entrada. Em termos simples, se o tamanho da entrada duplicar, o tempo de execução também dobrará.

---

Utilizar a notação Big O nos ajuda a fazer escolhas informadas sobre qual abordagem ou implementação adotar, levando em consideração tanto a eficiência de tempo quanto de espaço.


![Imagem de Complexidade](https://cdn-media-1.freecodecamp.org/images/1*KfZYFUT2OKfjekJlCeYvuQ.jpeg)
