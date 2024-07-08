package com.panha.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@MappedSuperclass
public class BaseEntity {

    @CreatedDate
    @Column(name = "created", updatable = false)
    private Date created;

    @CreatedBy
    @Column(name = "created_by" , updatable = false)
    private Long createdBy;

    @LastModifiedDate
    @Column(name = "updated")
    private Date updated;

    @LastModifiedBy
    @Column(name = "last_modified_by")
    private Long updatedBy;

    @Column
    private Boolean status = true;

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdatedAt(Date updated) {
        this.updated = updated;
    }
}