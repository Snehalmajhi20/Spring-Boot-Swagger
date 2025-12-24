package com.swagger.Service;

import java.util.List;

import com.swagger.Entity.DoctorEntity;

public interface DoctorService {
	
	public DoctorEntity docsave(DoctorEntity docentity);
	public List<DoctorEntity> getDoclist();
	public DoctorEntity docupdate(DoctorEntity docentity);
	public DoctorEntity docdelete(Integer doctor_id);

}
