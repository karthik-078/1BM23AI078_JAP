public class Enumeration {
    public enum DayOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;

        // Correct placement of isWorkday() inside the enum
        public boolean isWorkday() {
            return (this != SATURDAY && this != SUNDAY);
        }
    }

    // The main method must be inside a class
    public static void main(String[] args) {
        System.out.println("Is Monday a workday? " + DayOfWeek.MONDAY.isWorkday());
        System.out.println("Is Saturday a workday? " + DayOfWeek.SATURDAY.isWorkday());
    }
}
