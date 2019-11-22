package io.github.alexanderheim;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while(true){
            System.out.println("Gib den Dateipfad der Datei ein, in der die Zahl ist.");
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            try {
                List<String> lines = Files.readAllLines(Paths.get(s), Charset.defaultCharset());
                System.out.println("File gefunden!");
                System.out.println("Welche Zahl willst du ausgeben? Die 1., oder 2., oder 3., ..");
                int i = Integer.parseInt(in.nextLine());
                System.out.println(Integer.parseInt(lines.get(i)));
                in.close();
                break;
            } catch (NoSuchFileException e){
                System.out.println("File nicht gefunden!");
            } catch(NumberFormatException e){
                System.out.println("Keine gültige Zahl!");
            }catch(IndexOutOfBoundsException e){
                System.out.println("So viele Zahlen gibts gar nicht!");
            }catch (IOException e) {
                System.out.println("Ungültiger Dateipfad!");
            }
        }
        System.out.println("Programm beendet.");
    }
}
