# Calcolatrice OOP

Esercizio 1 del piano formativo. Calcolatrice interattiva con le quattro operazioni base, strutturata secondo i principi OOP.

## Struttura

- `Calcolatrice.java` — classe con i metodi per somma, differenza, prodotto e quoziente;
- `DivisionePerZeroException.java` — eccezione personalizzata per la divisione per zero;
- `Main.java` — interfaccia utente: menu interattivo, lettura input da tastiera, loop fino all'uscita;

## Funzionamento

All'avvio il programma mostra un menu con le quattro operazioni. L'utente sceglie l'operazione, inserisce i due valori, e ottiene il risultato. Il loop continua finché non viene selezionata l'opzione 0 (Uscita).

## Note

La divisione per zero in Java con `double` non lancia un'eccezione automaticamente — restituisce `Infinity`. Per questo il controllo è esplicito nel metodo `quoziente`, che lancia `DivisionePerZeroException` prima di eseguire il calcolo.
