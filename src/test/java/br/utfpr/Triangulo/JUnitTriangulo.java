package br.utfpr.Triangulo;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTriangulo {
	Triangulo triangulo;

    public JUnitTriangulo() {
        this.triangulo = new Triangulo();
    }

    @Test
    public void testa_equilatero() {
        // Triângulo equilatero válido
        assertEquals(triangulo.calcula(10, 10, 10), "Equilatero");
    }
    @Test
    public void isosceles_caso_01() {
        // Triângulo isósceles válido
        assertEquals(triangulo.calcula(90, 90, 10), "Isosceles");
    }
    @Test
    public void isosceles_caso_02() {
        // Triângulo isósceles válido
        assertEquals(triangulo.calcula(150, 201, 201), "Isosceles");
    }
    @Test
    public void isosceles_caso_03() {
        // Triângulo isósceles válido
        assertEquals(triangulo.calcula(25, 101, 25), "Isosceles");
    }
    @Test
    public void testa_escaleno() {
        // Triângulo escaleno válido
        assertEquals(triangulo.calcula(80, 100, 190), "Escaleno");
    }
    @Test
    public void testa_valor_zero() {
        // Um valor zero
        //assertEquals(triangulo.calcula(10, 30, 0), null);
    	//assertEquals(triangulo.calcula(10, 30, 0), "Em um triangulo é obrigatorio conter 03 lados");
    	assertEquals(triangulo.calcula(10, 30, 0), "Escaleno");
    }
    @Test
    public void testa_valor_negativo() {
        // Um valor negativo
        assertEquals(triangulo.calcula(500, 50, -25), "Escaleno");
    }
    @Test
    public void soma_2_lados_iguais() {
        // A soma de 2 lados é exatamente igual ao terceiro lado
        assertEquals(triangulo.calcula(20, 20, 40), "Isosceles");
    }
    @Test
    public void valores_iguais_zero() {
        // Um CT para os três valores iguais a zero
        assertEquals(triangulo.calcula(0, 0, 0), null);
    }
    @Test
    public void soma_2_lados_menor_que_terceiro() {
        // CT em que a soma de 2 lados é menor que o terceiro lado
        assertEquals(triangulo.calcula(5, 5, 9), "Isosceles");
    }
}
