//package cvapp.dao.impl;
//
//import java.util.List;
//
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//import cvapp.dao.exception.DaoCreateException;
//import cvapp.dao.exception.DaoDeleteException;
//import cvapp.dao.exception.DaoFindException;
//import cvapp.dao.exception.DaoUpdateException;
//import cvapp.dao.services.ActivityDao;
//import cvapp.model.Activity;
//
//public class ActivityDaoImpl implements ActivityDao {
//
//	private EntityManagerFactory emFactory = null;
//
//	@Override
//	public void init() {
//		emFactory = Persistence.createEntityManagerFactory("cvapp");
//	}
//
//	@Override
//	public void close() {
//		if (emFactory != null) {
//			emFactory.close();
//		}
//	}
//
//	@Override
//	public void create(Activity activity) throws DaoCreateException {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void update(Activity activity) throws DaoUpdateException {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public Activity findById(Integer id) throws DaoFindException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void delete(Activity activity) throws DaoDeleteException {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public List<Activity> findAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void deleteAll() {
//		// TODO Auto-generated method stub
//
//	}
//
//}
