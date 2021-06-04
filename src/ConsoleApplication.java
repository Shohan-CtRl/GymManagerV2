

import java.util.Scanner;

public class ConsoleApplication {
    public static LeagueManager LeagueObj = new PremierLeaqueManager();

    public static void main(String[] args) {
        // Restoring the list with data saved on the file.
        //LeagueObj.Restore();
        //While loop to keep the menu prompting once individual tasks have been done.
        while(true) {

            String UserChoice = "";
            boolean InputValid = false;
            Scanner sc = new Scanner(System.in);
            // validation check to check user input
            //CLI prompt for users
            while (!InputValid) {
                InputValid = true;
                System.out.println("            -------------------------PREMIER LEAGUE MANAGER------------\n" +
                        "          ||           [ENTER '1'] ADD A FOOTBALLCLUB.                ||\n" +
                        "          ||           [ENTER '2'] DELETE A FOOTBALL CLUB.            ||\n" +
                        "          ||           [ENTER '3'] DISPLAY CLUB STATISTICS.           ||\n" +
                        "          ||           [ENTER '4'] DISPLAY PREMIER LEAGUE TABLE       ||\n" +
                        "          ||           [ENTER '5'] ADD A PLAYED MATCH                 ||\n" +
                        "          ||           [ENTER '6'] SAVE LIST TO FILE                  ||\n" +
                        "          ||           [ENTER '7'] OPEN GUI                           ||\n" +
                        "           ------------------------------------------------------------\n" +
                        "ENTER CHOICE(1-7):- "
                );
                UserChoice = sc.nextLine();
                //case statement to check user input using switch caase statement.
                switch (UserChoice) {
                    case "1":
                        // opens add foot ballclub option.
                        LeagueObj.AddFootballClub();
                        System.out.println("Hii");
                        break;
                    case "2":
                        // opens delete football club option.
                        LeagueObj.DeleteFootballClub(null);
                        break;
                    case "3":
                        // opens stats football club option.
                        LeagueObj.DisplayStats();
                        break;
                    case "4":
                        // opens Display table football club option.
                        LeagueObj.DisplayPremierLeagueTable();
                        break;
                    case "5":
                        // opens add played match football club option.
                        LeagueObj.AddPlayedMatch();
                        break;
                    case "6":
                        // opens save football club option
                        LeagueObj.SaveFile();
                        break;
                    case "7":
                        //launch the GUI
                        LeagueObj.LaunchGUI();
                        break;
                        // if above cases aren't satisfied, default will be considered.
                    default:
                        System.out.println("Invalid input, Please try again.");
                        InputValid = false;
                }
            }
        }
    }


    }

