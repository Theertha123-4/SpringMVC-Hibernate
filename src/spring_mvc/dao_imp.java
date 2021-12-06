package spring_mvc;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;



public class dao_imp implements dao_int{

	HibernateTemplate hb;
	
	public void setHb(HibernateTemplate hb) {
		this.hb = hb;
	}
	
	@Override
	public void add(pojo_mvc p) {

	hb.save(p);	
		
	}

	@Override
	public List view() {
		
		return hb.loadAll(pojo_mvc.class);
	}

	

	@Override
	public List edit(int id) {
		List li=hb.find("from pojo_mvc p where p.id=?",id);
		return li;

		
	}

	@Override
	public void update(pojo_mvc p) {
		// TODO Auto-generated method stub
		hb.update(p);
	}
	
	public void delete(int id){
		pojo_mvc p=new pojo_mvc();
		p.setId(id);
		hb.delete(p);
	}
}
