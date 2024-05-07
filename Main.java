public class Main {
    public static void main(String[] args) {

        Empolyee emp1 = new Empolyee("ayman",1);
        Empolyee emp2 = new Empolyee("mostafa",2);
        Empolyee emp3 = new Empolyee("metwally",3);
        Empolyee emp4 = new Empolyee("mostafa",4);

        Team team1 = new Team("madrid");
        Team team2 = new Team("liverPool");

        team1.addMember(emp1);
        team2.addMember(emp2);
        team1.addMember(emp3);
        team2.addMember(emp4);

        Sports football = new Football();
        Sports basketball = new Basketball();
        Sports Knighthood = new Knighthood();
        team1.addSport(Knighthood);
        team1.addSport(football);
        team2.addSport(basketball);

        // sports for every team

        System.out.println("Sports for Team 1 :");
        for (Sports sport : team1.getSports()) {
            System.out.print("- " + sport.getName() + ": ");

            sport.conduct();
        }

            // members of every team

        for (Empolyee empolyee : team1.getMembers()){
            System.out.println((" - " + team1.getMembers()));
        }


    }
}
