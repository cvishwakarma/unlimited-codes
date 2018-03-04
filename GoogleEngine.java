	interface IGoogleEngine {
		String [] directions(String source, String destination);
	}
	public class IndiaGoogleEngineImpl implements IGoogleEngine {
	@override
	 public String [] directions(String source, String destination) {
	          return new String [] {"20,31","21,33","(23,45"};
	 }
	}
	public class USGoogleEngineImpl implements IGoogleEngine {
	@override
	public String [] directions(String source, String destination) {
	          return new String [] {"30,41","31,43","(33,55"};
	 }
	}
	public class GeoMapRender {
	    IGoogleEngine googleEngine;
	    public String [] render(String source, String destination) {
		  googleEngine = GoogleEngineServiceLocator.locateService();
		  String [] coordinates  = googleEngine.directions(source, destination);
          for(String s: coordinates){
		      System.out.println(s);
		  } 		  
		}
		public setGoogleEngine(IGoogleEngine googleEngine){
		     this.googleEngine =  googleEngine;
		}
	}