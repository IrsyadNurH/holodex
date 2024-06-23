package com.holodex.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Video {
    // Getter dan Setter untuk id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Getter dan Setter untuk title
    private String title;
    // Getter dan Setter untuk url
    private String url;
    // Getter dan Setter untuk channel
    private String channel;

}
