package learnjava;

class DemoException
{
    public static void main(String[] args)
    {

        multipleCatch2();
        new DemoException().multipleCatch();  //call a non-static function from a static context
        //
        try
        {
            int arr[]={5,0,1,2};
            try
            {
                int x=arr[3]/arr[1];
            }

            catch(ArrayIndexOutOfBoundsException e){

                System.out.println("array index out of bound exception");
            }

            //if an exception can't be caught by inner catch block, outer catch block will be
            //checked instead.
            System.out.println("Code won't run here");

            arr[4]=3;
        }
        catch(ArithmeticException e)
        {
            System.out.println("divide by zero");
        }
    }

    public void multipleCatch()
    {
        try
        {
            int arr[]={1,2};
            arr[2]=3/0;
        }
        catch(ArrayIndexOutOfBoundsException e)    //This block has to be before the superclass Exception.
        {
            System.out.println("array index out of bound exception");
        }
        catch(Exception e)    //This block handles all Exception so it has to be the last
        {
            System.out.println("Generic exception");
        }

    }


    public static void multipleCatch2()
    {
        try
        {
            int arr[]={1,2};
            arr[2]=3/0;
        }
        catch(ArithmeticException e)    //This block has to be before the superclass Exception.
        {
            System.out.println("divide by zero");
        }
        catch(Exception e)    //This block handles all Exception so it has to be the last
        {
            System.out.println("Generic exception");
        }

    }

}