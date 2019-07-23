package lambda_practice.users_database;

import java.time.LocalDate;
import java.util.Random;

public class User {

    private String email;
    private LocalDate loginDate;
    private Integer team;

    private Random random;

    public User(String email, LocalDate loginDate, Integer team) {
        this.email = email;
        this.loginDate = loginDate;
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(LocalDate loginDate) {
        this.loginDate = loginDate;
    }

    public Integer getTeam() {
        return team;
    }

    public void setTeam(Integer team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "User's " +
                "email:'" + email+"@gmail.com"+ '\'' +
                ", loginDate: '" + loginDate + '\'' +
                ", team: '" + team + '\'' +
                '\n';
    }
}
