/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD2;

import java.util.List;

/**
 *
 * @author kathe
 */
public class Association {
    
    private String name;
    private Association xor;
    private List<Class> associationClass;
    private Role[] roles;
}
