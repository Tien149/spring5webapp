package guru.springframework.spring5webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.spring5webapp.domain.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{

}
