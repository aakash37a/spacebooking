package dt.cdac.dao;


import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dt.cdac.model.PropertyDetail;



@Repository
public class PropertyDetailDaoImpl {

	@Autowired
	private SessionFactory sessionFactory;
	
	private static final Logger logger= LoggerFactory.getLogger(PropertyDetailDaoImpl.class);
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		System.out.println("in getCurrentSession() ");
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public List<PropertyDetail> getPropertyDetails(){
		//List<PropertyDetail> p = getCurrentSession().createQuery("from PropertyDetail").list();
		org.hibernate.Query q = (org.hibernate.Query) getCurrentSession().getNamedQuery("PropertyDetail.byID");
		q.setParameter(0,1);
		List<PropertyDetail> p = q.list();
		logger.info("Property List Fetched Successfully");
		return p;
	}
}
