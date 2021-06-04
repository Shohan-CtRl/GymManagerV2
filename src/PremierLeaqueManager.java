import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class PremierLeaqueManager implements LeagueManager,Serializable {
    public static List<FootballClub> ListOfClubs = new ArrayList<>();
    int NumberOfClubs = 0;

    public void Restore() {
        // if statement to check is arraylist is empty, if empty, values will be added from the file.
        if (ListOfClubs.size()==0){
            try {
                //Creating file
                FileInputStream readTeamData = new FileInputStream("C:\\Users\\hp\\OOP_CWV3\\premierleaguev1\\app\\entities\\FootballClubFileV2.txt");
                // Check if object readTeamData is empty. checking if file is empty.
                if(!readTeamData.equals(null)) {
                    ObjectInputStream readStreamOfData = new ObjectInputStream(readTeamData);
                    //Loop through array ListOfClub with for statement
                    for (int i = 0; i <= ListOfClubs.size(); i++) {
                        try {
                            //Reading values from file and saving it to obj.
                            FootballClub TempObj = (FootballClub) readStreamOfData.readObject();
                            //Adding to array list.
                            ListOfClubs.add(TempObj);
                        } catch (EOFException | ClassNotFoundException e) {
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
        return;
    }
    @Override
    public void AddFootballClub() {

        // Data type initialization and setting data types.
        String NameOfClub = null;
        String Location = null;
        String HeadCoach = null;
        String PresidentOfTheClub = null;
        int NumberOfMembers = 0;
        int ClubWin = 0;
        int ClubDraw = 0;
        int ClubDefeat = 0;
        int GoalsReceived = 0;
        int GoalsScored = 0;
        int ClubPoints = 0;
        int NumPlayedMatches = 0;
        Date tempDate= null;
        int day = 0;
        int month = 0;
        int year = 0;
        String UniversityName = "";
        String UniId = "";
        String SchRegId="";
        Integer AgeCategory = 0;
        String AgeCategoryString="";
        String FootClubType ="";
        boolean ClubTypeValidation= false;
        String ClubCategory="";
        boolean ClubValidation;
        Scanner sc = new Scanner(System.in);

        if (ListOfClubs.contains(null)) {

        }
        try {
            // Validation to check if club name has been entered before. All club names should be unique.
            ClubValidation = false;
            while(ClubValidation == false) {

                System.out.println("Enter name of football club: ");
                NameOfClub = sc.next();
                if(ListOfClubs.size()!=0){
                    // Loops through array to check if club name has been used before.
                    for (FootballClub testObj : ListOfClubs) {
                        if(testObj.getNameOfClub().equals(NameOfClub)){
                            System.out.println("Name has already been taken, find a unique team name.");
                        }else {
                            // ClubValidation = true causes the while statement to break. Hence exiting the loop.
                            ClubValidation = true;
                        }

                    }
                }else{
                    ClubValidation = true;
                }
            }
            // Asking user to enter Location, then passing value to Location of data type String.
            System.out.println("Enter location: ");
            Location = sc.next();
            // Asking user to enter Head coach, then passing value to HeadCoach of data type String.
            System.out.println("Enter name of head coach: ");
            HeadCoach = sc.next();
            // Asking user to enter President Of The Club, then passing value to PresidentOfTheClub of data type String.
            System.out.println("Enter name of the president representing the club: ");
            PresidentOfTheClub = sc.next();
            // Asking user to enter Number Of Members, then passing value to NumberOfMembers of data type int.
            System.out.println("Enter the number of team members: ");
            NumberOfMembers = sc.nextInt();
            // Asking user to enter number of Club Win, then passing value to ClubWin of data type int.
            System.out.println("Enter the number of club wins: ");
            ClubWin = sc.nextInt();
            // Asking user to enter number of club draws, then passing value to ClubDraw of data type int.
            System.out.println("Enter the number of club draws: ");
            ClubDraw = sc.nextInt();
            // Asking user to enter number of Club Defeat, then passing value to ClubDefeat of data type int.
            System.out.println("Enter the number of club defeats: ");
            ClubDefeat = sc.nextInt();
            // Asking user to enter number of Goals Received, then passing value to GoalsReceived of data type int.
            System.out.println("Enter the number of goals received: ");
            GoalsReceived = sc.nextInt();
            // Asking user to enter number of Goals Scored, then passing value to GoalsScored of data type int.
            System.out.println("Enter of goals scored: ");
            GoalsScored = sc.nextInt();
            // Asking user to enter number of Club Points, then passing value to ClubPoints of data type int.
            System.out.println("Enter the number of club points: ");
            ClubPoints = sc.nextInt();
            // Asking user to enter number of NumPlayed Matches, then passing value to NumPlayedMatches of data type int.
            System.out.println("Enter the number of matches played: ");
            NumPlayedMatches = sc.nextInt();
            // Asking user to enter day, then passing value to day of data type int.
            System.out.println("Enter the date(dd): ");
            day = sc.nextInt();
            // Asking user to enter month, then passing value to month of data type int.
            System.out.println("Enter the month(mm): ");
            month = sc.nextInt();
            // Asking user to enter year, then passing value to year of data type int.
            System.out.println("Enter the year(yyyy): ");
            year = sc.nextInt();
            // Asking the user to select what type of football club the team is
            while (ClubTypeValidation == false){
                System.out.println("Is this club a Football premier league club[1], University club[2] or School Club[3]?");
                FootClubType = sc.nextLine();
                if(FootClubType.equals("1")||FootClubType.equals("2")||FootClubType.equals("3")){
                    ClubTypeValidation = true;
                }
            }

            // Sending it to Date class.
            tempDate = new Date(day,month,year);
            // Switch case used to determine the user club type choice.
            switch (FootClubType){
                case "1":
                    // Passes data to FootballClub obj.
                    //Sets type for future reference
                    ClubCategory = "Football premier league" ;
                    FootballClub FootballObj = new FootballClub(NameOfClub, Location, NumberOfMembers, HeadCoach, PresidentOfTheClub, ClubWin, ClubDraw, ClubDefeat, GoalsReceived, GoalsScored, ClubPoints, NumPlayedMatches, tempDate, ClubCategory);
                    //Adds to list
                    AddToList(FootballObj);
                    break;
                case "2":
                    // Passes data to University obj.
                    //Sets type for future reference
                    System.out.println("Enter the University name: ");
                    ClubCategory = "Academic clubs:  University Football Club" ;
                    UniversityName = sc.nextLine();
                    ClubValidation = false;
                    //gets additional inputs that our unique to uni clubs
                    while (ClubValidation = false) {
                        System.out.println("Enter the University registration Id: ");
                        UniId = sc.nextLine();
                        if(UniId.length()!=4){
                            System.out.print("Error, ID has to be of 4 numerical digits, try again...");
                        }else{
                            ClubValidation = true;
                        }
                    }
                    // Sends values to uni club class.
                    UniversityFootballClub UniversityFootObj = new UniversityFootballClub( NameOfClub, Location,  NumberOfMembers,  HeadCoach,  PresidentOfTheClub, ClubWin,
                     ClubDraw, ClubDefeat, GoalsReceived, GoalsScored,  ClubPoints,  NumPlayedMatches,  tempDate, ClubCategory,  UniversityName, UniId );
                    //Adds to list
                    AddToList(UniversityFootObj);
                    break;
                case "3":
                    // Passes data to School obj.
                    //Sets type for future reference
                    // Gets inputs unique to school cllubs

                    ClubValidation = false;
                    while (ClubValidation = false) {
                        System.out.println("Under what age category will you be contesting: ");
                        ClubCategory = "Academic clubs:  School Football Club" ;
                        AgeCategory = sc.nextInt();
                        if(AgeCategory < 18){
                            System.out.print("To participate under school league, contestant's team should be under 18.\n" +
                                    "Try again. ");

                        }else{
                            // Validation check for age. Age has to be <18
                            ClubValidation = true;
                            AgeCategoryString = "U"+String.valueOf(AgeCategory);
                        }
                    }
                    ClubValidation = false;
                    while (ClubValidation = false) {
                        System.out.println("Enter the School registration Id: ");
                        SchRegId = sc.nextLine();
                        if(SchRegId.length()!=4){
                            System.out.print("Error, ID has to be of 4 numerical digits, try again...");
                        }else{
                            ClubValidation = true;
                        }
                    }
                    //Passes values onto the schhol club class
                    SchoolFootballClubs SchoolFootballObj = new SchoolFootballClubs( NameOfClub, Location,  NumberOfMembers,  HeadCoach,  PresidentOfTheClub, ClubWin,
                     ClubDraw, ClubDefeat, GoalsReceived, GoalsScored,  ClubPoints,  NumPlayedMatches,  tempDate, ClubCategory,  AgeCategoryString,  SchRegId);
                    //Adds to list
                    AddToList(SchoolFootballObj);
                    break;
            }

         // Catches invalid inputs of wrong data types.
        }catch (InputMismatchException e){
            System.out.println("Invalid input, please try again.");
        }

    }
    @Override
    // Used to add list to club that was passed from the previous method.
    public void AddToList(FootballClub FootballClubOb){
        // Check if club already exists.
        if(ListOfClubs.contains(FootballClubOb)){
            // If the club has been duplicated or repeated, data  will not be added to list.
            System.out.println("Club already exists in the system.");
        }else{
            // If club isnt found within the list, new club will be added.
            ListOfClubs.add(FootballClubOb);
            System.out.println("Club Successfully added. Congratulations!");
        }
    }

    @Override


    public void DeleteFootballClub(String NameOfClub) {
        boolean found = false;
        //User friendly prompts to ask user for further information.
        System.out.println("            -----------------------Delete Club from list of clubs----------\n" );
        String ClubNameDelete = "";
        Scanner sc = new Scanner(System.in);
        try{
            // user friendly
            System.out.println("What club do you want removed?");
            ClubNameDelete= sc.next();

        }catch (InputMismatchException e){
            System.out.println("Invalid input, please try again.");
        }
        for (SportsClub team : ListOfClubs) {
            // Check if delete item is found on the list
            // Checks list for deleted value
            if (team.getNameOfClub().equals(ClubNameDelete)) {
                ListOfClubs.remove(team);
                //User friendly prompt
                System.out.println(ClubNameDelete + " has been Successfully deleted.");
                found = true;
                break;
            } else {

            }

        }
        if(found == false){System.out.println(ClubNameDelete + " has not been found.");}


    }

    public void DisplayStats() {
        String UserChoiceTeam = "";
        Scanner sc = new Scanner(System.in);
        // Loops to get valid input.
        try{
            System.out.println("What club statistics do you want display?");
            UserChoiceTeam= sc.next();
        }catch (InputMismatchException e){
            System.out.println("Invalid input, please try again.");
            DisplayStats();
        }
        try {
            //Outputs valid data
            for (FootballClub team : ListOfClubs) {
                if (team.getNameOfClub().equals(UserChoiceTeam)) {
                    System.out.println("Club type: "+team.getClubCategory()+"\nName of the club: " + team.getNameOfClub() + "\n Loaction: " + team.getLocation() + "\n Number of members: " + team.getNumberOfMembers()
                            + "\n Head COach:" + team.getHeadCoach() + "\n President of the Club: " + team.getPresidentOfTheClub() + "\n Club wins: " + team.getClubWin()
                            + "\n Club Draws: " + team.getClubDraw() + "\n Club Defeats: " + team.getClubDefeat() + "\n Goals Received: " + team.getGoalsReceived()
                            + "\n Goals Scored: " + team.getGoalsScored() + "\n Club Points: " + team.getClubPoints() + "\n NUmber of played matches: " + team.getNumPlayedMatches());
                } else {
                    System.out.println(UserChoiceTeam + "Club does not exists within the system.");
                }
            }
        } catch (NullPointerException n) {
            System.out.println("List is empty. NO teams and their stats have been recorded.");
        }
    }

    public void DisplayPremierLeagueTable() {
        Scanner sc = new Scanner(System.in);
        //Convert arraylist to list
        FootballClub[] TeamList = ListOfClubs.toArray(new FootballClub[0]);
        System.out.println("Hi");
        if(TeamList.length==0){
            System.out.println("Empty");
        }
        FootballClub temp;
        //  swapping values. orders interms of points.
        for (int i = 0; i < (TeamList.length); i++) {
            for (int j = i+1; j < TeamList.length; j++) {
                if (TeamList[i].getClubPoints() < TeamList[j].getClubPoints()) {
                    //swap elements
                    temp = TeamList[i];
                    TeamList[i] = TeamList[j];
                    TeamList[j] = temp;

                }
            }
        }
        // orders in terms of goals scored if points are equal
        for (int i = 0; i < (TeamList.length); i++) {
            for (int j = i+1; j < TeamList.length; j++) {
                if (TeamList[i].getClubPoints() == TeamList[j].getClubPoints()) {
                    if(TeamList[i].getGoalsScored() < TeamList[j].getGoalsScored()) {
                        //swap elements
                        temp = TeamList[i];
                        TeamList[i] = TeamList[j];
                        TeamList[j] = temp;
                    }

                }
            }
        }
        // creates table
        System.out.println("This Three work swap");


            System.out.println(String.format("%5s %5s %5s %5s %5s %5s %5s %5s %5s %5s %5s %5s %5s %5s %5s %5s %5s %5s %5s", "Club name", "|", "Location", "|", "Head Coach","|","Club Points","|","Club Scored","|","Goals Received","|","Wins","|","Draws","|","Defeats","|","Date(Last update)"));
        System.out.println(String.format("%s", "------------------------------------------------------------------------------------------------------------------------------------------------------------------------"));
        //Creates rows on table
        for (FootballClub FootballTemp : TeamList) {
            if(TeamList.length==0){
                System.out.println(String.format("%10s %15s %10s ", "List is Empty..."));
            }
            System.out.println(String.format("%5s %10s %5s %10s %5s %10s %5s %10s %5s %10s %5s %10s %5s %10s %5s %10s %5s %10s %5s", FootballTemp.getNameOfClub(), "|", FootballTemp.getLocation(), "|", FootballTemp.getHeadCoach(), "|", FootballTemp.getClubPoints(), "|", FootballTemp.getGoalsScored(), "|", FootballTemp.getGoalsReceived(), "|", FootballTemp.getClubWin(), "|", FootballTemp.getClubDraw(), "|", FootballTemp.getClubDefeat(), "|", FootballTemp.getDate()));
        }
        System.out.println(String.format("%s", "------------------------------------------------------------------------------------------------------------------------------------------------------------------------"));
        // prompt to hold for menu to open.
        System.out.println("Enter any character to return back to main?");
        String returnTOMain = sc.nextLine();
        if(!returnTOMain.isEmpty()){
            System.out.println("Returning back to main...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }



    public void AddPlayedMatch() {
        int DayInput = 0;
        int MonthInput = 0;
        int YearInput = 0;
        Date tempDateV2= null;
        Date TempDate2 = null;
        String TeamA = null;
        String TeamB = null;
        int TeamAPoints = 0;
        int TeamBPoints = 0;
        FootballClub TempObj= null;
        String TeamWinner = null;
        String TeamDraw = null;
        String TeamDefeat = null;
        boolean InputValid;

        Scanner sc = new Scanner(System.in);
        try {
            InputValid = false;
            System.out.println("Enter name of home team or enter 'x' to go back to main: ");
            TeamA = sc.next();
            if(TeamA.equals("x")|| TeamA.equals("X")){
                System.out.println("Returning back to main...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println("Enter name of opposing team: ");
            TeamB = sc.next();
            System.out.println("Enter score of home team: ");
            TeamAPoints = sc.nextInt();
            System.out.println("Enter score of opposing team: ");
            TeamBPoints = sc.nextInt();

            System.out.println("Enter year(Example: XXXX): ");
            YearInput = sc.nextInt();
            System.out.println("Enter month(Example: XX): ");
            MonthInput = sc.nextInt();
            System.out.println("Enter date(Example: XX): ");
            DayInput = sc.nextInt();
            tempDateV2 = new Date(DayInput,MonthInput,YearInput);



            TempDate2 = new Date(DayInput, MonthInput, YearInput);
        }catch (InputMismatchException e){
            System.out.println("Invalid input, please try again.");
            AddPlayedMatch();
        }

        for (FootballClub team : ListOfClubs) {
            if (team.getNameOfClub().equals(TeamA)) {
                if (TeamAPoints > TeamBPoints) {
                    team.setGoalsScored(team.getGoalsScored() + TeamAPoints);
                    team.setGoalsReceived(team.getGoalsReceived() + TeamBPoints);
                    team.setClubWin(team.getClubWin() + 1);
                    team.setDate(tempDateV2);
                } else if (TeamAPoints < TeamBPoints) {
                    team.setGoalsScored(team.getGoalsScored() + TeamAPoints);
                    team.setGoalsReceived(team.getGoalsReceived() + TeamBPoints);
                    team.setClubDefeat(team.getClubDefeat() + 1);
                    team.setDate(tempDateV2);

                } else {
                    team.setGoalsScored(team.getGoalsScored() + TeamAPoints);
                    team.setGoalsReceived(team.getGoalsReceived() + TeamBPoints);
                    team.setClubDraw(team.getClubDraw() + 1);
                    team.setDate(tempDateV2);
                }


            }
        }
        for (FootballClub team2 : ListOfClubs) {
            if (team2.getNameOfClub().equals(TeamB)) {
                if(TeamBPoints>TeamAPoints) {
                    team2.setGoalsScored(team2.getGoalsScored() + TeamBPoints);
                    team2.setGoalsReceived(team2.getGoalsReceived() + TeamAPoints);
                    team2.setClubWin(team2.getClubWin() + 1);
                    team2.setDate(tempDateV2);
                } else if(TeamBPoints < TeamAPoints){
                    team2.setGoalsScored(team2.getGoalsScored()+ TeamBPoints);
                    team2.setGoalsReceived(team2.getGoalsReceived() + TeamAPoints);
                    team2.setClubDefeat(team2.getClubDefeat()+1);
                    team2.setDate(tempDateV2);

                }else{
                    team2.setGoalsScored(team2.getGoalsScored()+ TeamBPoints);
                    team2.setGoalsReceived(team2.getGoalsReceived() + TeamAPoints);
                    team2.setClubDraw(team2.getClubDraw()+1);
                    team2.setDate(tempDateV2);
                }

            }
        }

        }


        public void SaveFile() {
        FootballClub TempObj = null;

            ObjectOutputStream OSave = null;
            try {
                File file = new File("C:\\Users\\hp\\OOP_CWV3\\premierleaguev1\\app\\entities\\FootballClubFileV2.txt");
                FileOutputStream fos = new FileOutputStream(file);
                OSave = new ObjectOutputStream(fos);
                for (FootballClub ObjSport : ListOfClubs){
                    OSave.writeObject(ObjSport);

                    fos.flush();
                    OSave.flush();
                    System.out.println("File has been saved");
                }
            } catch (Exception e) {
                System.out.print("Exception occurred while trying to save file. ");
            }

        }
    public void LaunchGUI(){
        try{
            Runtime.getRuntime().exec(new String[]{"cmd","/c","start chrome http://localhost:4200/"});
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    }
