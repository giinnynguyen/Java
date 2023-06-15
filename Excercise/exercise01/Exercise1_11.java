package exercise01;

public class Exercise1_11 {
    public static void main(String[] args) {
        double population = 312032486;
        double birthEverySecond = 7.0;
        double deathEverySecond = 13.0;
        double migrateEverySecond = 45.0;

        double secondsInADay = 24 * 3600;//86400 seconds
        double birthEveryYear = (secondsInADay/birthEverySecond) * 365;
        double deathEveryYear = (secondsInADay/deathEverySecond) * 365;
        double migrateEveryYear = (secondsInADay/migrateEverySecond) * 365;

        for (int i = 0; i < 5; i++) {
            population += (birthEveryYear - deathEveryYear + migrateEveryYear);
            System.out.println(population);
        }
    }
}
