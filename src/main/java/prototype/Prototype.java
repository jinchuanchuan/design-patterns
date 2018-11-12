package prototype;

/**
 * @description:
 * @author: jcc
 * @date: 2018-09-28 15:18
 * @Modified By:
 */
public abstract class Prototype implements Cloneable {
    public Prototype clone(){
        Prototype prototype = null;
        try{
            prototype = (Prototype)super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }
}
