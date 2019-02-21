package com.examplo.rest.springcloudmysql.repository;

import com.examplo.rest.springcloudmysql.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author desenv-02
 */
@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {} 