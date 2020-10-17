import java.lang.Math;

public class Radix {

      static void print( int[] list, String msj ) {

            System.out.print( msj );
            for( int i = 0; i < list.length; i++ ) {

                  System.out.print( list[ i ] + "  " );
            }
            System.out.println();
      }

      static int subKey( int val, int pos, int radix ) {

            int divisor = (int) Math.pow( 10, pos );
            return ( val / divisor ) % radix;
      }

      static void collect( int[] list, Queue_DLL[] list_queues, int radix ) {

            int index = 0;
            for( int i = 0; i < radix; i++ ) {
                  while( !list_queues[ i ].Queue_IsEmpty() ) {

                        int val = list_queues[ i ].Queue_Dequeue();
                        list[ index++ ] = val;
                  }
            }
      }

      static void RadixSort( int[] list, int tam, int numPos, int radix ) {

            Queue_DLL[] list_queues = new Queue_DLL[ radix ];
            for( int i = 0; i < radix; i++ ) list_queues[ i ]= new Queue_DLL();

            for( int i = 0; i < numPos; i++ ) {
                  for( int j = 0; j < tam; j++ ) {

                        int whichQ = subKey( list[ j ], i, radix );
                        list_queues[ whichQ ].Queue_Enqueue( list[ j ] );
                  }

                  collect( list, list_queues, radix );
            }
      }

      public static void main(String[] args) {
            
            int[] list = { 10, 601, 7890, 678, 27, 9, 1829 };
            print( list, "Lista antes: " );
            RadixSort( list, list.length, 4, 10 );
            print( list, "Lista despues: " );
      }
}
