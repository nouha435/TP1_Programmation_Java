public class VerificationMajorite {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Veuillez fournir l'âge en argument.");
        } else {
            int age = Integer.parseInt(args[0]);
            verifierMajorite(age);
        }
    }

    
    public static void verifierMajorite(int age) {
        if (age >= 18) {
            System.out.println("Vous êtes majeur.");
        } else {
            System.out.println("Vous êtes mineur.");
        }
    }
}
