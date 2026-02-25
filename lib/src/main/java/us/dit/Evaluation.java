//uvus:YKL4856
//pass:455

package us.dit;

public class Control {

    public static void main(String[] args) {
        System.out.println(sumarDigitos(12345));
    }

    public static int sumarDigitos(int num) {
        int suma = 0;
        while (num > 0) {
            suma += num % 10;
            num /= 10;
        }
        return suma;
    }
}