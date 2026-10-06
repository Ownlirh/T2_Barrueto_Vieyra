package pe.edu.cibertec.t2;

public class ControlVersion_Barrueto {

	public static void mostrarIdentificacion() {
		System.out.println("====================================================");
		System.out.println("  CONTROL DE VERSIONES CON GIT");
		System.out.println("====================================================");
		System.out.println("  Alumno : Fernando Barrueto Vieyra");
		System.out.println("  Curso  : Lenguaje de Programacion II");
		System.out.println("  Ciclo  : 4to ciclo - Cibertec");
		System.out.println("  Proyecto: T2_Barrueto_Vieyra");
		System.out.println("====================================================");
	}

	public static void mostrarOrigenDelCambio() {
		String rama = "feature-barrueto";
		System.out.println("");
		System.out.println("Esta funcionalidad NO fue desarrollada en la rama principal.");
		System.out.println("Se desarrollo de manera independiente en la rama: " + rama);
		System.out.println("Despues de probarla se fusiono con la rama main usando merge.");
		System.out.println("");
	}

	public static void mostrarTodo() {
		mostrarIdentificacion();
		mostrarOrigenDelCambio();
	}

	public static void main(String[] args) {
		mostrarTodo();
	}
}
