import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Mazlicek> pets = new ArrayList<>();
        String input = "";
        System.out.println("Dobré ráno Čůráci!!!");

        while (!input.equals("0")) {
            System.out.println("1: přidat\n2: odebrat\n3: možnosti výpisu\n0: konec");
            input = sc.nextLine();

            switch (input) {
                case "1":
                    System.out.println("Kolik budete přidávat mazlíčků?");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Zadejte jméno Mazlíčka");
                        String name = sc.nextLine();
                        System.out.println("Zadejte druh Mazlíčka");
                        String druh = sc.nextLine();
                        System.out.println("Zadejte věk Mazlíčka");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Zadejte váhu Mazlíčka");
                        double weight = sc.nextDouble();
                        sc.nextLine();
                        pets.add(new Mazlicek(name, druh, age, weight));
                    }
                    break;

                case "2":
                    for (int i = 0; i < pets.size(); i++) {
                        System.out.println(pets.get(i).toString());
                    }
                    System.out.println("Který index chcete odstranit?");
                    int rem = sc.nextInt();
                    sc.nextLine();
                    pets.remove(rem - 1);
                    break;
                case "3":
                    while (!input.equals("0")) {
                        System.out.println("1: jmena\n2: prumerna vaha a vek\n3: najit podle jmena\n4: filtr podle druhu\n0: konec");
                        input = sc.nextLine();

                        switch (input) {
                            case "1":
                                System.out.println("Jmena mazličků: ");
                                for (int i = 0; i < pets.size(); i++) {
                                    System.out.println(pets.get(i).getName());
                                }
                                break;
                            case "2":
                                double AWeight = 0;
                                double AAge = 0;
                                for (int i = 0; i < pets.size(); i++) {
                                    AWeight += pets.get(i).weight;
                                    AAge += pets.get(i).age;
                                }
                                AWeight = AWeight / pets.size();
                                AAge = AAge / pets.size();
                                System.out.println("Průměrná váha: " + AWeight);
                                System.out.println("Průměrná věk: " + AAge);
                                break;
                            case "3":
                                System.out.println("Zadejte jméno které chcete vyhledat:");
                                String Sname = sc.nextLine();
                                for (int i = 0; i < pets.size(); i++) {
                                    if (Sname.equals(pets.get(i).name)) {
                                        System.out.println(pets.get(i).toString());
                                    }
                                }
                                break;
                            case "4":
                                System.out.println("Zadejte druh: ");
                                String FDruh = sc.nextLine();
                                for (int i = 0; i < pets.size(); i++) {
                                    if (FDruh.equals(pets.get(i).druh)) {
                                        System.out.println(pets.get(i).toString());
                                    }
                                }
                                break;
                        }
                    }

            }
        }


    }
}