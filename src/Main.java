// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void printItems(int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println(i + " " + j);
                }
            }
        }
        public static void main(String[] args){
            printItems(100);
        }
    }


    //Big O notation O(n)