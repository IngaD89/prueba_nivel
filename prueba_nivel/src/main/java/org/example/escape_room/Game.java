package org.example.escape_room;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Room> rooms = new ArrayList<>();

    public static void createRoom() {
        int id;
        String name;
        Theme theme;
        DifficultyLevel difficultyLevel;



        System.out.println("Introduce id");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce nombre de sala");
        name = scanner.nextLine();
        System.out.println("""
                Escoge una Tema:\s
                THEME1\s
                THEME2\s
                THEME3\s
                """);
        theme = Theme.valueOf(scanner.nextLine());

        System.out.println("""
                Escoge un Nivel:\s
                EASY\s
                NORMAL\s
                HARD\s
                VERY_HARD\s
                """);
        difficultyLevel = DifficultyLevel.valueOf(scanner.nextLine());

        Room room = new Room(
                id,
                name,
                theme,
                difficultyLevel
        );

        rooms.add(room);

        System.out.println("Sala creado satisfactoriamente");
    }

    public static void createHintForRoom(){

    }
}
