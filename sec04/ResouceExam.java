package ch11.sec04;

public class ResouceExam {

	public static void main(String[] args) {
	    
		try(ResourceOpenClose res = new ResourceOpenClose("A")){
			String data = res.read1();
			int value = Integer.parseInt(data);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
        System.out.println();
        
        try(ResourceOpenClose res = new ResourceOpenClose("A")){
			String data = res.read2();
			int value = Integer.parseInt(data);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
        System.out.println();
        
        ResourceOpenClose res1 = new ResourceOpenClose("A");
        ResourceOpenClose res2 = new ResourceOpenClose("B");
        
        try(res1; res2){ //변수 2개를 넣는다. 명령이 하나 하나 씩 끝나는거니까 세미콜론; 을 찍어준다.
        	String data1 = res1.read1();
            String data2 = res2.read2();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
	} 

}
