package MySimpleStack;

/**
 * Created by Julien on 23/11/2016.
 * class d'exception qui au final ne sert pas à grand chose mais pour l'exemple
 */
class EmptyStackException extends Exception {

    /**
     * Redefinition de la méthode toString de Exception
     * @return erreur si une stack est vide
     */
    public String toString(){
        return "La stack ne contiens aucun objet";
    }
}
