class Abc
{
    public static void main(String args[])
    {
        int x=args.length;
        int sum=0;                                           
        for(int i=0; i<x; i++)
        {
            System.out.println(args[i]);
            sum+=Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }
}                                                             
