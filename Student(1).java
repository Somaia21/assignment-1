/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_person;


public class Student extends person {
 final String std_frshman="freshman";
 final String std_sophomore="sophomore";
 final String std_junior="junior";
 final String std_senior="senior";
 
 public Student( String name){
     super(name);
 }

 public String tostring(){
     return "Name" + getName()+"Class Name" + this.getClass().getName();
 }
 

    
}
