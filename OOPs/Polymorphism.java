class Doctor {
    String name;

    void treat() {
        System.out.println("Doctor is treating a patient.");
    }
}

class Cardiologist extends Doctor {
    @Override
    void treat() {
        System.out.println(name + " is treating a heart condition.");
    }
}

class Neurologist extends Doctor {
    @Override
    void treat() {
        System.out.println(name + " is treating a brain condition.");
    }
}

class Dermatologist extends Doctor {
    @Override
    void treat() {
        System.out.println(name + " is treating a skin condition.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Doctor d1 = new Cardiologist();
        d1.name = "Dr. Sharma";

        Doctor d2 = new Neurologist();
        d2.name = "Dr. Patel";

        Doctor d3 = new Dermatologist();
        d3.name = "Dr. Mehta";

        d1.treat(); // Dr. Sharma is treating a heart condition.
        d2.treat(); // Dr. Patel is treating a brain condition.
        d3.treat(); // Dr. Mehta is treating a skin condition.
    }
}