

    class StringDemo
    {

        public static void main(String arg[]){

            StringBuffer str = new StringBuffer( "WELCOME" );
            System.out.println( str );
            System.out.println( str.append( "to Java" ) );
            System.out.println( str );
            System.out.println(str.insert( 4, "Bull" ));
            System.out.println( str );
            System.out.println( str.delete( 4, 7 ) );
            System.out.println(str.reverse() );
            System.out.println( str.length());
            System.out.println( str.indexOf("WELCOME"));
            System.out.println( str.substring( 8 ) );
            System.out.println( str.subSequence( 11, 15 ) );

        }








    }





























}
