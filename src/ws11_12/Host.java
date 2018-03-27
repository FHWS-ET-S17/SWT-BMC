package ws11_12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Host {
	
	private Map<String,DisplayElement> deMap= new HashMap<>();
	
	public void loadPLCs(){
		List<PLC> plcs = DataBaseImport.loadPlcs();
		Iterator <PLC> plcIt = plcs.iterator();
		while (plcIt.hasNext()){
			PLC plc = plcIt.next();
			deMap.put(plc.getName(), plc);
			
		}
		
	}
	
	
	public void linkDisplayElement(){
		Iterator <DisplayElement> deIt= deMap.values().iterator();
		while (deIt.hasNext()){
			DisplayElement de = deIt.next();
			List<String> aList = de.getAssociatedNames();
			for (int i=0; i<aList.size();i++){
				de.link(deMap.get(aList.get(i)));
			}
		}
	}

}
