public class FizzBuzz {
    String convertir(int nombre) {
        if (nombre % 3 == 0 && nombre % 5 == 0) {
            return "FizzBuzz";
        }
        if (nombre % 3 == 0) {
            return "Fizz";
        }
        if (nombre % 5 == 0) {
            return "Buzz";
        }
         else {
            return String.valueOf(nombre);
        }
    }
}

