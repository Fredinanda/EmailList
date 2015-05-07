package com.sds.icto.emaillist.test;

import java.util.List;

import com.sds.icto.emaillist.dao.EmailListDao;
import com.sds.icto.emaillist.vo.EmailListVo;

public class TestEmailListDao {

	public static void main(String[] args) {
		
		try{
		//testDelete();	
		testInsert();
		testFetchList();
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}
	
	public static void testDelete() throws Exception{
		EmailListDao dao = new EmailListDao();
		
		dao.delete();
	}
	
	public static void testFetchList() throws Exception{
		EmailListDao dao = new EmailListDao();
		
		List<EmailListVo> list = dao.fetchList();
		
		for (EmailListVo vo : list) {
			System.out.println( vo.getNo() + vo.getFirst_name() + vo.getLast_name() + vo.getEmail() );
		}
	
	}

	public static void testInsert() throws Exception{
		EmailListVo vo = new EmailListVo();
		EmailListDao dao = new EmailListDao();
		
		vo.setFirst_name("je");
		vo.setLast_name("min");
		vo.setEmail("kkk@name.com");
		dao.insert( vo );
		
		vo.setFirst_name("asdg");
		vo.setLast_name("asdgzxc");
		vo.setEmail("zxcb@zxcbzcb.com");
		dao.insert( vo );
	}
}
