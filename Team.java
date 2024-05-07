import java.util.ArrayList;
import java.util.List;

public class Team  {

    private String teamName;
    private List<Empolyee> members;
    private List<Sports> sports;

    public Team(String teamName) {
        this.teamName = teamName;
        this.members = new ArrayList<>();
        this.sports = new ArrayList<>();
    }
    public List<Empolyee> getMembers() {
        return members;
    }
public String getName(){
        return teamName;
}
    public void addMember(Empolyee employee) {
        members.add(employee);
        employee.setTeam(this);
    }
    public void addSport(Sports sport) {
        sports.add(sport);
    }

    public List<Sports> getSports() {
        return sports;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    }

