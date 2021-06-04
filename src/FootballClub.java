import java.io.Serializable;

public class FootballClub extends SportsClub implements Serializable {
    private int ClubWin;               //per season
    private int ClubDraw;              //per season
    private int ClubDefeat;            //per season
    private  int GoalsReceived;
    private  int GoalsScored;
    private  int ClubPoints;
    private  int NumPlayedMatches;
    private Date date;
    private  String ClubCategory;

    //Constructor
    public FootballClub(String NameOfClub, String Location, int NumberOfMembers, String HeadCoach, String PresidentOfTheClub, int ClubWin,
                        int ClubDraw, int ClubDefeat, int GoalsReceived, int GoalsScored, int ClubPoints, int NumPlayedMatches, Date date, String ClubCategory){
        super( NameOfClub,
                Location, NumberOfMembers, HeadCoach,PresidentOfTheClub);
        this.ClubWin = ClubWin;
        this.ClubDraw = ClubDraw;
        this.ClubDefeat=ClubDefeat;
        this.GoalsReceived=GoalsReceived;
        this.GoalsScored=GoalsScored;
        this.ClubPoints=ClubPoints;
        this.NumPlayedMatches=NumPlayedMatches;
        this.date = date;
        this.ClubCategory = ClubCategory;
    }

    //Getter and setters:

    // Number of wins for the club
    public int getClubWin() {
        return ClubWin;
    }
    public void setClubWin(int NewClubWin) {
        ClubWin = NewClubWin;
    }

    //Number of Draw for a club
    public int getClubDraw() {
        return ClubDraw;
    }
    public void setClubDraw(int NewClubDraw) {
        ClubDraw = NewClubDraw;
    }

    //Number of Defeats for a club
    public int getClubDefeat() {
        return ClubDefeat;
    }
    public void setClubDefeat(int NewClubDefeat) {
        ClubDefeat = NewClubDefeat;
    }

    //Number of goals received
    public int getGoalsReceived() {
        return GoalsReceived;
    }
    public void setGoalsReceived(int NewGoalsReceived) {
        GoalsReceived = NewGoalsReceived;
    }

    //Number of goals scored
    public int getGoalsScored() {
        return GoalsScored;
    }
    public void setGoalsScored(int NewGoalsScored) {
        GoalsScored = NewGoalsScored;
    }

    //Club points
    public int getClubPoints() {
        return ClubPoints;
    }
    public void setClubPoints(int NewClubPoints) {
        ClubPoints = NewClubPoints;
    }

    //Number of played matches
    public int getNumPlayedMatches() {
        return NumPlayedMatches;
    }
    public void setNumPlayedMatches(int NewNumPlayedMatches) {
        NumPlayedMatches = NewNumPlayedMatches;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date Newdate){date = Newdate;}

    public String getClubCategory() {
        return ClubCategory;
    }

    public void setClubCategory(String clubCategory) {
        ClubCategory = clubCategory;
    }

    @Override
    public String toString() {
        return  ""+super.getNameOfClub()+
                "\t\t\t\t\t|"+super.getLocation()+
                "\t\t\t\t\t|"+super.getHeadCoach()+
                "\t\t\t\t\t|" + ClubPoints +
                "\t\t\t\t\t|" + GoalsScored +
                "\t\t\t\t\t|" + GoalsReceived;
    }
}
