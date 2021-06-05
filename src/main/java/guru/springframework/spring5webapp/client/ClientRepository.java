package guru.springframework.spring5webapp.client;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository  extends JpaRepository<Client, Long> {

}
