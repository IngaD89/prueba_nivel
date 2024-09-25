package org.example.escape_room;

import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);


    public static void menu(){
        int option = 0;

        do {
            System.out.println("""
                    Escoge una opción:\s
                    0. Salir de programa
                    1. Crear una nueva sala.\s
                    2. Añadir pistas a una sala específica.\s
                    3. Introducir objetos de decoración.\s
                    4. Mostrar el inventario actualizado\s
                    5. Eliminar elementos del inventario\s
                    """);
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    Game.createRoom();
                    break;
                case 2:

                    break;
            }

        }while (option != 0);
    }

}
