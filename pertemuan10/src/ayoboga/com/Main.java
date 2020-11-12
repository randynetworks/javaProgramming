package ayoboga.com;
public class Main {
    public static void main(String[] args) {
        Human pico = new Human();
        // Increase count by one
        Human.count++;

        // Assign values to name and gender
        pico.name = "Pico";
        pico.gender = "?";

        // Read and print the values of name, gender and count
        String jackName = pico.name;
        String jackGender = pico.gender;
        long population = Human.count;

        System.out.println("Name: " + jackName);
        System.out.println("Gender: " + jackGender);
        System.out.println("Population: " + population);

        // Change the name
        pico.name = "Boku No Pico";

        // Read and print the changed name
        String changedName = pico.name;
        System.out.println("Changed Name: " + changedName);
    }
}



