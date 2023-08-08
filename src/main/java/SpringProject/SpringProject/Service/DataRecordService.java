package SpringProject.SpringProject.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import SpringProject.SpringProject.Model.Data;
import SpringProject.SpringProject.Model.Record;
import SpringProject.SpringProject.Repository.DataRepository;
import SpringProject.SpringProject.Repository.RecordRepository;

@Service
public class DataRecordService {
@Autowired DataRepository datarepo;
	public List<Data> getData(){
		List<Data>lst=new ArrayList<Data>();
		for(Data d:datarepo.findAll()) {
			Data dd=new Data(d.getdata_id(), d.getName(),d.getEmail(),null);
			lst.add(dd);
		}
		return lst;
		}
	@Autowired RecordRepository recordreo;
	public List<Record>getRecord(){
		List<Record>lst=new ArrayList<Record>();
		for(Record r:recordreo.findAll()) {
			Record re=new Record(0, r.getStatus(),null);
			lst.add(re);
		}
		return lst;
	}
	
	public  List<Record>getDataWiseRecord(int data_id){
		List<Record>lst=new ArrayList<Record>();
		for(Record r:recordreo.findAll()) {
			if(r.getData().getdata_id()==data_id){
				Data d=new Data(r.getData().getdata_id(), r.getData().getName(), r.getData().getEmail(), null);
				Record re=new Record(r.getRecord_id(), r.getStatus(), d);
				lst.add(re);
			}
		}
		return lst;
		
	}
	
	public String AddData(@RequestBody Data d) {
		Data dd=new Data(0, d.getName(), d.getEmail(), null);
		Data dt=datarepo.save(dd);
		for(Record r:d.getRecord()) {
			Record re=new Record(0, r.getStatus(), dt);
			recordreo.save(re);
		}
		return "added";
		
	}
//		Data dd=new Data(0, d.getName(), d.getEmail(), null);
//		Data dt=datarepo.save(dd);
//		for(Record r:d.getRecord()) {
//			Record re=new Record(0, r.getStatus(), dt);
//			recordreo.save(re);
//		}
//		
//		return "Added";
//	}
	}





