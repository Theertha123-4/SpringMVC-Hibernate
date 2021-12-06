package spring_mvc;

import java.util.List;

public interface service_interface {

	
	public void add(pojo_mvc p);
	
	public List view();
	public List edit(int id);
	public void update(pojo_mvc p);
	public void delete(pojo_mvc p);

}
