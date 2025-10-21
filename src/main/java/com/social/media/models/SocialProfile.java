package com.social.media.models;

import jakarta.persistence.*;

@Entity
public class SocialProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    //This annotation for One-to-One relation on Single
    // class used as One-to-One relation after implemented to another class will change and Be Bidirectional relation
    @OneToOne
    @JoinColumn(name = "social_user")
    private SocialUser user;
}
