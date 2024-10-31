public class CalculatriceAddition {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Veuillez fournir deux nombres en argument.");
        } else {
            double nombre1 = Double.parseDouble(args[0]);
            double nombre2 = Double.parseDouble(args[1]);
            afficherSomme(nombre1, nombre2);
        }
    }

   
    public static void afficherSomme(double nombre1, double nombre2) {
        double somme = nombre1 + nombre2;
        System.out.println("La somme de " + nombre1 + " et " + nombre2 + " est : " + somme);
    }
}
