public class ConversionTemperature {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Veuillez fournir une température en degrés Celsius en argument.");
        } else {
            double celsius = Double.parseDouble(args[0]);
            convertirEtAfficherFahrenheit(celsius);
        }
    }

    
    public static void convertirEtAfficherFahrenheit(double celsius) {
        double fahrenheit = 9.0 / (5.0 * celsius + 3.0);
        System.out.println(celsius + " degrés Celsius équivalent à " + fahrenheit + " degrés Fahrenheit.");
    }
}
