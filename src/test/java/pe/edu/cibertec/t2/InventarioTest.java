package pe.edu.cibertec.t2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InventarioTest {

	@Test
	public void verificarValorInventario() {
		Inventario inv = new Inventario();
		inv.agregarProducto(new Producto(1, "Arroz", 10.0, 2));
		inv.agregarProducto(new Producto(2, "Aceite", 5.0, 4));
		assertEquals(40.0, inv.calcularValorInventario(), 0.001);
	}

	@Test
	public void verificarDescuentoDeStock() {
		Inventario inv = new Inventario();
		inv.agregarProducto(new Producto(1, "Arroz", 10.0, 5));
		assertTrue(inv.descontarStock(1, 3));
		assertEquals(2, inv.buscarPorCodigo(1).stock);
		assertFalse(inv.descontarStock(1, 99));
	}
}
