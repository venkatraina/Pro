package guvi;



public class Index_equal_number {

	public static void main(String[] args) {
		
		 index o1=new index();
	     o1.Index();

	}

}class index{
	int[] arr={0,1,6,2,3,4,5};
	void Index(){
	for(int i=0;i<arr.length;i++){

    if(i==arr[i]){
    	System.out.println(arr[i]+" ");
    }
	}
	}
	
	
}
