package org.fmunera.files.examples.service;

import java.io.*;
import java.util.Scanner;

public class FileService {

    public void createFile(String name){
        File file = new File(name);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))){

            bufferedWriter.append("Hello World!\n")
                    .append("Whar'up dude!\n")
                    .append("How u doing...\n\n");

            //bufferedWriter.close();
            System.out.println("El archivo se ha creado con éxito!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void createFile2(String name){
        File file = new File(name);

        //el PrintWriter también está optimizado con un buffer.
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file, true))){
            //Con el 'try' entre paréntesis consumimos o abrimos un recurso y de forma implícita se cierra con el .close().
            printWriter.println("Hello World!");
            printWriter.println("Whar'up dude!");
            printWriter.printf("How u doing... %s \n\n", "bro");

            //printWriter.close(); (no es necesario cerrarlo explícitamente con .close())
            System.out.println("El archivo se ha creado con éxito!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String readFile(String name){
        StringBuilder sb = new StringBuilder();

        File file = new File(name);

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){

            String line;

            while((line = bufferedReader.readLine()) != null){
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sb.toString();
    }

    public String readFile2(String name){

        StringBuilder sb = new StringBuilder();
        File file = new File(name);

        try (Scanner sc = new Scanner(file)){

            sc.useDelimiter("\n");

            while(sc.hasNext()){
                sb.append(sc.next()).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sb.toString();
    }
}
