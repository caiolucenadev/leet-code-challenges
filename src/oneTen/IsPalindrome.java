package oneTen;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(9));

    }

    public static boolean isPalindrome(int x) {

        int digito = 0;
        int numero = x;
        int invertido = 0;
        while (numero > 0) {
            digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }
        if (x == invertido) {
            return true;
        }
        return false;
    }
}
