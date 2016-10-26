/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package righttriangle;

/**
 *
 * @author ardol7945
 */
/**Constructor
 * des: sets the default value for the instance variables hight and base
 * pre:none
 * post:Creates a Triangle object.Initializes hight and base
 */
public class Triangle {
    private double hight, base;
    public Triangle(double hight, double base){
        this.base = base;
        this.hight = hight;
        
    }
    /**Instance Method 
     * des:changes the instance variable base
     * pre:none
     * post:Changes the value of base to newBase
     */
    public void setBase(double newBase){
        base = newBase;
    }
    /**Instance Method 
     * des:changes the value of instance variable hight
     * pre:none
     * post:Changes the value of hight to newHight
     */
    public void setHight(double newHight){
        hight = newHight;
    }
    /**Instance Method 
     * des:Displays the hight
     * pre:none
     * post:returns the member variable hight
     */
    public double getHight(){
        return(hight);
    }
    /**Instance Method 
     * des:Displays the hight
     * pre:none
     * post:returns the member variable base
     */
    public double getBase(){
        return(base);
    }
    /**Instance Method 
     * des:finds area
     * pre:none
     * post:creates a new variable called area. Initializes it to base times hight divided by 2. returns area
     */
    public double area(){
        double area;
        area = (base*hight)/2;
        return area;
    }
    
   
}
