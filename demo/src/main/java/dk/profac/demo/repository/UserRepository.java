package dk.profac.demo.repository;

import dk.profac.demo.model.ProfacUser;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public ProfacUser getByUsername(String username) {
        return entityManager.createQuery("SELECT u FROM profac_users u WHERE u.username = :username", ProfacUser.class)
                .setParameter("username", username)
                .getSingleResult();

    }

    public ProfacUser createUser(String username, String password) {
        return (ProfacUser) entityManager.createNativeQuery("INSERT INTO profac_users (username, password) VALUES (?, ?)", ProfacUser.class)
                .setParameter(1, username)
                .setParameter(2, password)
                .getSingleResult();
    }

}
