package task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

enum Country {
    Ukraine("Ukraine"), USA("USA"), Poland("Poland");

    public final String string;

    private Country(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
}

@Getter
@AllArgsConstructor
public class FacebookUser {
    private String email;
    private Country userCountry;
    private LocalDate getUserActiveTime;
}
