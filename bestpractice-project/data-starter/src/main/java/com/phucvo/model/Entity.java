package com.phucvo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.core.serializer.Serializer;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;

@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public abstract class Entity implements Serializer {

    @Id
    Long id;

    @Column(name = "date_created", nullable = false, updatable = false)
    @CreatedDate
    private Long createdDate;

    @Column(name = "date_modified")
    @LastModifiedDate
    private Long modifiedDate;
}
