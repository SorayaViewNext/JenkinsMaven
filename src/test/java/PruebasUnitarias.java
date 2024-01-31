import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PruebasUnitarias {
	
	@Test
	public void testConstructor() {
		HolaMundo h1 = new HolaMundo();
		HolaMundo h2 = new HolaMundo();
		assertEquals(h1.getHola(), h2.getHola());
	}
	
	@Test
	public void testHola() {
		HolaMundo h1 = new HolaMundo();
		assertEquals(h1.getHola(), "¡Hola, mundo!");
	}

}
