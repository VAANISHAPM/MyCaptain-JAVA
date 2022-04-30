class fibonacci{
	public static void main(String[] args){
		int t = 0, t1 = 0, t2;
		System.out.println(t+" "+t1);
		for(int i = 0; i <= 10;i++){
			t2 = t + t1;
			System.out.println(" "+t2);
			t = t1;
			t1 = t2;
		}
	}
}
