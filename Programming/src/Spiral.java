import java.util.Scanner;

public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		
		Scanner sc=new Scanner(System.in);
		if(sc.hasNextLine()){
		String  x=sc.nextLine();
		n=Integer.parseInt(x);
		}
		int MAX=n;
		int pp=0,j,i;

	        int initial_direction = 1 , p = 1 ;    /* intial_direction

	        is set to UP because we need to start moving right */

	        int r ,c ;
            int a[][]=new int[n][n];

	        int row_right  = 0 , column_down = n-1 , row_left = n-1 , column_up = 0 ;



	        //Set all elements of the matrix to 0

	    for(r = 0 ; r < MAX ; r++)
	    {
	        for(c = 0 ; c < MAX ; c++)
	            a[r][c] = 0 ;

	    }


	    //Generate elements of the spiral matrix

	    while(p != n*n+1)
	    {

	          if(initial_direction == 1)
	          {
	            //Move RIGHT

	            r = row_right++ ;

	            for(c = 0 ; c < n ; c++)
	            {
	                if(a[r][c] == 0)
	                    a[r][c] = p++;

	            }




	            initial_direction = 4 ;
	          }
	          else if(initial_direction == 4)
	          {
	            //Move down

	            c = column_down-- ;

	            for(r = 0 ; r < n ; r++)
	            {

	                if(a[r][c] == 0)
	                    a[r][c] = p++;
	            }


	            initial_direction = 2;




	          }
	          else if(initial_direction == 2)
	          {
	            //Move left

	            r = row_left-- ;

	            for(c = n-1 ; c >= 0 ; c--)
	            {
	                if(a[r][c] == 0)
	                    a[r][c] = p++;

	            }

	            initial_direction = 3 ;





	          }
	          else if(initial_direction == 3)
	          {
	            //Move up

	            c = column_up++;

	            for(r = n-1 ; r >= 0 ; r--)
	            {

	                if(a[r][c] == 0)
	                  a[r][c] = p++;

	            }


	            initial_direction = 1 ;
	          }

	    }


	    //Print the matrix

//	    System.out.print("\n\n");

	    for(r = 0 ; r < MAX ; r++)
	    {
	          for(c = 0 ; c < MAX ; c++)
	        	  System.out.print("	"+a[r][c]);

	          System.out.print("\n");



	    }
	 int x[]=new int [82];
	 int y[]=new int [82];
	 int b=0;

		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(a[i][j]==1 || a[i][j]%11==0)
					{
						pp++;
						x[b]=i;
						y[b]=j;
						b++;
						//printf("\n (%d,%d)",i,j);
					}
			}
		}





		System.out.print("\nTotal Power points :"+pp);

		for(i=0;i<b;i++){
			System.out.print(""+"("+x[i]+","+y[i]+")");

		}

		
		
		
		
	}

}
