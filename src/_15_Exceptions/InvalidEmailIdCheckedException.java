package _15_Exceptions;

public class InvalidEmailIdCheckedException extends Exception {

	
	private static final long serialVersionUID = 1L;
	// java exception larini tekrarsiz olmasini saglamak icin her exception a unique bir kod verir

		InvalidEmailIdCheckedException(String message){
			super(message);//default super() yerine const p'li  atadik
					
		
	}

}
