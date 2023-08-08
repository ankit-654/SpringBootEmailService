package SpringProject.SpringProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SpringProject.SpringProject.Model.Data;
import SpringProject.SpringProject.Model.Record;
import SpringProject.SpringProject.Service.DataRecordService;

@RestController
public class DataServiceController {

	@Autowired DataRecordService datarecord;
	
	@GetMapping("data")
	public List<Data>GetAllData(){
		
		return datarecord.getData();
	}
	
	@GetMapping("datawise/record")
	public List<Record>GetAllRecord(int id){
		return datarecord.getDataWiseRecord(id);
	}
	
	@PostMapping("add/datarecord")
	public Data AddData(@RequestBody Data d) {
//		System.out.println(d.getEmail()+" "+d.getName());
//		for(Record r:d.getRecord())
//		{
//			System.out.println(r.getStatus());
//		}
		datarecord.AddData(d);
		
		return d;
	}
}
