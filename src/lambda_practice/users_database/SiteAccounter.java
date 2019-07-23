package lambda_practice.users_database;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class SiteAccounter {
    private static final int TEAM1 = 1;
    private static final int TEAM2 = 2;
    private static final int TEAM3 = 3;
    private static final int MAX_TEAM_QUANTITY = 3;
    private static final int MIN_TEAM_QUANTITY = 1;
    private static final LocalDate PREVIOUS_WEEK_DATE = LocalDate.of(2019, 7, 14);

    public SiteAccounter(){
        createListsOfUsers();
    }

    public void createListsOfUsers(){
        List<User>users = buildListIfUsers();

        List<User> teamOne = users.stream()
                .filter(user -> user.getTeam().equals(TEAM1))
                .collect(Collectors.toList());
        System.out.println("People from team 1: "+ teamOne);

        List<User> teamTwo = users.stream()
                .filter(user -> user.getTeam().equals(TEAM2))
                .collect(Collectors.toList());
        System.out.println("People from team 2: "+ teamTwo);

        List<User> teamThree = users.stream()
                .filter(user -> user.getTeam().equals(TEAM3))
                .collect(Collectors.toList());
        System.out.println("People from team 3: "+ teamThree);

        List<User> thisWeekUsers = users.stream()
                .filter(user -> user.getLoginDate().isAfter(PREVIOUS_WEEK_DATE))
                .collect(Collectors.toList());
        System.out.println("People, who registered this week: "+ thisWeekUsers);
    }
    public static List<User> buildListIfUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User("Ronaldo", LocalDate.of(2019, 7, 27),(int)(Math.random()*MAX_TEAM_QUANTITY+MIN_TEAM_QUANTITY)));
        users.add(new User("Jonny777", LocalDate.of(2019, 7, 26),(int)(Math.random()*MAX_TEAM_QUANTITY+MIN_TEAM_QUANTITY)));
        users.add(new User("Roltan",  LocalDate.of(2019, 7, 25), (int)(Math.random()*MAX_TEAM_QUANTITY+MIN_TEAM_QUANTITY)));
        users.add(new User("RinaA",  LocalDate.of(2019, 7, 14), (int)(Math.random()*MAX_TEAM_QUANTITY+MIN_TEAM_QUANTITY)));
        users.add(new User("LaraKro",  LocalDate.of(2019, 7, 13), (int)(Math.random()*MAX_TEAM_QUANTITY+MIN_TEAM_QUANTITY)));
        users.add(new User("LaviniaG",  LocalDate.of(2019, 7, 20), (int)(Math.random()*MAX_TEAM_QUANTITY+MIN_TEAM_QUANTITY)));
        users.add(new User("Pasteron", LocalDate.of(2019, 7, 15), (int)(Math.random()*MAX_TEAM_QUANTITY+MIN_TEAM_QUANTITY)));
        users.add(new User("Parsinia",  LocalDate.of(2019, 7, 18), (int)(Math.random()*MAX_TEAM_QUANTITY+MIN_TEAM_QUANTITY)));
        users.add(new User("Kabren",  LocalDate.of(2019, 7, 1), (int)(Math.random()*MAX_TEAM_QUANTITY+MIN_TEAM_QUANTITY)));
        users.add(new User("Ioan1", LocalDate.of(2019, 7, 9), (int)(Math.random()*MAX_TEAM_QUANTITY+MIN_TEAM_QUANTITY)));
        return users;
    }

}
