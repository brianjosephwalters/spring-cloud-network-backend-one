package com.example.backendone.domains;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Sample {
    @Id
    private Long id;
    @Column
    private String value;
}
