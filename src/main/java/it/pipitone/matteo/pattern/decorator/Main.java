package it.pipitone.matteo.pattern.decorator;

import it.pipitone.matteo.pattern.decorator.inputstream.LowerCaseInputStream;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage deca = new Deca();
        deca = new Mocha(deca);
        deca = new Soy(deca);

        System.out.println(deca.getDescription() + " $" + deca.cost());

        int c;
        ClassLoader classLoader = Main.class.getClassLoader();

        try (InputStream in = new LowerCaseInputStream(new BufferedInputStream(
                new FileInputStream(classLoader.getResource("text.txt").getFile())));){
            while ((c = in.read()) >= 0){
                System.out.println((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
