import java.io.Serializable;

public class UniversityFootballClub extends FootballClub implements Serializable {
    private String UniversityName;
    private String UniId;

    //Constructors
    public UniversityFootballClub(String NameOfClub, String Location, int NumberOfMembers, String HeadCoach, String PresidentOfTheClub, int ClubWin,
                                  int ClubDraw, int ClubDefeat, int GoalsReceived, int GoalsScored, int ClubPoints, int NumPlayedMatches, Date date, String ClubCategory, String UniversityName, String UniId ){
        super( NameOfClub, Location,  NumberOfMembers,  HeadCoach,  PresidentOfTheClub, ClubWin,
         ClubDraw, ClubDefeat, GoalsReceived, GoalsScored, ClubPoints, NumPlayedMatches, date, ClubCategory);
        this.UniversityName = UniversityName;
        this.UniId = UniId;
        }


    public String getUniversityName() {
        return UniversityName;
    }

    public void setUniversityName(String universityName) {
        UniversityName = universityName;
    }

    public String getNIC() {
        return UniId;
    }

    public void setNIC(String NewId){
        UniId = NewId;
    }


    @Override
    public String toString() {
        return "UniversityFootballClub{" +
                "UniversityName='" + UniversityName + '\'' +
                ", NIC='" + UniId + '\'' +
                '}';
    }
}
