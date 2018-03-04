
	import java.util.*;
	public class Cache{
		public static Cache instance;
		private Map<String,Object> dataMap;
	private Cache(){
		dataMap = new HashMap<>();
	}
	public static Cache getInstance(){
		if(instance == null){
			instance  = new Cache();
		}
	return instance;
	} 

	public synchronized void put(String key, Object val){
		dataMap.put(key,val);
	}
	public synchronized Object get(String key){
		return dataMap.get(key);
	}
	public synchronized boolean containsKey(String key){
		return dataMap.containsKey(key);
	}
	}