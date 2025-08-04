public class Main {

    public static void Main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        double EmGrausCelsius = scanner.nextLine();

        double Fahrenheit = (EmGrausCelsius * 9 / 5) + 32;
        System.out.printf("%.2f", Fahrenheit);


         
    }
    
}


