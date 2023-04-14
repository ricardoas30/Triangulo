package br.utfpr.Triangulo;

public class Triangulo {
    Lado lado;
    
    public Triangulo() {
        lado = new Lado();
        inicio();
    }
    
    public void inicio() {}
    
    /**
     * @param A
     * @param B
     * @param C
     * @return
     *      Triangulo Equilatero: Possui 03 lados iguais
     *      Triangulo Isosceles:  Possui 02 lados iguais
     *      Triangulo Escaleno:   Possui 03 lados diferentes
     */
    public String calcula(int A, int B, int C) {
        String resultado = "";
        
        if (A == B && A == C) {
            resultado = "Equilatero";
        
        }else if(A == B || B == C || A == C) {
            resultado = "Isosceles";
                    
        } else if(A != B && B != C && A != C) {
            resultado = "Escaleno";
        }
        
        /**
         * Verifica se os 03 lados do triangulo
         * são diferentes de zero.
         */
        if(A == 0 && B == 0 && C == 0) {
            throw new AssertionError("Triangulo Inexistente");
        }
        
        /**
         * Verifica se um dos lados do triangulo é 
         * diferente de zero.
         */
        if(A == 0 || B == 0 || C == 0) {
            throw new AssertionError("Em um triangulo é obrigatorio conter 03 lados");
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        new Triangulo();
    }
}
