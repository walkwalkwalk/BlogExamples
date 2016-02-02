package org.gradle.sample.services;

import lombok.Data;

import org.gradle.sample.api.Person;
import org.gradle.sample.shared.Helper;

@Data
public class PersonService {

    boolean checkPerson(Person person) {
        System.out.println(Helper.prettyPrint("Checking"));
        if (person.getFirstname().length() < 2) {
            return false;
        }
        return true;
    }
}
