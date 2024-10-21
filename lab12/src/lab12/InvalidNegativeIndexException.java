/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab12;

/**
 *
 * @author ayden
 */
public class InvalidNegativeIndexException extends Exception{
    public InvalidNegativeIndexException() {
        super("Error: The index cannot be negative.");
    }
}
