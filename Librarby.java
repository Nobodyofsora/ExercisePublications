package Publications;
import java.util.Arrays;
import java.util.Scanner;

public class Librarby {
    public static void main (String[] args){
        int lenghtLibrary=10;
        Shelf[] library = new Shelf[lenghtLibrary];
        Scanner input = new Scanner(System.in);
        int choice=0, choice2, lengthShelves=0, position;
        String title, author;
        float price;
        do {
            System.out.println("\t\tMENU \n 1. Creazione di una biblioteca \n 2. Inserimento di un nuovo libro in uno scaffale\n 3. Stampa l’elenco complessivo dei libri presenti nella biblioteca\n 4. Ricerca di tutti i libri di un dato autore, stampa tutti i dati dei libri compresi la loro collocazione\n 5. Verifica del numero di posti disponibili negli scaffali");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Dimensione Scaffali: ");
                    lengthShelves = input.nextInt();
                    for (int i=0; i<lenghtLibrary; i++) {
                        library[i] = new Shelf(lengthShelves);
                    }
                    System.out.println("Creazione di una Biblioteca con "+ lengthShelves+" eseguita con successo!");
                    break;
                case 2:
                    System.out.println("Scaffale da visionare: ");
                    for (int i=0; i<lenghtLibrary;i++){
                        System.out.printf((i+1)+"° Scaffale \t");
                    }
                    choice2= input.nextInt();
                    choice2--;
                    System.out.println("Inserisci la pubblicazione\n Inserire Titolo: ");
                    title = input.next();
                    System.out.println(" Inserire Autore: ");
                    author = input.next();
                    System.out.println(" Inserire Prezzo: ");
                    price = input.nextFloat();
                    System.out.println(" In quale posizione dello Scaffale? ");
                    position = input.nextInt();
                    position--;
                    Publication publication = new Publication(title, author,price);
                    library[choice2].setPublication(position, publication );
                    System.out.println("Inserimento della Pubblicazione nello Scaffale N°"+position+" scaffali riuscito");
                    break;
                case 3:
                    System.out.println(Arrays.toString(library));

                    break;
                case 4:
                        System.out.println("Inserisci Autore :");
                        author = input.next();
                        for (int i = 0; i < lenghtLibrary; i++) {
                            for (int j = 0; j < lengthShelves; j++) {
                                if (library[i].publications[j]!=null && author.equals(library[i].publications[j].authour)) {
                                    System.out.println("Libro dell'Autore trovato");
                                    System.out.println("Scaffale N°"+(i+1)+" Libro N°"+(j+1)+ library[i].publications[j] );
                                }
                            }
                        }
                    break;
                case 5:
                    int availability=0;
                    for (int i = 0; i < lenghtLibrary; i++) {
                        for (int j = 0; j < lengthShelves; j++) {
                            if (library[i].publications[j] == null)
                                availability++;
                            }
                        }
                    System.out.println("Posti disponibili: " + availability);


                    break;

                }

        } while (choice!=0);

    }

}
