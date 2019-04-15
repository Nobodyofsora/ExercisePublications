package Publications;

import java.util.Scanner;
import java.util.Arrays;

public class Shelf {
    public Publication[] publications;

    public Shelf(int n) {
        this.publications = new Publication[n];
    }
    public String getPublication (int position){
       try {
           if(publications[position]==null)
               return null;
           else
               return this.publications[position].getTitle();
       }
       catch (Exception e){
                  return "Errore. Posizione non trovata.";
       }
    }
    public void setPublication (int position, Publication newPublication){
        try{
            this.publications[position]= new Publication(newPublication.title, newPublication.authour, newPublication.priceTag);
        }
        catch (Exception e){
            System.out.printf("Errore.");
        }

    }
    public int searchPublication (String title){

        for (int i=0; i< this.publications.length; i++) {
            if (this.publications[i].title.equals(title))
                return i;
        }
        return -1;
    }


    @Override
    public String toString() {
        return "\n----Scaffale--- \n" +
                "Pubblicazioni: " + Arrays.toString(publications);
    }

    public void emptyPosition (int position){
        this.publications[position]=null;
    }

    public Publication[] getPublications() {
        return publications;
    }
}
