package io.github.pascalgrimaud.accountancy.repository;

import io.github.pascalgrimaud.accountancy.domain.Invoice;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/**
 * Spring Data MongoDB repository for the Invoice entity.
 */
@SuppressWarnings("unused")
@Repository
public interface InvoiceRepository extends MongoRepository<Invoice, String> {

}
