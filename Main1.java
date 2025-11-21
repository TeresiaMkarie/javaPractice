class HospitalQueue {
    private String[] arr;
    private int capacity;
    private int size;

    
    public HospitalQueue(int capacity) {
        this.capacity = capacity;
        arr = new String[capacity];
        size = 0;
    }

    
    public boolean isEmpty() {
        return size == 0;
    }


    public boolean isFull() {
        return size == capacity;
    }

    
    public void admitPatient(String patientName) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot admit more patients.");
            return;
        }
        arr[size] = patientName;
        size++;
        System.out.println("🧾 Patient admitted: " + patientName);
    }

    
    public void treatPatient() {
        if (isEmpty()) {
            System.out.println("No patients to treat!");
            return;
        }
        System.out.println("👨‍⚕️ Now treating: " + arr[0]);
        for (int i = 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
    }

    public String nextPatient() {
        if (isEmpty()) {
            System.out.println("No patients waiting.");
            return null;
        }
        return arr[0];
    }

    public String lastPatient() {
        if (isEmpty()) {
            System.out.println("No patients waiting.");
            return null;
        }
        return arr[size - 1];
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("No patients currently waiting.");
            return;
        }
        System.out.print("🏥 Waiting Patients: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println();
    }
}

public class Main1 {
    public static void main(String[] args) {

        HospitalQueue hospital = new HospitalQueue(5);

        hospital.admitPatient("John Doe");
        hospital.admitPatient("Sarah Connor");
        hospital.admitPatient("Michael Brown");

        hospital.displayQueue();

        System.out.println("Next to treat: " + hospital.nextPatient());
        System.out.println("Last in queue: " + hospital.lastPatient());

        hospital.treatPatient();
        hospital.displayQueue();

        hospital.admitPatient("Emily White");
        hospital.displayQueue();
    }
}

