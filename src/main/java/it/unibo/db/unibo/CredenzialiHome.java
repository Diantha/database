package it.unibo.db.unibo;
// Generated 6-set-2018 18.31.48 by Hibernate Tools 4.3.2-SNAPSHOT


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Credenziali.
 * @see it.unibo.db.unibo.Credenziali
 * @author Hibernate Tools
 */
@Stateless
(name="unibo_CredenzialiHome") 
public class CredenzialiHome {

    private static final Log log = LogFactory.getLog(CredenzialiHome.class);

    @PersistenceContext(unitName="unibo") private EntityManager entityManager;
    
    public void persist(Credenziali transientInstance) {
        log.debug("persisting Credenziali instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void remove(Credenziali persistentInstance) {
        log.debug("removing Credenziali instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        }
        catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }
    
    public Credenziali merge(Credenziali detachedInstance) {
        log.debug("merging Credenziali instance");
        try {
            Credenziali result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Credenziali findById( Integer id) {
        log.debug("getting Credenziali instance with id: " + id);
        try {
            Credenziali instance = entityManager.find(Credenziali.class, id);
            log.debug("get successful");
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}

