package ru.skypro.homework.entity;

import lombok.Data;
import ru.skypro.homework.dto.Role;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
public class User extends ImageEntity{

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private String phone;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Override
    protected String getImageSubdirName() {
        return realmUsers;
    }
}
