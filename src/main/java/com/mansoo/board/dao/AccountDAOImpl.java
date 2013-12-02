package com.mansoo.board.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.mansoo.board.data.Account;

@Repository
public class AccountDAOImpl implements AccountDAO {
	
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
	public Account getAccount(String accountId, String password) {
		this.sessionFactory.getCurrentSession().createQuery("FROM Account").list();
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Account> getAccountList() {
		return this.sessionFactory.getCurrentSession().createQuery("FROM Account").list();
	}

	@Override
	public Account getAccount(Account account) {
		return (Account) this.sessionFactory.getCurrentSession().load(Account.class, 1);
	}

	@Override
	public Account getAccount(String accountId) {
		
//		this.sessionFactory.getCurrentSession().createQuery("FROM ACCOUNT_AUTHORITY").list();
		
		
		
//		Session session = getSession();
//		Criteria criteria = session.createCriteria(Account.class);
		
//		List<Account> list = criteria.
		
		
		
		
//        Session session = getSession();
//        
//        try {
//            Criteria criteria = session.createCriteria(Account.class);
//            @SuppressWarnings("unchecked")
//            List<Account> list = criteria
//                    .createAlias("userProfiles", "userProfiles", CriteriaSpecification.LEFT_JOIN)
//                    .createAlias("userResource", "userResource", CriteriaSpecification.LEFT_JOIN)
//                    .createAlias("userProfiles.profile", "profile", CriteriaSpecification.LEFT_JOIN)
//                    .createAlias("userProfiles.profile.profileCategory", "profileCategory", CriteriaSpecification.LEFT_JOIN).add(Restrictions.eq("userName", userName)).list();
//
//            if (list != null && list.size() > 0) {
//                return list.get(0);
//            }
//            
//        } catch (DataAccessException e) {
//            throw e;
//        } finally {
//            releaseSession(session);
//        }
		
		return null;
	}
}
