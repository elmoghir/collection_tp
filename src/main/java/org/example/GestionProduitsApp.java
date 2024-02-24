package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class GestionProduitsApp {
    public static void main(String[] args) {

        List<Produit> produit = new ArrayList<>();
        // Ajouter des produits
        produit.add(new Produit(1, "MAC", 1234));
        produit.add(new Produit(2, "HP", 3453));
        produit.add(new Produit(3, "DELL", 3298));
        produit.add(new Produit(4, "ASUS", 7643));
        produit.add(new Produit(5, "LENOVO", 2983));

        //SUPPRIMER PAR INDICE

        produit.remove(4);

        // Edit
        produit.get(0).setId(3);
        // AFFICHAGE
        for(Produit pr:produit)
        {
            System.out.println (pr.toString());
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your product name: ");
        String name = in.nextLine();

        for(Produit p:produit)
        {
            if(p.getNom().equals(name)){
                System.out.println("Nom"+p.getNom()+" Prix"+p.getPrix());
                break;
            }else{
                System.out.println("Product invalid");
                break;
            }
        }
        // Exercice 2
        HashMap<String, Integer> NoteEtudiant = new HashMap<>();
        NoteEtudiant.put("E1", 10);
        NoteEtudiant.put("E2", 30);
        NoteEtudiant.put("E3", 20);
        NoteEtudiant.put("E4", 20);
        NoteEtudiant.put("E5", 20);

        System.out.println("Liste des notes des étudiants :");
        NoteEtudiant.forEach((nom, note) -> System.out.println(nom + " : " + note));
        System.out.println();

        System.out.println("Taille du map : " + NoteEtudiant.size());

        // Calculer la note moyenne
        int somme = 0;
        for (int note : NoteEtudiant.values()) {
            somme += note;
        }
        double moyenne = (double) somme / NoteEtudiant.size();
        System.out.println("Note moyenne : " + moyenne);

        // Trouver la note maximale
        int max = Integer.MIN_VALUE;
        for (int note : NoteEtudiant.values()) {
            if (note > max) {
                max = note;
            }
        }
        System.out.println("Note maximale : " + max);

        // Vérifier s'il y a une note égale à 20
        boolean note20Presente = false;
        for (int note : NoteEtudiant.values()) {
            if (note == 20) {
                note20Presente = true;
                break;
            }
        }
        if (note20Presente) {
            System.out.println("Il y a une note égale à 20.");
        } else {
            System.out.println("Il n'y a pas de note égale à 20.");
        }

        // Exercice 3

        // Créer deux ensembles (HashSet) pour les groupes A et B
        Set<String> groupeA = new HashSet<>();
        Set<String> groupeB = new HashSet<>();

        // Ajouter des noms d'étudiants à chaque ensemble
        groupeA.add("Alice");
        groupeA.add("Bob");
        groupeA.add("Charlie");
        groupeA.add("David");

        groupeB.add("Bob");
        groupeB.add("Eve");
        groupeB.add("Frank");
        groupeB.add("Alice");

        // Afficher l'ensemble des noms du groupe A
        System.out.println("Groupe A : " + groupeA);

        // Afficher l'ensemble des noms du groupe B
        System.out.println("Groupe B : " + groupeB);

        // Afficher l'intersection des deux ensembles
        Set<String> intersection = new HashSet<>(groupeA);
        intersection.retainAll(groupeB);
        System.out.println("Intersection des groupes A et B : " + intersection);

        // Afficher l'union des deux ensembles
        Set<String> union = new HashSet<>(groupeA);
        union.addAll(groupeB);
        System.out.println("Union des groupes A et B : " + union);
    }
}
