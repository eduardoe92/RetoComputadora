package retocomputadora;

/*
Una computadora inicia su proceso imprimiendo las cifras 2023, 2024 y 2025. 
A continuación, no se detiene y prosigue imprimiendo la suma de los tres números más recientes 
que ha impreso: 6072, 10121, 18218, etc. ¿Podrías decir cuáles son las últimas cuatro cifras del 
número impreso en el puesto 2023202320232023? Para ilustrar, en la posición 50, el número 
impreso es 8188013234823360, que concluye en 3360."
 */

public class RetoComputadora {

    public static void main(String[] args) {
        //Variables iniciales
        long num1 = 2023;
        long num2 = 2024;
        long num3 = 2025;

        // Iterar para encontrar el número en la posición deseada
        for (int i = 4; i <= 2023202320232023L; i++) {
            long sum = num1 + num2 + num3;
            num1 = num2;
            num2 = num3;
            num3 = sum;
        }

        // Obtener las últimas cuatro cifras del número en la posición deseada
        String numString = Long.toString(num3);
        String lastFourDigits = numString.substring(numString.length() - 4);

        // Resultado
        System.out.println("Las últimas cuatro cifras del número en la posición 2023202320232023 son: " + lastFourDigits);
    }
}

