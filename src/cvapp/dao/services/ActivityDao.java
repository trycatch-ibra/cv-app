package cvapp.dao.services;

import java.util.List;

import cvapp.dao.exception.DaoCreateException;
import cvapp.dao.exception.DaoDeleteException;
import cvapp.dao.exception.DaoFindException;
import cvapp.dao.exception.DaoUpdateException;
import model.Activity;

public interface ActivityDao {
	public void create(Activity activity) throws DaoCreateException;

	public void update(Activity activity) throws DaoUpdateException;

	public Activity findById(Integer id) throws DaoFindException;

	public void delete(Activity activity) throws DaoDeleteException;

	public List<Activity> findAll();

	public void deleteAll();

}
