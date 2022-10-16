/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author FT
 */
public class TuException extends Exception {

    /**
     * Creates a new instance of <code>TuException</code> without detail
     * message.
     */
    public TuException() {
    }

    /**
     * Constructs an instance of <code>TuException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public TuException(String msg) {
        super(msg);
    }
}
