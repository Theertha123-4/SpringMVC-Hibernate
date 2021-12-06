package spring_mvc;

import java.util.List;

public class serviceimp implements service_interface{

	dao_imp sd;


	public void setSd(dao_imp sd) {
		this.sd = sd;
	}

	
	@Override
	public void add(pojo_mvc p) {
		
sd.add(p);
		
	
			
		}


	@Override
	public List view() {
		
		return sd.view();
	}


	@Override
	public List edit(int id) {
		// TODO Auto-generated method stub
		return sd.edit(id);
	}


	@Override
	public void update(pojo_mvc p) {
		// TODO Auto-generated method stub
		sd.update(p);
	}
		public  void delete(int id){
			sd.delete(id);
		}


		@Override
		public void delete(pojo_mvc p) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	


