public class Personne {
    private String nom;
    private int age;

    // Constructeur de la classe Personne
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    
    public void afficherInfos() {
        System.out.println("Nom: " + nom);
        System.out.println("Âge: " + age);
    }

    public static void main(String[] args) {
        // Création d'un objet Personne
        Personne personne = new Personne("Jean Dupont", 25);
        personne.afficherInfos(); // Appel de la méthode pour afficher les infos
    }
}
