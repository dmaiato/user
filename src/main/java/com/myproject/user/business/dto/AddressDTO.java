package com.myproject.user.business.dto;

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
public class AddressDTO {

  private String street;
  private Long number;
  private String city;
  private String state;
  private String postalCode;
  private String additionalInfo;
}
