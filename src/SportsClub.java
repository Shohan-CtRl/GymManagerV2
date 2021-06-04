import java.io.Serializable;

public class SportsClub implements Serializable {
    private int count;               //Count the number of clubs participating in the league.
    private String NameOfClub;
    private String Location;
    private  int NumberOfMembers;
    private String HeadCoach;
    private String PresidentOfTheClub;
    //-----------------------------


    //Constructor
    public SportsClub(String NameOfClub,String Location, int NumberOfMembers, String HeadCoach, String PresidentOfTheClub){
        super();
        this.NameOfClub = NameOfClub;
        this.Location = Location;
        this.NumberOfMembers=NumberOfMembers;
        this.HeadCoach=HeadCoach;
        this.PresidentOfTheClub=PresidentOfTheClub;

        count++;
    }
    //Get & Set methods:

    //Club Name
    public String getNameOfClub(){
        return NameOfClub;
    }
    public void setNameOfClub(String NewNameOfClub){
        this.NameOfClub = NewNameOfClub;
    }

    //Club location
    public String getLocation(){
        return Location;
    }
    public void setLocation(String NewLocation){
        this.Location = NewLocation;
    }

    //Number of players
    public int getNumberOfMembers(){
        return NumberOfMembers;
    }
    public void setNumberOfMembers(int NewNumberOfMembers){
        this.NumberOfMembers = NewNumberOfMembers;
    }

    //Name of head couch
    public String getHeadCoach(){
        return HeadCoach;
    }
    public void setHeadCoach(String NewHeadCoach){
        this.HeadCoach = NewHeadCoach;
    }

    //Name of the president
    public String getPresidentOfTheClub(){
        return PresidentOfTheClub;
    }
    public void setPresidentOfTheClub(String NewPresidentOfTheClub){
        this.PresidentOfTheClub = NewPresidentOfTheClub;
    }


    @Override
    public String toString() {
        return ", NameOfClub='" + NameOfClub + '\'' +
                ", Location='" + Location + '\'' +
                ", HeadCoach='" + HeadCoach + '\'';
    }
}
