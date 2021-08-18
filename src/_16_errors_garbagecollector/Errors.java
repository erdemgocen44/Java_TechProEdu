package _16_errors_garbagecollector;


public class Errors {

	public static void main(String[] args) {
		
		//System.out.println(20/0);  // RTE degil RunTimeException
		
		//String str = "asd;  // CTEror'dur... cunku cift syntax hatasi var"
	    // syntax  hatalari handle edilebilir
		
		// java da Error dendiginde one gecilemeyen, kod ile cozulemeyen
		// sistemden kaynakli buyuk hatalar kastedilir.
		
		// Errorlar unchecked dir ve java bunlari ongoremez
		//ancak gerceklestiginde kodun calismasi durdurulur (stop executions).
		
		
		String str="";
		for (int i = 0; i < 10000000 ; i++) {
			str+=i;
			
		
		}
		
		
		
		
		}
	}
