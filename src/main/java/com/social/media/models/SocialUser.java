package com.social.media.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SocialUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;


    //This helps to implement bidirectional from social profile
    @OneToOne
    @JoinColumn(name = "social_profile_id")
    private SocialProfile socialProfile;// This will be a foreign key in this Entity and the Primary from Social Profile
}
