/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.dmartínezc.a11;

/**
 *
 * @author danx_
 */
public class EDDMartínezCA11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deque deq = new Deque();
        deq.insertFirst('H');
        deq.insertLast('A');
        deq.insertLast('L');
        deq.insertFirst('!');
        deq.insertLast('L');
        deq.insertLast('O');
        System.out.println(deq.getFirst().getData());
        System.out.println(deq.getLast().getData());
        deq.eFirst();
        System.out.println(deq.getFirst().getData());
        System.out.println(deq.getsize());
        deq.eDeque();
        System.out.println(deq.getsize());
    }
    
}
