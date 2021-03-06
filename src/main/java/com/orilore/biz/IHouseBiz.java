package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
import java.util.Map;
public interface IHouseBiz{
	public boolean save(House house);
	public boolean remove(Integer id);
	public House find(Integer id);
	public boolean enable(int id,int status);
	public boolean saveImage(House bean);
	public List<House> query(Map<String,Object> map);
	public List<House> query2(Map<String,Object> map);
	public List<HouseState> state();
}