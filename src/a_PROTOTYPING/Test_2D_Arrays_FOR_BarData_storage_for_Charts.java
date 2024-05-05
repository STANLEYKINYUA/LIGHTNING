package a_PROTOTYPING;

public class Test_2D_Arrays_FOR_BarData_storage_for_Charts
{
    public static void main(String[] args)
    {
        String Num = "2";
        System.out.println("2D Array Test");

        int number = Integer.parseInt(Num);

        MD_Array Array_2D = new MD_Array();

        //Print Out the Array
        Array_2D.Print_MD_Array("Printing Old Array");

        Array_2D.SHIFT_2D_Array_Values(1,7);

        //Print out the new Array.
        Array_2D.Print_MD_Array("Printing New Array");





    }


    static class MD_Array
    {
        //A 2D Array with 1000 rows and 5 Columns
        String Bar_Data_2D_Array[][] = new String[1000][3];

        public MD_Array()
        {

            //Create Variables to Add
            String A0  ="Bar 10";
            String A1  ="High 1956.20";
            String A2  ="Low  1955.30";

            String B0  ="Bar 11";
            String B1  ="High 1957.55";
            String B2  ="Low  1956.99";

            String C0  ="Bar 12";
            String C1  ="High 1960.66";
            String C2  ="Low  1952.22";


            //Add Variables direct into the Array.
            Bar_Data_2D_Array[0][0] = A0;
            Bar_Data_2D_Array[0][1] = A1;
            Bar_Data_2D_Array[0][2] = A2;

            Bar_Data_2D_Array[1][0] = B0;
            Bar_Data_2D_Array[1][1] = B1;
            Bar_Data_2D_Array[1][2] = B2;

            Bar_Data_2D_Array[2][0] = C0;
            Bar_Data_2D_Array[2][1] = C1;
            Bar_Data_2D_Array[2][2] = C2;

            //Print Out the Array to see Arrangement



            //Shift Array Elements to see whether it shifts

            //Print out new Array


        }

        void Print_MD_Array(String Message)
        {
            String Print_Message = Message;

            System.out.println("================================================================");
            System.out.println("PRINTING WITH PRINT FUNCTION");
            System.out.println(Print_Message);

            int i,j,k = 0;

            for(i = 0 ;  i<10 ; i++)
            {
                //Inner Loop to cycle between each array in the MD Array.
                for(j = 0; j<3; j++)
                {

                    System.out.print(Bar_Data_2D_Array[i][j]);
                    System.out.print("      ");

                }
                System.out.println("");
            }

            System.out.println("================================================================");

        }
        void SHIFT_2D_Array_Values(int Index_to_Shift_From , int Index_to_Shift_to)
        {
            int from = Index_to_Shift_From;
            int to   = Index_to_Shift_to;

            int i,j = 0 ;

            int Transfer_Array_Index = 0;
            int MD_Array_Index = 0;

            String[] Transfer_Array = new String[3];


            //Access elements individually and read values as Ints
            String Value1 = Bar_Data_2D_Array[from][Transfer_Array_Index];
            Transfer_Array[Transfer_Array_Index] = Value1;

            Transfer_Array_Index++;
            String Value2 = Bar_Data_2D_Array[from][Transfer_Array_Index];
            Transfer_Array[Transfer_Array_Index] = Value2;

            Transfer_Array_Index++;
            String Value3 = Bar_Data_2D_Array[from][Transfer_Array_Index];
            Transfer_Array[Transfer_Array_Index] = Value3;



            //Write Elements to new Location - Remembering to Convert to String
            MD_Array_Index =0;
            Bar_Data_2D_Array[to][MD_Array_Index] =Transfer_Array[MD_Array_Index];

            MD_Array_Index++;
            Bar_Data_2D_Array[to][MD_Array_Index] =Transfer_Array[MD_Array_Index];

            MD_Array_Index++;
            Bar_Data_2D_Array[to][MD_Array_Index] =Transfer_Array[MD_Array_Index];









        }


    }


}
