package pe.edu.cibertec.t2;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Inventario {

	public List<Producto> lista = new ArrayList<Producto>();

	public void agregarProducto(Producto p) {
		if (p == null) {
			return;
		}
		if (StringUtils.isBlank(p.nombre)) {
			System.out.println("producto sin nombre, no se agrega");
			return;
		}
		lista.add(p);
	}

	public Producto buscarPorCodigo(int codigo) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).codigo == codigo) {
				return lista.get(i);
			}
		}
		return null;
	}

	public boolean descontarStock(int codigo, int cantidad) {
		Producto p = buscarPorCodigo(codigo);
		if (p == null) {
			System.out.println("no existe el producto " + codigo);
			return false;
		}
		if (p.stock < cantidad) {
			System.out.println("stock insuficiente de " + p.nombre);
			return false;
		}
		p.stock = p.stock - cantidad;
		return true;
	}

	public double calcularValorInventario() {
		double suma = 0;
		for (Producto p : lista) {
			suma = suma + p.calcularTotal();
		}
		return suma;
	}

	public List<Producto> listarBajoStock(int minimo) {
		List<Producto> r = new ArrayList<Producto>();
		for (Producto p : lista) {
			if (p.stock < minimo) {
				r.add(p);
			}
		}
		return r;
	}

	public void mostrarTodo() {
		System.out.println("COD NOMBRE                PRECIO     CANT      TOTAL");
		System.out.println("----------------------------------------------------");
		for (Producto p : lista) {
			System.out.println(p.armarLinea());
		}
		System.out.println("----------------------------------------------------");
		System.out.println("VALOR TOTAL DEL INVENTARIO: S/ " + calcularValorInventario());
	}
}
