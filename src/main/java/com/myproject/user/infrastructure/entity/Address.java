package com.myproject.user.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "address")

public class Address {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "street")
  private String street;

  @Column(name = "number")
  private Long number;

  @Column(name = "city", length = 150)
  private String city;

  @Column(name = "state")
  private String state;

  @Column(name = "postal_code", length = 9)
  private String postalCode;

  @Column(name = "additional_info", length = 20)
  private String additionalInfo;
}
