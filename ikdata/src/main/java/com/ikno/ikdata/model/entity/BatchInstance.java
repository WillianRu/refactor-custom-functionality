package com.ikno.ikdata.model.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class BatchInstance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String idIknoPlus;

    // @Type(type = "org.hibernate.type.TextType")
    @Lob
    @Column(length = -1)
    private String name;

    // Best way to force nullable (in case Hibernate is setting it up as not null)
    @Column(nullable = true)
    private int pages;

    private String rootDirectory;
    private String processingDirectory;

    private String status;

    private int priority;

    // This is needeed because hibernate is throwing exceptions without it
    @Column(name = "\"currentUser\"")
    private String currentUser;

    @Column(name = "\"newsUser\"")
    private String newsUser;

    @ManyToOne
    private Project project;

    @CreationTimestamp
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDateTime importDate;

    @UpdateTimestamp
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDateTime modifiedDate;

    private String infuseToken;
    private String infuseScannerId;
    private String infuseAdditionalInfo;

    @Column(name = "\"preprocessingProgress\"", nullable = true)
    private Double preprocessingProgress;

    @Column(name = "\"processingProgress\"", nullable = true)
    private Double processingProgress;

    @Column(name = "\"generalProgress\"", nullable = true)
    private Double generalProgress;

    private String exportDirectory;

}
