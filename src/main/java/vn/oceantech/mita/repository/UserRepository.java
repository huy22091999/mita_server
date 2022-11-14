package vn.oceantech.mita.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.oceantech.mita.domain.User;
import vn.oceantech.mita.dto.UserDto;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select u from User u left join fetch u.roles where u.username = ?1")
    User findByUsername(String username);
    @Query("select u from User u where u.email=:email")
    User findByEmail(@Param("email") String email);

    @Query("select u from User u left join fetch u.roles where u.id = ?1")
    Optional<User> findById(Long id);
}
