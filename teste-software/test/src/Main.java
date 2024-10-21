public class Main {
    public static void main(String[] args) {
        class Test {
            void testeSoma() {
                Calculadora calc = new Calculadora();
                int resultado = calc.soma(3, 4);
                System.out.println("Resultado da soma: " + resultado);
            }
        }

        Test testInstance = new Test();
        testInstance.testeSoma();
    }
}

class Calculadora {
    public int soma(int a, int b) {
        return a + b;
    }
}
