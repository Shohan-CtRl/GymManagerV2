import java.io.Serializable;

public class SchoolFootballClubs extends FootballClub implements Serializable {
    private String Age;
    private String SchRegId;

    //Constructors
    public SchoolFootballClubs(String NameOfClub, String Location, int NumberOfMembers, String HeadCoach, String PresidentOfTheClub, int ClubWin,
                               int ClubDraw, int ClubDefeat, int GoalsReceived, int GoalsScored, int ClubPoints, int NumPlayedMatches, Date date, String ClubCategory, String Age, String SchRegId){
        super(NameOfClub, Location,  NumberOfMembers,  HeadCoach,  PresidentOfTheClub, ClubWin,
                ClubDraw, ClubDefeat, GoalsReceived, GoalsScored, ClubPoints, NumPlayedMatches, date, ClubCategory);
        this.Age = Age;
        this.SchRegId = SchRegId;

    }
    //Age of student
    public String getAge() {
        return Age;
    }
    public void setUniversityName(String NewAge) {
        Age = NewAge;
    }

    public String getSchRegId() {
        return SchRegId;
    }

    public void setSchRegId(String NewSchRegId) {
        SchRegId = NewSchRegId;
    }

    @Override
    public String toString() {
        return "SchoolFootballClubs{" +
                "Age='" + Age + '\'' +
                ", SchRegId='" + SchRegId + '\'' +
                '}';
    }
}

