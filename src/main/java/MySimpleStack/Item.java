package MySimpleStack;

/**
 * Created by Julien on 23/11/2016.
 * class d'item
 */
public class Item {

    private Object value;

    public Item(Object value) {
        setValue(value);
    }

    /**
     * get de value un commentaire répondant à l'exigence 1
     * @return retour de la valeur de value
     */
    public Object getValue(){
        return value;
    }

    /**
     * setting de value
     * @param value
     *      La valeur de l'objet
     */
    private void setValue(Object value){
        this.value = value;
    }
}
