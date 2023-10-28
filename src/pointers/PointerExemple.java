package pointers;

public class PointerExemple {

    public static void main(String[] args) {
        int num1 = 11;
        int num2 = num1;

        num1 = 44;

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);


        //num1 = 44 - num2 = 11 - isso ocorre porque não estamos usando ponteiros
        //atribuição entre tipos primitivos é feita por valor, e não por referência.
    }

}
