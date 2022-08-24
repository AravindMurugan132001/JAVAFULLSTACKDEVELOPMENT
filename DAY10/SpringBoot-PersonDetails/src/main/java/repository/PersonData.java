package repository;

import lombok.Getter;
import model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Getter
public class PersonData {
    ArrayList<Person> person = new ArrayList<>();
}
