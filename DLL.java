class Node {

      int valor;
      Node next;
      Node prev;

      Node( int val ) {

            this.valor = val;
            this.next = null;
            this.prev = null;
      }
}

class DLL {
      
      Node first;
      Node last;
      int len;

      DLL() {

            this.first = null;
            this.last = null;
            this.len = 0;
      }

      boolean DLL_InsertBack( int val ) {

            boolean done = false;
            Node n = new Node( val );

            if (this.first == null) {

                  this.first = n;
                  this.last = n;
                  done = true;
            } else {

                  this.last.next = n;
                  n.prev = this.last;
                  this.last = n;
                  done = true;
            }

            this.len++;

            return done;
      }

      int DLL_RemoveFront() {

            int valor = this.first.valor;

            if( this.first == this.last ) {

                  this.first = null;
                  this.last = null;
            } else {

                  Node tmp = this.first.next;
                  this.first = tmp;
                  this.first.prev = null;
            }

            this.len--;

            return valor;
      }     

      boolean DLL_IsEmpty() {
            return len == 0;
      }
}
