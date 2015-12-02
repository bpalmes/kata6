/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Kata6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        System.out.println("Inicio");
        String nameFile="emails.txt";
        ArrayList <String> arrayMail = MailList.readFile(nameFile);
        System.out.println(arrayMail.size());
        
        HistogramBuilder<Person>builder = new HistogramBuilder<>(arrayMail);
        
        Histogram<String> domains = builder.build(new Attribute<Person, String>);
        @Override
        public String get(Person item){
           return item.getMail().split("@")[1];
        }
        
        Histogram<Character> letters = builder.build(new Attribute<>);
        
        @Override
        public Character get(Person item){
            return item.getMail();
    }
                
        //Histogram<String> histogram = MailHistogramBuilder.build(arrayMail);
        //new HistogramDisplay(histogram).execute();
        //System.out.println("Fin");
        
    }
}
