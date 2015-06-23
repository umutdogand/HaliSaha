package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import pojos.Saha;
import util.HibernateUtil;

public class SahaDao {
	public List<Saha> getAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria crit = session.createCriteria(Saha.class);
		List result = crit.list();
		return result;
	}
}
