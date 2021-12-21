package C03_Testing_P1.C03_Testing_P1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EstadoTest {

	
	//TEST EstadoSaludable (Apartado 8 - Cobertura MC/DC)
	@Test
	public void testEstadoSaludable() {
		Estado e = new Estado(true,false,false, true, true, 31, 0, false, false, false);
		assertEquals(true, e.estadoSaludable());
	}
	
	@Test
	public void testEstadoSaludable2() {
		Estado e = new Estado(false, false, false, true, true, 31, 0, false, false, false);
		assertEquals(false, e.estadoSaludable());
	}
	
	@Test
	public void testEstadoSaludable3() {
		Estado e = new Estado(true,true,false, true, true, 31, 0, false, false, false);
		assertEquals(false, e.estadoSaludable());
	}
	@Test
	public void testEstadoSaludable4() {
		Estado e = new Estado(true,false,true, true, true, 31, 0, false, false, false);
		assertEquals(false, e.estadoSaludable());
	}
	@Test
	public void testEstadoSaludable5() {
		Estado e = new Estado(true,false,false, false, true, 31, 0, false, false, false);
		assertEquals(false, e.estadoSaludable());
	}
	@Test
	public void testEstadoSaludable6() {
		Estado e = new Estado(true,false,false, true, false, 31, 0, false, false, false);
		assertEquals(false, e.estadoSaludable());
	}

	
	//TEST EstadoSaludable (Apartado 8 - Cobertura MC/DC)
	@Test
	public void testHacerRecomendacion() {
		Estado e = new Estado(false,false,false,false,false,0,0,false,false,false);
		assertEquals("Por motivos de salud, no puede realizar ninguna de las actividades, quedese en casa.\n", e.hacerRecomendacion());
	}
	@Test
	public void testHacerRecomendacion2() {
		Estado e = new Estado(true,false,false,true,true,-10,0,true,true,false);
		assertEquals("-Por motivos metereologicos es mejor que permanezca en casa.\n", e.hacerRecomendacion());
	}
	
	@Test
	public void testHacerRecomendacion3() {
		Estado e = new Estado(true,false,false,true,true,-10,0,false,false,false);
		assertEquals("-Puede ir a esquiar, si no se supera el aforo permitido por la legislación pertinente.\n", e.hacerRecomendacion());
	}
	
	@Test
	public void testHacerRecomendacion4() {
		Estado e = new Estado(true,false,false,true,true,0,0,true,false,false);
		assertEquals("-Es posible ir a hacer senderismo, si no se supera aforo del espacio previsto.\n", e.hacerRecomendacion());
	}
	@Test
	public void testHacerRecomendacion5() {
		Estado e = new Estado(true,false,false,true,true,20,30,false,false,false);
		assertEquals("-Puede ir a hacer turismo al aire libre, si la ciudad no tiene restricciones de confinamiento.\n", e.hacerRecomendacion());
	}
	@Test
	public void testHacerRecomendacion6() {
		Estado e = new Estado(true,false,false,true,true,30,0,false,false,false);
		assertEquals("-La recomendación es irse de cañas, si el establecimiento no tiene problemas de aforo.\n", e.hacerRecomendacion());
	}
	@Test
	public void testHacerRecomendacion7() {
		Estado e = new Estado(true,false,false,true,true,35,0,false,false,false);
		assertEquals("-La recomendación es irse a la playa o a la piscina. La piscina no puede superar el aforo permitido.\n", e.hacerRecomendacion());
	}
}
