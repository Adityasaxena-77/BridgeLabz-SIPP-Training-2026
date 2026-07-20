import java.util.PriorityQueue;
public class HospitalTriage {
    public static class Patient {
        private final int priority;
        private final String name;

        public Patient(int priority, String name) {
            if (priority < 1 || priority > 5) {
                throw new IllegalArgumentException("Priority must be between 1 and 5");
            }
            if (name == null || name.isBlank()) {
                throw new IllegalArgumentException("Patient name is required");
            }
            this.priority = priority;
            this.name = name;
        }

        @Override
        public String toString() {
            return name + " (priority " + priority + ")";
        }
    }

    private final PriorityQueue<Patient> waitingPatients =
            new PriorityQueue<>((first, second) -> Integer.compare(first.priority, second.priority));

    public void admitPatient(Patient patient) {
        if (patient == null) {
            throw new IllegalArgumentException("Patient is required");
        }
        waitingPatients.offer(patient);
    }

    public Patient callNextPatient() {
        return waitingPatients.poll();
    }

    public Patient peekNextPatient() {
        return waitingPatients.peek();
    }

    public static void main(String[] args) {
        HospitalTriage triage = new HospitalTriage();
        triage.admitPatient(new Patient(4, "Asha"));
        triage.admitPatient(new Patient(1, "Ravi"));
        triage.admitPatient(new Patient(2, "Meera"));

        Patient patient;
        while ((patient = triage.callNextPatient()) != null) {
            System.out.println("Treating: " + patient);
        }
    }
}
