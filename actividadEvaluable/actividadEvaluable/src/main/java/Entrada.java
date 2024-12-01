import dao.UsuarioDAO;
import model.Producto;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

     public class Entrada {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                try {
                    System.out.println("Dime nombre a introducir");
                    String nombre = scanner.nextLine();

                    System.out.println("Dime la descripcion");
                    String descripcion = scanner.nextLine();

                    System.out.println("Dime el id del producto");
                    int id;
                    while (true) {
                        try {
                            id = scanner.nextInt();
                            break; // Sai do loop se a entrada for válida
                        } catch (InputMismatchException e) {
                            System.out.println("Por favor, introduce un número válido para el id:");
                            scanner.next(); // Limpa a entrada inválida
                        }
                    }

                    System.out.println("Dime el precio");
                    int precio;
                    while (true) {
                        try {
                            precio = scanner.nextInt();
                            break; // Sai do loop se a entrada for válida
                        } catch (InputMismatchException e) {
                            System.out.println("Por favor, introduce un número válido para el precio:");
                            scanner.next(); // Limpa a entrada inválida
                        }
                    }
                    try {
                        UsuarioDAO usuarioDAO = new UsuarioDAO();
                        usuarioDAO.registrarProducto(new Producto(nombre, descripcion, id, precio));
                        System.out.println("Producto registrado exitosamente.");
                    } catch (SQLException e) {
                        System.out.println("Hay un problema con la aplicacion");
                    }

                } finally {
                    scanner.close(); // Fecha o scanner
                }
            }
        }
