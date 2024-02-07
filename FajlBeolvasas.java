package fajlbeolvasas;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FajlBeolvasas {

    public static void main(String[] args) throws IOException {
        File f = new File("sdg");
        Path path = Paths.get("adatok.txt");
        List<String> sorok = Files.readAllLines(path);
        
        for (String sor : sorok) {
            Ember ember = new Ember(sor);
            System.out.println("ember = "+ember);
        }
        System.out.println("\n"+sorok);
        
        
    }
}
