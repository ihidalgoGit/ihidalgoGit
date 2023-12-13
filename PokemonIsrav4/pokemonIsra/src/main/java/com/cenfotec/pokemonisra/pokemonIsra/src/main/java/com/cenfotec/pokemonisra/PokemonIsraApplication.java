package com.cenfotec.pokemonisra;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

@SpringBootApplication
public class PokemonIsraApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokemonIsraApplication.class, args);
    }
    int option;

    out.println("Welcome to PokemonIsra");
    out.println("1. Nombre del Pokemon");
    out.println("2. Tipo de Pokemon");
    out.println("3. Vida de personitaPoke");
    out.println("4. Poder de personitaPoke");
    out.println("5. A quien vas a atacar?");
    out.print("Ingrese la opcion deseada: ");
    opcion=Integer.parseInt(in.readLine());

    switch(opcion)
    {
        case 1:
        out.println("personitaPoke");
        break;

        case 2:
        out.println("Es un Pokemon normal");
        break;

        case 3:
        out.println("Vida de 1 a 900");
        break;

        case 4:
        out.println("Poder de Fuego Expansivo");
        break;

        case 5:
        out.println("Ataque Directo!");
        break;

        
        default:
        out.println("Vuelve a Intentar tu opcion");
        break;
    
    }
}

