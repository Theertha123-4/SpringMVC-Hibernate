package spring_mvc;

import java.util.List;

public interface dao_int {

	
	public void add(pojo_mvc p);
	
	public List view();
	
	
	public List edit(int id);
	public void update(pojo_mvc p);
	
	
	public void delete(int id);
}
