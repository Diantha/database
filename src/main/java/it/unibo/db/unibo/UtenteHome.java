package it.unibo.db.unibo;
// Generated 6-set-2018 18.31.48 by Hibernate Tools 4.3.2-SNAPSHOT


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Utente.
 * @see it.unibo.db.unibo.Utente
 * @author Hibernate Tools
 */
@Stateless
(name="unibo_UtenteHome") 
public class UtenteHome {

    private static final Log log = LogFactory.getLog(UtenteHome.class);

    @PersistenceContext(unitName="unibo") private EntityManager entityManager;
    
    public void persist(Utente transientInstance) {
        log.debug("persisting Utente instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Utente persistentInstance) {
        log.debug("removing Utente instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Utente merge(Utente detachedInstance) {
        log.debug("merging Utente instance");
        try {
            Utente result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Utente findById( Integer id) {
        log.debug("getting Utente instance with id: " + id);
        try {
            Utente instance = entityManager.find(Utente.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

