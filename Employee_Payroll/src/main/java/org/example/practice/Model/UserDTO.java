package org.example.practice.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.ToString;

import java.util.List;
import lombok.ToString;

public @ToString class UserDTO {
    @Pattern(regexp = "^[A-Za-z]{3,}$",
            message = "Name must be at least 3 alphabetic characters")
    private String name;

    @Min(value=500,message = "Minimum wage should be more than 500")
    public long salary;

    @Pattern(regexp = "male|female",message = "Gender is required")
    public String gender;

    @JsonFormat(pattern = "dd MMM yyyy")
    @PastOrPresent(message = "Start date should be in the past or present")
    @PastOrPresent(message = "Start Date needs to be mentioned")
    public String startDate;

    @NotBlank(message = "Note connot be empty")
    public String note;

    @NotBlank(message = "Profile Pic is Required")
    public String profilePic;

    @NotNull(message = "At least one department must be selected")
    public List<String> department;

}
