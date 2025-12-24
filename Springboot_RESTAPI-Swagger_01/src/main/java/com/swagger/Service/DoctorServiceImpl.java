package com.swagger.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swagger.Entity.DoctorEntity;
import com.swagger.Repository.DoctorRepo;

@Service
public class DoctorServiceImpl implements DoctorService{
	
	@Autowired
	private DoctorRepo docrepo;

	@Override
	public DoctorEntity docsave(DoctorEntity docentity) {
		DoctorEntity obj1 = docrepo.save(docentity);
		return obj1;
	}

	@Override
	public List<DoctorEntity> getDoclist() {
		List<DoctorEntity> obj2 = docrepo.findAll();
		return obj2;
	}

	@Override
	public DoctorEntity docupdate(DoctorEntity docentity) {
		DoctorEntity obj3 = docrepo.save(docentity);
		return obj3;
	}

	@Override
	public DoctorEntity docdelete(Integer doctor_id) {
		DoctorEntity obj4 = docrepo.findById(doctor_id).get();
		docrepo.delete(obj4);
		return obj4;
	}

}
