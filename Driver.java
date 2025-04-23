public class Driver {
    public static void main(String[] args) throws Exception {
        // Test Patrol
        Patrol myPatrol = new Patrol();
        myPatrol.readFromFile("resources/patrol.txt");
        myPatrol.patrolEdges();

        // Test Travel
        Travel myTravel = new Travel();
        myTravel.readFromFile("resources/travel.txt");
        myTravel.quickTravel("Earth", "Saturn");

        // Test Tour
        Tour myTour = new Tour();
        myTour.readFromFile("resources/travel.txt");
        myTour.quickTour("Earth");
    }
}
