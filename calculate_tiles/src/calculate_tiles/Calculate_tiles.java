package calculate_tiles;

import java.util.*;

public class Calculate_tiles 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter width of the room : ");
        Scanner sc = new Scanner(System.in);
        float rlength = sc.nextFloat();
        System.out.println("Enter length of the room : ");
        float rwidth = sc.nextFloat();
        float rtotal = rlength*rwidth;
        System.out.println("Enter width of the tile : ");
        float slength = sc.nextFloat();
        System.out.println("Enter length of the tile : ");
        float swidth = sc.nextFloat();
        float stotal = slength*swidth;
        float total = rtotal/stotal;
        if(total == (int)total)
            System.out.println("The average number of tile are need is "+(int)total);
        else
            System.out.println("The average number of tile are need is "+(int)(total+1));
    }
    
}
