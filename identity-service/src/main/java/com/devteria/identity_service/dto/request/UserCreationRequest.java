package com.devteria.identity_service.dto.request;

import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    @Size(min = 3, message = "Username must be at least 3 character")
     String userName;

    @Size(min = 8, message = "Password must be at least 8 character")
     String password;
     String fullName;
     LocalDate dob;


}
