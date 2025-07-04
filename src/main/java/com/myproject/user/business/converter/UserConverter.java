package com.myproject.user.business.converter;

import java.util.List;

import org.springframework.stereotype.Component;

import com.myproject.user.business.dto.AddressDTO;
import com.myproject.user.business.dto.PhoneNumberDTO;
import com.myproject.user.business.dto.UserDTO;
import com.myproject.user.infrastructure.entity.Address;
import com.myproject.user.infrastructure.entity.PhoneNumber;
import com.myproject.user.infrastructure.entity.User;

@Component
public class UserConverter {

  public User toUser(UserDTO userDTO) {
    return User.builder()
        .name(userDTO.getName())
        .email(userDTO.getEmail())
        .password(userDTO.getPassword())
        .addresses(toAddressList(userDTO.getAddresses()))
        .phoneNumbers(toPhoneNumberList(userDTO.getPhoneNumbers()))
        .build();
  }

  public List<Address> toAddressList(List<AddressDTO> addressDTOs) {
    return addressDTOs.stream().map(this::toAddress).toList();
  }

  public Address toAddress(AddressDTO addressDTO) {
    return Address.builder()
        .street(addressDTO.getStreet())
        .city(addressDTO.getCity())
        .number(addressDTO.getNumber())
        .state(addressDTO.getState())
        .postalCode(addressDTO.getPostalCode())
        .additionalInfo(addressDTO.getAdditionalInfo())
        .build();
  }

  public List<PhoneNumber> toPhoneNumberList(List<PhoneNumberDTO> phoneNumberDTOs) {
    return phoneNumberDTOs.stream().map(this::toPhoneNumber).toList();
  }

  public PhoneNumber toPhoneNumber(PhoneNumberDTO phoneNumberDTO) {
    return PhoneNumber.builder()
        .number(phoneNumberDTO.getNumber())
        .zipCode(phoneNumberDTO.getZipCode())
        .build();
  }

  public UserDTO toUserDTO(User user) {
    return UserDTO.builder()
        .name(user.getName())
        .email(user.getEmail())
        .password(user.getPassword())
        .addresses(toAddressDTOList(user.getAddresses()))
        .phoneNumbers(toPhoneNumberDTOList(user.getPhoneNumbers()))
        .build();
  }

  public List<AddressDTO> toAddressDTOList(List<Address> addresses) {
    return addresses.stream().map(this::toAddress).toList();
  }

  public AddressDTO toAddress(Address address) {
    return AddressDTO.builder()
        .street(address.getStreet())
        .city(address.getCity())
        .number(address.getNumber())
        .state(address.getState())
        .postalCode(address.getPostalCode())
        .additionalInfo(address.getAdditionalInfo())
        .build();
  }

  public List<PhoneNumberDTO> toPhoneNumberDTOList(List<PhoneNumber> phoneNumber) {
    return phoneNumber.stream().map(this::toPhoneNumber).toList();
  }

  public PhoneNumberDTO toPhoneNumber(PhoneNumber phoneNumber) {
    return PhoneNumberDTO.builder()
        .number(phoneNumber.getNumber())
        .zipCode(phoneNumber.getZipCode())
        .build();
  }
}
