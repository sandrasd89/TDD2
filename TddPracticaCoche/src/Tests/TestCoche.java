package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCoche {

	@Test
	void test_al_crear_un_coche_su_velocidad_es_cero() {
		Coche nuevoCoche = new Coche();
		Assertions.assertEquals(0, nuevoCoche.velocidad_Sandra_Saez);
	}

	@Test
	void test_al_acelerar_un_coche_su_velocidad_aumenta() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.acelerar_Sandra_Saez(30);
		Assertions.assertEquals(30, nuevoCoche.velocidad_Sandra_Saez);
	}

	@Test
	void test_al_decelerar_un_coche_su_velocidad_disminuye() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad_Sandra_Saez = 50;
		nuevoCoche.decelerar_Sandra_saez(20);
		Assertions.assertEquals(30, nuevoCoche.velocidad_Sandra_Saez);
	}

	@Test
	void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menor_que_cero() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad_Sandra_Saez = 50;
		nuevoCoche.decelerar_Sandra_saez(80);
		Assertions.assertEquals(0, nuevoCoche.velocidad_Sandra_Saez);
	}


}
