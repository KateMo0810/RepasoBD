/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

/**
 *
 * @author kathe
 */
public class FOREIGN_KEY extends Constraint{
    
    private Column referencedColumn;
    private ReferentialIntegretyRule onUpdate;
    private ReferentialIntegretyRule onDelete;
}
