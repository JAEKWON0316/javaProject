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
        
        try(res1; res2){ //���� 2���� �ִ´�. ����� �ϳ� �ϳ� �� �����°Ŵϱ� �����ݷ�; �� ����ش�.
        	String data1 = res1.read1();
            String data2 = res2.read2();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
	} 

}
