public class BinaryReversal {
	public static void main(String[] args) {
		System.out.println(binaryReversal("47"));
}
	
	 public static String binaryReversal(String input) {
		 int n = Integer.parseInt(input);
		 StringBuilder sb = new StringBuilder();
		 while(n >0){
			 sb.append(n%2) ;
			 n = n/2;
		 }
		 return Integer.parseInt(String.format("%1$-"+8+"s", sb.toString()).replace(' ', '0'), 2)+"";
	 }
	 
} 

