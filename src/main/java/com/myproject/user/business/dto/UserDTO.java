package com.myproject.user.business.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

  private String name;
  private String email;
  private String password;
  private List<AddressDTO> addresses;
  private List<PhoneNumberDTO> phoneNumbers;
}
