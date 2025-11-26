import java.util.Scanner;

public class ValidadorPerfilUsuario {
    public static void Inicializar() {
        System.out.println("--- Iniciando proceso de validacion ---");
        Scanner scanner = new Scanner(System.in);
        String nombreUsuario;
        int edadUsuario;
        double saldoCuenta;
        boolean esPremium;

        System.out.println("--- Solicitando datos usuario ---");
        System.out.println("Digite el nombre de su usuario: ");
        nombreUsuario = scanner.nextLine();
        System.out.println("Digite su edad: ");
        edadUsuario = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite el saldo de su cuenta: ");
        saldoCuenta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Escriba true si usted es usuario premium, de lo contrario false: ");
        esPremium = scanner.nextBoolean();

        //Validacion Reglas de acceso
        System.out.println("---Validando regals de acceso...---");

        boolean accesoExclusivo = (edadUsuario > 17) && esPremium;
        System.out.println("El usuario tiene acceso exclusivo: " + accesoExclusivo);
        boolean calificarPromocion = (saldoCuenta > 1000) || (edadUsuario < 25);
        System.out.println("El usuario aplica para promoción: " + calificarPromocion);
        boolean perfilIncompleto = (saldoCuenta == 0) || !nombreUsuario.equals("invitado");
        System.out.println("El usuario tiene un perfil incompleto: " + calificarPromocion);
        boolean perfilActivototal = perfilIncompleto && (accesoExclusivo || calificarPromocion);
        System.out.println("El usuario tiene un perfil activo total: " + perfilActivototal);
    }

}
