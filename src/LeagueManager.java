import java.util.ArrayList;
import java.util.List;

public interface LeagueManager {
    public void Restore();
    public  void DeleteFootballClub(String NameOfClub);
    public  void DisplayStats();
    public  void DisplayPremierLeagueTable() ;
    public  void AddFootballClub();
    public void AddToList(FootballClub SportClubObj);
    public void AddPlayedMatch();
    public void SaveFile();
    public void LaunchGUI();
}
