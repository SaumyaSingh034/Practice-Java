class StringReverse
{
	static StringBuffer s = new StringBuffer("position 1  no. @ durga is This");
    public static void main(String[ ] args)
	{
	    System.out.println(s);
	    int i = 0, w=0, j=0;
	   while(i < s.length() )
	     {
		    if(i == 0)
			w=0;
		    if(s.charAt(i) == ' ' ||  i==s.length()-1)
		        {
			        j=i;       //i=29,j=29
			        if(i == s.length()-1)
				    j = i; //j=29
			        else
				    j-- ;   //j=28
			       swap(w,j);
		            w = i+1;	
		        }
		    i++;
	      }//while(i <  s.length())
          swap(0 ,s.length()-1);
	      System.out.println(s);
}
static void swap(int i, int j)
{
	while(i<j)
	{
		char ch = s.charAt(i);
		s.setCharAt(i,s.charAt(j));
		s.setCharAt(j,ch);
		i++;
		j--;
	}
}
}