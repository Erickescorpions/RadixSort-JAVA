class Queue_DLL {

      DLL queue;

      Queue_DLL() {

            this.queue = new DLL();
      }

      boolean Queue_Enqueue( int val ) {

            return this.queue.DLL_InsertBack( val );
      }

      int Queue_Dequeue() {

            int val = this.queue.DLL_RemoveFront();
            return val;
      }

      boolean Queue_IsEmpty(){

            return this.queue.DLL_IsEmpty();
      }
}


