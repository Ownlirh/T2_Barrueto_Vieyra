package pe.edu.cibertec.t2;

public class Producto {

	public int codigo;
	public String nombre;
	public double precio;
	public int stock;

	public Producto(int codigo, String nombre, double precio, int stock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public double calcularTotal() {
		return precio * stock;
	}

	public String armarLinea() {
		String t = "";
		t = t + codigo + "  ";
		t = t + nombre;
		for (int i = nombre.length(); i < 20; i++) {
			t = t + " ";
		}
		t = t + "  S/ " + precio + "   x" + stock + "   = S/ " + calcularTotal();
		return t;
	}
}
