package pe.edu.cibertec.t2;

import java.util.List;

public class PrincipalT2 {

	public static void main(String[] args) {

		Inventario inv = new Inventario();

		inv.agregarProducto(new Producto(1, "Arroz Costeno 5kg", 24.90, 40));
		inv.agregarProducto(new Producto(2, "Aceite Primor 1L", 12.50, 25));
		inv.agregarProducto(new Producto(3, "Leche Gloria", 4.20, 8));
		inv.agregarProducto(new Producto(4, "Fideos Don Vittorio", 3.80, 60));
		inv.agregarProducto(new Producto(5, "Atun Florida", 6.90, 5));
		inv.agregarProducto(new Producto(6, "", 1.00, 10));

		inv.mostrarTodo();

		System.out.println("");
		System.out.println("=== VENTAS ===");
		inv.descontarStock(3, 3);
		inv.descontarStock(5, 20);
		inv.descontarStock(99, 1);
		inv.descontarStock(1, 10);

		System.out.println("");
		System.out.println("=== PRODUCTOS CON STOCK BAJO (menos de 10) ===");
		List<Producto> bajos = inv.listarBajoStock(10);
		for (Producto p : bajos) {
			System.out.println(p.codigo + " - " + p.nombre + " quedan " + p.stock);
		}

		System.out.println("");
		inv.mostrarTodo();
	}
}
