package com.bmw.reproducer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WELCOME")
public class Welcome {
    @Id
    public Long id;
    public String message;
}